<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        components = New ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Panel1 = New Panel()
        Pic_play = New PictureBox()
        Pic_pause = New PictureBox()
        Label8 = New Label()
        Label9 = New Label()
        TrackBar3 = New TrackBar()
        Label10 = New Label()
        Label7 = New Label()
        Label6 = New Label()
        TrackBar2 = New TrackBar()
        Label5 = New Label()
        Label4 = New Label()
        Button2 = New Button()
        PictureBox9 = New PictureBox()
        Button1 = New Button()
        PictureBox8 = New PictureBox()
        PictureBox7 = New PictureBox()
        Panel5 = New Panel()
        TextBox1 = New TextBox()
        PictureBox2 = New PictureBox()
        PictureBox1 = New PictureBox()
        Panel2 = New Panel()
        PictureBox5 = New PictureBox()
        PictureBox4 = New PictureBox()
        PictureBox3 = New PictureBox()
        Panel3 = New Panel()
        TrackBar1 = New TrackBar()
        Label2 = New Label()
        Label1 = New Label()
        P_reproductor = New Panel()
        reproductor = New AxWMPLib.AxWindowsMediaPlayer()
        P_lista = New Panel()
        PictureBox6 = New PictureBox()
        ListBox2 = New ListBox()
        ListBox1 = New ListBox()
        lista_label = New Label()
        OpenFileDialog1 = New OpenFileDialog()
        Timer1 = New Timer(components)
        Panel1.SuspendLayout()
        CType(Pic_play, ComponentModel.ISupportInitialize).BeginInit()
        CType(Pic_pause, ComponentModel.ISupportInitialize).BeginInit()
        CType(TrackBar3, ComponentModel.ISupportInitialize).BeginInit()
        CType(TrackBar2, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox9, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox8, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox7, ComponentModel.ISupportInitialize).BeginInit()
        Panel5.SuspendLayout()
        CType(PictureBox2, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox1, ComponentModel.ISupportInitialize).BeginInit()
        Panel2.SuspendLayout()
        CType(PictureBox5, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox4, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox3, ComponentModel.ISupportInitialize).BeginInit()
        Panel3.SuspendLayout()
        CType(TrackBar1, ComponentModel.ISupportInitialize).BeginInit()
        P_reproductor.SuspendLayout()
        CType(reproductor, ComponentModel.ISupportInitialize).BeginInit()
        P_lista.SuspendLayout()
        CType(PictureBox6, ComponentModel.ISupportInitialize).BeginInit()
        SuspendLayout()
        ' 
        ' Panel1
        ' 
        Panel1.BackColor = Color.FromArgb(CByte(45), CByte(45), CByte(45))
        Panel1.Controls.Add(Pic_play)
        Panel1.Controls.Add(Pic_pause)
        Panel1.Controls.Add(Label8)
        Panel1.Controls.Add(Label9)
        Panel1.Controls.Add(TrackBar3)
        Panel1.Controls.Add(Label10)
        Panel1.Controls.Add(Label7)
        Panel1.Controls.Add(Label6)
        Panel1.Controls.Add(TrackBar2)
        Panel1.Controls.Add(Label5)
        Panel1.Controls.Add(Label4)
        Panel1.Controls.Add(Button2)
        Panel1.Controls.Add(PictureBox9)
        Panel1.Controls.Add(Button1)
        Panel1.Controls.Add(PictureBox8)
        Panel1.Controls.Add(PictureBox7)
        Panel1.Controls.Add(Panel5)
        Panel1.Controls.Add(PictureBox2)
        Panel1.Controls.Add(PictureBox1)
        Panel1.Location = New Point(0, 0)
        Panel1.Name = "Panel1"
        Panel1.Size = New Size(259, 651)
        Panel1.TabIndex = 0
        ' 
        ' Pic_play
        ' 
        Pic_play.Image = CType(resources.GetObject("Pic_play.Image"), Image)
        Pic_play.Location = New Point(151, 270)
        Pic_play.Name = "Pic_play"
        Pic_play.Size = New Size(64, 64)
        Pic_play.SizeMode = PictureBoxSizeMode.AutoSize
        Pic_play.TabIndex = 18
        Pic_play.TabStop = False
        Pic_play.Visible = False
        ' 
        ' Pic_pause
        ' 
        Pic_pause.Image = CType(resources.GetObject("Pic_pause.Image"), Image)
        Pic_pause.Location = New Point(151, 270)
        Pic_pause.Name = "Pic_pause"
        Pic_pause.Size = New Size(64, 64)
        Pic_pause.SizeMode = PictureBoxSizeMode.AutoSize
        Pic_pause.TabIndex = 17
        Pic_pause.TabStop = False
        Pic_pause.Visible = False
        ' 
        ' Label8
        ' 
        Label8.AutoSize = True
        Label8.Font = New Font("Segoe UI", 18F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Label8.ForeColor = Color.White
        Label8.Location = New Point(12, 585)
        Label8.Name = "Label8"
        Label8.Size = New Size(27, 32)
        Label8.TabIndex = 16
        Label8.Text = "0"
        ' 
        ' Label9
        ' 
        Label9.AutoSize = True
        Label9.Font = New Font("Segoe UI", 18F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Label9.ForeColor = Color.White
        Label9.Location = New Point(206, 585)
        Label9.Name = "Label9"
        Label9.Size = New Size(40, 32)
        Label9.TabIndex = 15
        Label9.Text = "70"
        ' 
        ' TrackBar3
        ' 
        TrackBar3.Location = New Point(12, 554)
        TrackBar3.Maximum = 100
        TrackBar3.Name = "TrackBar3"
        TrackBar3.Size = New Size(222, 45)
        TrackBar3.TabIndex = 14
        TrackBar3.TickFrequency = 10
        TrackBar3.TickStyle = TickStyle.None
        TrackBar3.Value = 70
        ' 
        ' Label10
        ' 
        Label10.AutoSize = True
        Label10.Font = New Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Label10.ForeColor = Color.White
        Label10.Location = New Point(12, 522)
        Label10.Name = "Label10"
        Label10.Size = New Size(72, 21)
        Label10.TabIndex = 13
        Label10.Text = "Volumen"
        ' 
        ' Label7
        ' 
        Label7.AutoSize = True
        Label7.Font = New Font("Segoe UI", 18F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Label7.ForeColor = Color.White
        Label7.Location = New Point(12, 475)
        Label7.Name = "Label7"
        Label7.Size = New Size(25, 32)
        Label7.TabIndex = 12
        Label7.Text = "L"
        ' 
        ' Label6
        ' 
        Label6.AutoSize = True
        Label6.Font = New Font("Segoe UI", 18F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Label6.ForeColor = Color.White
        Label6.Location = New Point(206, 475)
        Label6.Name = "Label6"
        Label6.Size = New Size(28, 32)
        Label6.TabIndex = 11
        Label6.Text = "R"
        ' 
        ' TrackBar2
        ' 
        TrackBar2.Location = New Point(12, 444)
        TrackBar2.Maximum = 100
        TrackBar2.Minimum = -100
        TrackBar2.Name = "TrackBar2"
        TrackBar2.Size = New Size(222, 45)
        TrackBar2.TabIndex = 10
        TrackBar2.TickFrequency = 100
        ' 
        ' Label5
        ' 
        Label5.AutoSize = True
        Label5.Font = New Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Label5.ForeColor = Color.White
        Label5.Location = New Point(12, 412)
        Label5.Name = "Label5"
        Label5.Size = New Size(63, 21)
        Label5.TabIndex = 9
        Label5.Text = "Balance"
        ' 
        ' Label4
        ' 
        Label4.AutoSize = True
        Label4.Font = New Font("Segoe UI", 15.75F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Label4.ForeColor = Color.White
        Label4.Location = New Point(12, 359)
        Label4.Name = "Label4"
        Label4.Size = New Size(143, 30)
        Label4.TabIndex = 8
        Label4.Text = "Configuración"
        ' 
        ' Button2
        ' 
        Button2.FlatAppearance.BorderSize = 0
        Button2.FlatStyle = FlatStyle.Flat
        Button2.Font = New Font("Segoe UI", 9.75F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Button2.ForeColor = Color.White
        Button2.Location = New Point(80, 180)
        Button2.Name = "Button2"
        Button2.Size = New Size(154, 48)
        Button2.TabIndex = 7
        Button2.Text = "Lista de multimedia"
        Button2.TextAlign = ContentAlignment.MiddleLeft
        Button2.UseVisualStyleBackColor = True
        ' 
        ' PictureBox9
        ' 
        PictureBox9.Image = CType(resources.GetObject("PictureBox9.Image"), Image)
        PictureBox9.Location = New Point(26, 180)
        PictureBox9.Name = "PictureBox9"
        PictureBox9.Size = New Size(48, 48)
        PictureBox9.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox9.TabIndex = 6
        PictureBox9.TabStop = False
        ' 
        ' Button1
        ' 
        Button1.FlatAppearance.BorderSize = 0
        Button1.FlatStyle = FlatStyle.Flat
        Button1.Font = New Font("Segoe UI", 9.75F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Button1.ForeColor = Color.White
        Button1.Location = New Point(80, 107)
        Button1.Name = "Button1"
        Button1.Size = New Size(154, 48)
        Button1.TabIndex = 5
        Button1.Text = "Reproductor"
        Button1.TextAlign = ContentAlignment.MiddleLeft
        Button1.UseVisualStyleBackColor = True
        ' 
        ' PictureBox8
        ' 
        PictureBox8.Image = CType(resources.GetObject("PictureBox8.Image"), Image)
        PictureBox8.Location = New Point(26, 107)
        PictureBox8.Name = "PictureBox8"
        PictureBox8.Size = New Size(48, 48)
        PictureBox8.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox8.TabIndex = 4
        PictureBox8.TabStop = False
        ' 
        ' PictureBox7
        ' 
        PictureBox7.Image = CType(resources.GetObject("PictureBox7.Image"), Image)
        PictureBox7.Location = New Point(232, 56)
        PictureBox7.Name = "PictureBox7"
        PictureBox7.Size = New Size(24, 24)
        PictureBox7.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox7.TabIndex = 3
        PictureBox7.TabStop = False
        ' 
        ' Panel5
        ' 
        Panel5.BackgroundImage = CType(resources.GetObject("Panel5.BackgroundImage"), Image)
        Panel5.Controls.Add(TextBox1)
        Panel5.Location = New Point(18, 55)
        Panel5.Name = "Panel5"
        Panel5.Size = New Size(208, 25)
        Panel5.TabIndex = 2
        ' 
        ' TextBox1
        ' 
        TextBox1.AutoCompleteMode = AutoCompleteMode.Append
        TextBox1.BackColor = Color.FromArgb(CByte(36), CByte(36), CByte(36))
        TextBox1.ForeColor = Color.White
        TextBox1.Location = New Point(3, 1)
        TextBox1.Name = "TextBox1"
        TextBox1.Size = New Size(205, 23)
        TextBox1.TabIndex = 0
        ' 
        ' PictureBox2
        ' 
        PictureBox2.Image = CType(resources.GetObject("PictureBox2.Image"), Image)
        PictureBox2.Location = New Point(30, 0)
        PictureBox2.Name = "PictureBox2"
        PictureBox2.Size = New Size(24, 24)
        PictureBox2.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox2.TabIndex = 1
        PictureBox2.TabStop = False
        ' 
        ' PictureBox1
        ' 
        PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), Image)
        PictureBox1.Location = New Point(0, 0)
        PictureBox1.Name = "PictureBox1"
        PictureBox1.Size = New Size(24, 24)
        PictureBox1.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox1.TabIndex = 0
        PictureBox1.TabStop = False
        ' 
        ' Panel2
        ' 
        Panel2.Controls.Add(PictureBox5)
        Panel2.Controls.Add(PictureBox4)
        Panel2.Controls.Add(PictureBox3)
        Panel2.Controls.Add(Panel3)
        Panel2.Location = New Point(258, 530)
        Panel2.Name = "Panel2"
        Panel2.Size = New Size(614, 120)
        Panel2.TabIndex = 1
        ' 
        ' PictureBox5
        ' 
        PictureBox5.Image = CType(resources.GetObject("PictureBox5.Image"), Image)
        PictureBox5.Location = New Point(343, 45)
        PictureBox5.Name = "PictureBox5"
        PictureBox5.Size = New Size(64, 64)
        PictureBox5.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox5.TabIndex = 3
        PictureBox5.TabStop = False
        ' 
        ' PictureBox4
        ' 
        PictureBox4.Image = CType(resources.GetObject("PictureBox4.Image"), Image)
        PictureBox4.Location = New Point(203, 45)
        PictureBox4.Name = "PictureBox4"
        PictureBox4.Size = New Size(64, 64)
        PictureBox4.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox4.TabIndex = 2
        PictureBox4.TabStop = False
        ' 
        ' PictureBox3
        ' 
        PictureBox3.Image = CType(resources.GetObject("PictureBox3.Image"), Image)
        PictureBox3.Location = New Point(273, 45)
        PictureBox3.Name = "PictureBox3"
        PictureBox3.Size = New Size(64, 64)
        PictureBox3.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox3.TabIndex = 1
        PictureBox3.TabStop = False
        ' 
        ' Panel3
        ' 
        Panel3.BackColor = Color.DimGray
        Panel3.Controls.Add(TrackBar1)
        Panel3.Controls.Add(Label2)
        Panel3.Controls.Add(Label1)
        Panel3.Location = New Point(0, 0)
        Panel3.Name = "Panel3"
        Panel3.Size = New Size(614, 23)
        Panel3.TabIndex = 0
        ' 
        ' TrackBar1
        ' 
        TrackBar1.Location = New Point(40, 1)
        TrackBar1.Name = "TrackBar1"
        TrackBar1.Size = New Size(534, 45)
        TrackBar1.TabIndex = 2
        ' 
        ' Label2
        ' 
        Label2.AutoSize = True
        Label2.ForeColor = Color.White
        Label2.Location = New Point(580, 0)
        Label2.Name = "Label2"
        Label2.Size = New Size(34, 15)
        Label2.TabIndex = 1
        Label2.Text = "00:00"
        ' 
        ' Label1
        ' 
        Label1.AutoSize = True
        Label1.ForeColor = Color.White
        Label1.Location = New Point(0, 0)
        Label1.Name = "Label1"
        Label1.Size = New Size(34, 15)
        Label1.TabIndex = 0
        Label1.Text = "00:00"
        ' 
        ' P_reproductor
        ' 
        P_reproductor.Controls.Add(reproductor)
        P_reproductor.Location = New Point(259, 0)
        P_reproductor.Name = "P_reproductor"
        P_reproductor.Size = New Size(613, 530)
        P_reproductor.TabIndex = 2
        ' 
        ' reproductor
        ' 
        reproductor.Enabled = True
        reproductor.Location = New Point(0, 0)
        reproductor.Name = "reproductor"
        reproductor.OcxState = CType(resources.GetObject("reproductor.OcxState"), AxHost.State)
        reproductor.Size = New Size(613, 577)
        reproductor.TabIndex = 0
        ' 
        ' P_lista
        ' 
        P_lista.Controls.Add(PictureBox6)
        P_lista.Controls.Add(ListBox2)
        P_lista.Controls.Add(ListBox1)
        P_lista.Controls.Add(lista_label)
        P_lista.Location = New Point(259, 0)
        P_lista.Name = "P_lista"
        P_lista.Size = New Size(613, 530)
        P_lista.TabIndex = 3
        ' 
        ' PictureBox6
        ' 
        PictureBox6.Image = CType(resources.GetObject("PictureBox6.Image"), Image)
        PictureBox6.Location = New Point(562, 3)
        PictureBox6.Name = "PictureBox6"
        PictureBox6.Size = New Size(48, 48)
        PictureBox6.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox6.TabIndex = 4
        PictureBox6.TabStop = False
        ' 
        ' ListBox2
        ' 
        ListBox2.BackColor = Color.FromArgb(CByte(36), CByte(36), CByte(36))
        ListBox2.BorderStyle = BorderStyle.None
        ListBox2.Font = New Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        ListBox2.ForeColor = Color.White
        ListBox2.FormattingEnabled = True
        ListBox2.ItemHeight = 20
        ListBox2.Location = New Point(34, 89)
        ListBox2.Name = "ListBox2"
        ListBox2.Size = New Size(546, 400)
        ListBox2.TabIndex = 2
        ' 
        ' ListBox1
        ' 
        ListBox1.BackColor = Color.FromArgb(CByte(36), CByte(36), CByte(36))
        ListBox1.BorderStyle = BorderStyle.None
        ListBox1.Font = New Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        ListBox1.ForeColor = Color.White
        ListBox1.FormattingEnabled = True
        ListBox1.ItemHeight = 20
        ListBox1.Location = New Point(34, 89)
        ListBox1.Name = "ListBox1"
        ListBox1.Size = New Size(546, 400)
        ListBox1.TabIndex = 1
        ' 
        ' lista_label
        ' 
        lista_label.AutoSize = True
        lista_label.Font = New Font("Segoe UI", 20.25F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        lista_label.ForeColor = Color.White
        lista_label.Location = New Point(21, 16)
        lista_label.Name = "lista_label"
        lista_label.Size = New Size(71, 37)
        lista_label.TabIndex = 0
        lista_label.Text = "Lista"
        ' 
        ' OpenFileDialog1
        ' 
        OpenFileDialog1.Multiselect = True
        OpenFileDialog1.Title = "Abrir Canción"
        ' 
        ' Timer1
        ' 
        Timer1.Enabled = True
        Timer1.Interval = 1
        ' 
        ' Form1
        ' 
        AutoScaleDimensions = New SizeF(7F, 15F)
        AutoScaleMode = AutoScaleMode.Font
        BackColor = Color.FromArgb(CByte(36), CByte(36), CByte(36))
        ClientSize = New Size(873, 651)
        Controls.Add(P_lista)
        Controls.Add(P_reproductor)
        Controls.Add(Panel2)
        Controls.Add(Panel1)
        FormBorderStyle = FormBorderStyle.None
        Name = "Form1"
        Text = "Form1"
        Panel1.ResumeLayout(False)
        Panel1.PerformLayout()
        CType(Pic_play, ComponentModel.ISupportInitialize).EndInit()
        CType(Pic_pause, ComponentModel.ISupportInitialize).EndInit()
        CType(TrackBar3, ComponentModel.ISupportInitialize).EndInit()
        CType(TrackBar2, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox9, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox8, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox7, ComponentModel.ISupportInitialize).EndInit()
        Panel5.ResumeLayout(False)
        Panel5.PerformLayout()
        CType(PictureBox2, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox1, ComponentModel.ISupportInitialize).EndInit()
        Panel2.ResumeLayout(False)
        Panel2.PerformLayout()
        CType(PictureBox5, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox4, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox3, ComponentModel.ISupportInitialize).EndInit()
        Panel3.ResumeLayout(False)
        Panel3.PerformLayout()
        CType(TrackBar1, ComponentModel.ISupportInitialize).EndInit()
        P_reproductor.ResumeLayout(False)
        CType(reproductor, ComponentModel.ISupportInitialize).EndInit()
        P_lista.ResumeLayout(False)
        P_lista.PerformLayout()
        CType(PictureBox6, ComponentModel.ISupportInitialize).EndInit()
        ResumeLayout(False)
    End Sub

    Friend WithEvents Panel1 As Panel
    Friend WithEvents PictureBox2 As PictureBox
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents Panel2 As Panel
    Friend WithEvents Panel3 As Panel
    Friend WithEvents TrackBar1 As TrackBar
    Friend WithEvents Label2 As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents PictureBox5 As PictureBox
    Friend WithEvents PictureBox4 As PictureBox
    Friend WithEvents PictureBox3 As PictureBox
    Friend WithEvents P_reproductor As Panel
    Friend WithEvents reproductor As AxWMPLib.AxWindowsMediaPlayer
    Friend WithEvents P_lista As Panel
    Friend WithEvents lista_label As Label
    Friend WithEvents ListBox2 As ListBox
    Friend WithEvents ListBox1 As ListBox
    Friend WithEvents Panel5 As Panel
    Friend WithEvents PictureBox6 As PictureBox
    Friend WithEvents Button2 As Button
    Friend WithEvents PictureBox9 As PictureBox
    Friend WithEvents Button1 As Button
    Friend WithEvents PictureBox8 As PictureBox
    Friend WithEvents PictureBox7 As PictureBox
    Friend WithEvents TextBox1 As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label8 As Label
    Friend WithEvents Label9 As Label
    Friend WithEvents TrackBar3 As TrackBar
    Friend WithEvents Label10 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents TrackBar2 As TrackBar
    Friend WithEvents Pic_play As PictureBox
    Friend WithEvents Pic_pause As PictureBox
    Friend WithEvents OpenFileDialog1 As OpenFileDialog
    Friend WithEvents Timer1 As Timer

End Class
