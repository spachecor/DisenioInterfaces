Public Class Form1
    'CERRAR VENTANA
    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles PictureBox1.Click
        End
    End Sub
    'MINIMIZAR VENTADA
    Private Sub PictureBox2_Click(sender As Object, e As EventArgs) Handles PictureBox2.Click
        WindowState = FormWindowState.Minimized
    End Sub

    Private Sub Label5_Click(sender As Object, e As EventArgs) Handles Label5.Click

    End Sub
    'BOTON PAUSA/PLAY
    Private Sub PictureBox3_Click(sender As Object, e As EventArgs) Handles PictureBox3.Click
        If ListBox1.Items.Count <> 0 Then
            If reproductor.playState = WMPLib.WMPPlayState.wmppsPlaying Then
                reproductor.Ctlcontrols.pause()
                PictureBox3.Image = Pic_play.Image
            ElseIf reproductor.playState = WMPLib.WMPPlayState.wmppsPaused Then
                reproductor.Ctlcontrols.play()
                PictureBox3.Image = Pic_pause.Image
            End If
        End If
    End Sub
    'BOTON AVANZAR CANCION
    Private Sub PictureBox5_Click(sender As Object, e As EventArgs) Handles PictureBox5.Click
        Try
            ListBox1.SelectedIndex += 1
            reproductor.URL = ListBox1.SelectedItem
        Catch ex As Exception
            ListBox1.SelectedIndex = 0
        End Try
    End Sub
    'BOTON RETROCEDER CANCION
    Private Sub PictureBox4_Click(sender As Object, e As EventArgs) Handles PictureBox4.Click
        Try
            If ListBox1.SelectedIndex <> 0 Then
                ListBox1.SelectedIndex -= 1
            End If
            reproductor.URL = ListBox1.SelectedItem
        Catch ex As Exception
            ListBox1.SelectedIndex = 0
        End Try
    End Sub
    'BARRA DE NAVEGACION POR LA CANCION, TRACKBAR DE LA CANCION
    Private Sub TrackBar1_Scroll(sender As Object, e As EventArgs) Handles TrackBar1.Scroll
        reproductor.Ctlcontrols.currentPosition = TrackBar1.Value
    End Sub
    'BOTON DE ABRIR NUEVO ARCHIVO
    Private Sub PictureBox6_Click(sender As Object, e As EventArgs) Handles PictureBox6.Click
        OpenFileDialog1.ShowDialog()
    End Sub
    'EL COMPORTAMIENTO DE CUANDO SE ABRE UN NUEVO ARCHIVO
    Private Sub OpenFileDialog1_FileOk(sender As Object, e As System.ComponentModel.CancelEventArgs) Handles OpenFileDialog1.FileOk
        For Each track As String In OpenFileDialog1.FileNames
            ListBox1.Items.Add(track)
            Dim NOMBRE
            NOMBRE = track
            NOMBRE = NOMBRE.Remove(0, NOMBRE.LastIndexOf("\") + 1)
            NOMBRE = NOMBRE.Substring(0, NOMBRE.LastIndexOf("."))
            ListBox2.Items.Add(NOMBRE)
            TextBox1.AutoCompleteCustomSource.Add(NOMBRE)
        Next
        If DialogResult.OK Then
            ListBox1.SetSelected(0, True)
        End If
    End Sub
    'LA LISTA 2
    Private Sub ListBox2_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ListBox2.SelectedIndexChanged
        Try
            ListBox1.SelectedIndex = ListBox2.SelectedIndex
        Catch ex As Exception

        End Try
    End Sub
    'LA LISTA 1
    Private Sub ListBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ListBox1.SelectedIndexChanged
        Try
            ListBox2.SelectedIndex = ListBox1.SelectedIndex
            reproductor.URL = ListBox1.SelectedItem
        Catch ex As Exception

        End Try
    End Sub
    'EL TIEMPO DE DURACION DE LAS CANCIONES
    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        Try
            ' Verifica que el reproductor y el medio actual no sean null
            If reproductor IsNot Nothing AndAlso reproductor.currentMedia IsNot Nothing Then
                Dim dur As Integer = reproductor.currentMedia.duration
                Label4.Text = (ListBox1.SelectedIndex + 1).ToString() & " de " & ListBox1.Items.Count.ToString()

                ' Verifica que se esté reproduciendo algo y que las posiciones no sean nulas
                If reproductor.Ctlcontrols IsNot Nothing Then
                    Label1.Text = reproductor.Ctlcontrols.currentPositionString
                    Label2.Text = reproductor.currentMedia.durationString
                    TrackBar1.Maximum = dur
                    TrackBar1.Value = reproductor.Ctlcontrols.currentPosition
                End If

                ' Verifica el estado de reproducción
                If reproductor.playState = WMPLib.WMPPlayState.wmppsStopped Then
                    If ListBox1.SelectedIndex <> ListBox1.Items.Count - 1 Then
                        ListBox1.SelectedIndex += 1
                    End If
                End If
            End If

        Catch ex As Exception
            ' Manejo de excepciones (puedes añadir un mensaje de error o algún logging)
        End Try
    End Sub

    'LO QUE OCURRE CUANDO SELECCIONAMOS EL REPRODUCTOR
    Private Sub PictureBox8_Click(sender As Object, e As EventArgs) Handles PictureBox8.Click, Button1.Click
        P_reproductor.BringToFront()
    End Sub
    'LO QUE OCURRE CUANDO SELECCIONAMOS LA LISTA MULTIMEDIA
    Private Sub PictureBox9_Click(sender As Object, e As EventArgs) Handles PictureBox9.Click, Button2.Click
        P_lista.BringToFront()
    End Sub
    'BALANCE
    Private Sub TrackBar2_Scroll(sender As Object, e As EventArgs) Handles TrackBar2.Scroll
        reproductor.settings.balance = TrackBar2.Value
    End Sub
    'VOLUMEN
    Private Sub TrackBar3_Scroll(sender As Object, e As EventArgs) Handles TrackBar3.Scroll
        reproductor.settings.volume = TrackBar3.Value
        Label10.Text = TrackBar3.Value
    End Sub
    'PARA PODER MOVEL LA VENTANA DE SITIO PARTE 1
    Dim x, y As Integer
    Dim newpoint As New Point
    Private Sub Panel1_MouseDown(sender As Object, e As MouseEventArgs) Handles Panel1.MouseDown
        x = Control.MousePosition.X - Me.Location.X
        y = Control.MousePosition.Y - Me.Location.Y
    End Sub
    'PARA PODER MOVEL LA VENTANA DE SITIO PARTE 2
    Private Sub Panel1_MouseMove(sender As Object, e As MouseEventArgs) Handles Panel1.MouseMove
        If e.Button = MouseButtons.Left Then
            newpoint = Control.MousePosition
            newpoint.X -= x
            newpoint.Y -= y
            Me.Location = newpoint
            Application.DoEvents()
        End If
    End Sub
    'BUSCADOR
    Private Sub PictureBox7_Click(sender As Object, e As EventArgs) Handles PictureBox7.Click
        Try
            If ListBox2.Items.Count <> 0 Then
                Dim returnValue As Boolean
                Dim comparisonType As StringComparison
                For i = ListBox2.Items.Count - 1 To 0 Step -1
                    returnValue = LCase(ListBox2.Items(i)).StartsWith(LCase(TextBox1.Text), comparisonType)
                    If returnValue = True Then
                        ListBox2.ClearSelected()
                        TextBox1.Focus()
                        ListBox2.SetSelected(i, True)
                        Exit Sub
                    End If
                Next
            End If
        Catch ex As Exception

        End Try
    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

    End Sub
End Class
