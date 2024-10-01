Public Class Form1
    Dim Operacion As String
    Dim ValorResultado As Nullable(Of Double) = Nothing
    Dim Valor2 As Nullable(Of Double) = Nothing
    Dim SePresionaOperador As Boolean
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub TableLayoutPanel1_Paint(sender As Object, e As PaintEventArgs) Handles TableLayoutPanel1.Paint

    End Sub

    Private Sub RichTextBox1_TextChanged(sender As Object, e As EventArgs) Handles RichTextBox1.TextChanged

    End Sub

    Private Sub Button13_Click(sender As Object, e As EventArgs) Handles Button13.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "0"
    End Sub

    Private Sub Button15_Click(sender As Object, e As EventArgs) Handles Button15.Click
        EvaluayHazOperacion()
        Operacion = ""
    End Sub

    Private Sub Button9_Click(sender As Object, e As EventArgs) Handles Button9.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "1"
    End Sub

    Private Sub Button10_Click(sender As Object, e As EventArgs) Handles Button10.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "2"
    End Sub

    Private Sub Button6_Click(sender As Object, e As EventArgs) Handles Button6.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "5"
    End Sub

    Private Sub Button8_Click(sender As Object, e As EventArgs) Handles Button8.Click
        EvaluayHazOperacion()
        Operacion = "*"
    End Sub

    Private Sub Button7_Click(sender As Object, e As EventArgs) Handles Button7.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "6"
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "7"
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "8"
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "9"
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "4"
    End Sub

    Private Sub Button11_Click(sender As Object, e As EventArgs) Handles Button11.Click
        ExaluaRestriccionesParaConcatenar()
        RichTextBox1.Text &= "3"
    End Sub

    Private Sub Button14_Click(sender As Object, e As EventArgs) Handles Button14.Click
        If InStr(RichTextBox1.Text, ".", CompareMethod.Text) = 0 Then
            RichTextBox1.Text &= "."
        End If
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        EvaluayHazOperacion()
        Operacion = "/"
    End Sub

    Private Sub Button12_Click(sender As Object, e As EventArgs) Handles Button12.Click
        EvaluayHazOperacion()
        Operacion = "-"
    End Sub

    Private Sub Button16_Click(sender As Object, e As EventArgs) Handles Button16.Click
        EvaluayHazOperacion()
        Operacion = "+"
    End Sub

    Private Sub Button17_Click(sender As Object, e As EventArgs) Handles Button17.Click
        RichTextBox1.Text = "0"
        Valor2 = Nothing
        ValorResultado = Nothing
    End Sub

    Public Sub EvaluayHazOperacion()
        SePresionaOperador = True
        Valor2 = Val(RichTextBox1.Text)
        If ValorResultado IsNot Nothing Then
            Select Case Operacion
                Case "+"
                    ValorResultado += Valor2
                Case "-"
                    ValorResultado -= Valor2
                Case "*"
                    ValorResultado *= Valor2
                Case "/"
                    ValorResultado /= Valor2
            End Select
            RichTextBox1.Text = ValorResultado
        Else
            ValorResultado = Valor2
        End If
    End Sub
    Public Sub ExaluaRestriccionesParaConcatenar()
        If SePresionaOperador = True Then
            RichTextBox1.Text = ""
            SePresionaOperador = False
        ElseIf RichTextBox1.Text = "0" Then
            RichTextBox1.Text = ""
        End If
    End Sub
End Class
