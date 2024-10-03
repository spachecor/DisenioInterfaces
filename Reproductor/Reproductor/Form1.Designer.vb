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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Panel1 = New Panel()
        PictureBox2 = New PictureBox()
        PictureBox1 = New PictureBox()
        Panel2 = New Panel()
        PictureBox5 = New PictureBox()
        PictureBox4 = New PictureBox()
        PictureBox3 = New PictureBox()
        Panel6 = New Panel()
        TrackBar1 = New TrackBar()
        Label2 = New Label()
        Label1 = New Label()
        P_reproductor = New Panel()
        AxWindowsMediaPlayer1 = New AxWMPLib.AxWindowsMediaPlayer()
        P_list = New Panel()
        Lista = New Label()
        ListBox1 = New ListBox()
        ListBox2 = New ListBox()
        Panel3 = New Panel()
        Label3 = New Label()
        Panel1.SuspendLayout()
        CType(PictureBox2, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox1, ComponentModel.ISupportInitialize).BeginInit()
        Panel2.SuspendLayout()
        CType(PictureBox5, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox4, ComponentModel.ISupportInitialize).BeginInit()
        CType(PictureBox3, ComponentModel.ISupportInitialize).BeginInit()
        Panel6.SuspendLayout()
        CType(TrackBar1, ComponentModel.ISupportInitialize).BeginInit()
        P_reproductor.SuspendLayout()
        CType(AxWindowsMediaPlayer1, ComponentModel.ISupportInitialize).BeginInit()
        P_list.SuspendLayout()
        Panel3.SuspendLayout()
        SuspendLayout()
        ' 
        ' Panel1
        ' 
        Panel1.BackColor = Color.FromArgb(CByte(64), CByte(64), CByte(64))
        Panel1.Controls.Add(PictureBox2)
        Panel1.Controls.Add(PictureBox1)
        Panel1.Location = New Point(0, 0)
        Panel1.Name = "Panel1"
        Panel1.Size = New Size(259, 650)
        Panel1.TabIndex = 0
        ' 
        ' PictureBox2
        ' 
        PictureBox2.Image = CType(resources.GetObject("PictureBox2.Image"), Image)
        PictureBox2.Location = New Point(30, 0)
        PictureBox2.Name = "PictureBox2"
        PictureBox2.Size = New Size(24, 24)
        PictureBox2.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox2.TabIndex = 2
        PictureBox2.TabStop = False
        ' 
        ' PictureBox1
        ' 
        PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), Image)
        PictureBox1.Location = New Point(0, 0)
        PictureBox1.Name = "PictureBox1"
        PictureBox1.Size = New Size(24, 24)
        PictureBox1.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox1.TabIndex = 1
        PictureBox1.TabStop = False
        ' 
        ' Panel2
        ' 
        Panel2.BackColor = Color.Black
        Panel2.Controls.Add(PictureBox5)
        Panel2.Controls.Add(PictureBox4)
        Panel2.Controls.Add(PictureBox3)
        Panel2.Controls.Add(Panel6)
        Panel2.Location = New Point(258, 530)
        Panel2.Name = "Panel2"
        Panel2.Size = New Size(614, 120)
        Panel2.TabIndex = 1
        ' 
        ' PictureBox5
        ' 
        PictureBox5.Image = CType(resources.GetObject("PictureBox5.Image"), Image)
        PictureBox5.Location = New Point(345, 45)
        PictureBox5.Name = "PictureBox5"
        PictureBox5.Size = New Size(64, 64)
        PictureBox5.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox5.TabIndex = 5
        PictureBox5.TabStop = False
        ' 
        ' PictureBox4
        ' 
        PictureBox4.Image = CType(resources.GetObject("PictureBox4.Image"), Image)
        PictureBox4.Location = New Point(205, 45)
        PictureBox4.Name = "PictureBox4"
        PictureBox4.Size = New Size(64, 64)
        PictureBox4.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox4.TabIndex = 4
        PictureBox4.TabStop = False
        ' 
        ' PictureBox3
        ' 
        PictureBox3.Image = CType(resources.GetObject("PictureBox3.Image"), Image)
        PictureBox3.Location = New Point(275, 45)
        PictureBox3.Name = "PictureBox3"
        PictureBox3.Size = New Size(64, 64)
        PictureBox3.SizeMode = PictureBoxSizeMode.AutoSize
        PictureBox3.TabIndex = 3
        PictureBox3.TabStop = False
        ' 
        ' Panel6
        ' 
        Panel6.BackColor = Color.DimGray
        Panel6.Controls.Add(TrackBar1)
        Panel6.Controls.Add(Label2)
        Panel6.Controls.Add(Label1)
        Panel6.Location = New Point(0, 0)
        Panel6.Name = "Panel6"
        Panel6.Size = New Size(614, 23)
        Panel6.TabIndex = 2
        ' 
        ' TrackBar1
        ' 
        TrackBar1.Location = New Point(45, 2)
        TrackBar1.Name = "TrackBar1"
        TrackBar1.Size = New Size(521, 45)
        TrackBar1.TabIndex = 2
        ' 
        ' Label2
        ' 
        Label2.AutoSize = True
        Label2.BackColor = Color.DimGray
        Label2.Font = New Font("Segoe UI Semibold", 9.75F, FontStyle.Bold, GraphicsUnit.Point, CByte(0))
        Label2.ForeColor = Color.WhiteSmoke
        Label2.Location = New Point(572, 2)
        Label2.Name = "Label2"
        Label2.Size = New Size(39, 17)
        Label2.TabIndex = 1
        Label2.Text = "00:00"
        ' 
        ' Label1
        ' 
        Label1.AutoSize = True
        Label1.BackColor = Color.DimGray
        Label1.Font = New Font("Segoe UI Semibold", 9.75F, FontStyle.Bold, GraphicsUnit.Point, CByte(0))
        Label1.ForeColor = Color.WhiteSmoke
        Label1.Location = New Point(3, 2)
        Label1.Name = "Label1"
        Label1.Size = New Size(39, 17)
        Label1.TabIndex = 0
        Label1.Text = "00:00"
        ' 
        ' P_reproductor
        ' 
        P_reproductor.Controls.Add(AxWindowsMediaPlayer1)
        P_reproductor.Location = New Point(259, 0)
        P_reproductor.Name = "P_reproductor"
        P_reproductor.Size = New Size(613, 530)
        P_reproductor.TabIndex = 2
        ' 
        ' AxWindowsMediaPlayer1
        ' 
        AxWindowsMediaPlayer1.Enabled = True
        AxWindowsMediaPlayer1.Location = New Point(0, 0)
        AxWindowsMediaPlayer1.Name = "AxWindowsMediaPlayer1"
        AxWindowsMediaPlayer1.OcxState = CType(resources.GetObject("AxWindowsMediaPlayer1.OcxState"), AxHost.State)
        AxWindowsMediaPlayer1.Size = New Size(613, 577)
        AxWindowsMediaPlayer1.TabIndex = 0
        ' 
        ' P_list
        ' 
        P_list.Controls.Add(Panel3)
        P_list.Controls.Add(ListBox2)
        P_list.Controls.Add(ListBox1)
        P_list.Controls.Add(Lista)
        P_list.Location = New Point(259, 0)
        P_list.Name = "P_list"
        P_list.Size = New Size(613, 530)
        P_list.TabIndex = 3
        ' 
        ' Lista
        ' 
        Lista.AutoSize = True
        Lista.BackColor = Color.Black
        Lista.Font = New Font("Segoe UI", 20.25F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Lista.ForeColor = Color.White
        Lista.Location = New Point(13, 19)
        Lista.Name = "Lista"
        Lista.Size = New Size(71, 37)
        Lista.TabIndex = 0
        Lista.Text = "Lista"
        ' 
        ' ListBox1
        ' 
        ListBox1.BackColor = Color.Black
        ListBox1.BorderStyle = BorderStyle.None
        ListBox1.Font = New Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        ListBox1.ForeColor = Color.White
        ListBox1.FormattingEnabled = True
        ListBox1.ItemHeight = 20
        ListBox1.Location = New Point(13, 61)
        ListBox1.Name = "ListBox1"
        ListBox1.Size = New Size(589, 440)
        ListBox1.TabIndex = 1
        ' 
        ' ListBox2
        ' 
        ListBox2.BackColor = Color.Black
        ListBox2.BorderStyle = BorderStyle.None
        ListBox2.Font = New Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        ListBox2.ForeColor = Color.White
        ListBox2.FormattingEnabled = True
        ListBox2.ItemHeight = 20
        ListBox2.Location = New Point(13, 61)
        ListBox2.Name = "ListBox2"
        ListBox2.Size = New Size(589, 440)
        ListBox2.TabIndex = 2
        ' 
        ' Panel3
        ' 
        Panel3.BackgroundImage = CType(resources.GetObject("Panel3.BackgroundImage"), Image)
        Panel3.Controls.Add(Label3)
        Panel3.Location = New Point(90, 28)
        Panel3.Name = "Panel3"
        Panel3.Size = New Size(74, 28)
        Panel3.TabIndex = 3
        ' 
        ' Label3
        ' 
        Label3.AutoSize = True
        Label3.BackColor = Color.Transparent
        Label3.Font = New Font("Segoe UI", 9.0F, FontStyle.Regular, GraphicsUnit.Point, CByte(0))
        Label3.ForeColor = Color.White
        Label3.Location = New Point(17, 7)
        Label3.Name = "Label3"
        Label3.Size = New Size(38, 15)
        Label3.TabIndex = 0
        Label3.Text = "0 de 0"
        ' 
        ' Form1
        ' 
        AutoScaleDimensions = New SizeF(7.0F, 15.0F)
        AutoScaleMode = AutoScaleMode.Font
        BackColor = Color.Black
        ClientSize = New Size(873, 651)
        Controls.Add(P_list)
        Controls.Add(P_reproductor)
        Controls.Add(Panel2)
        Controls.Add(Panel1)
        FormBorderStyle = FormBorderStyle.None
        Name = "Form1"
        Text = "Form1"
        Panel1.ResumeLayout(False)
        Panel1.PerformLayout()
        CType(PictureBox2, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox1, ComponentModel.ISupportInitialize).EndInit()
        Panel2.ResumeLayout(False)
        Panel2.PerformLayout()
        CType(PictureBox5, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox4, ComponentModel.ISupportInitialize).EndInit()
        CType(PictureBox3, ComponentModel.ISupportInitialize).EndInit()
        Panel6.ResumeLayout(False)
        Panel6.PerformLayout()
        CType(TrackBar1, ComponentModel.ISupportInitialize).EndInit()
        P_reproductor.ResumeLayout(False)
        CType(AxWindowsMediaPlayer1, ComponentModel.ISupportInitialize).EndInit()
        P_list.ResumeLayout(False)
        P_list.PerformLayout()
        Panel3.ResumeLayout(False)
        Panel3.PerformLayout()
        ResumeLayout(False)
    End Sub

    Friend WithEvents Panel1 As Panel
    Friend WithEvents PictureBox2 As PictureBox
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents Panel2 As Panel
    Friend WithEvents Panel5 As Panel
    Friend WithEvents Panel4 As Panel
    Friend WithEvents Panel6 As Panel
    Friend WithEvents Label1 As Label
    Friend WithEvents TrackBar1 As TrackBar
    Friend WithEvents Label2 As Label
    Friend WithEvents PictureBox5 As PictureBox
    Friend WithEvents PictureBox4 As PictureBox
    Friend WithEvents PictureBox3 As PictureBox
    Friend WithEvents P_reproductor As Panel
    Friend WithEvents AxWindowsMediaPlayer1 As AxWMPLib.AxWindowsMediaPlayer
    Friend WithEvents P_list As Panel
    Friend WithEvents Lista As Label
    Friend WithEvents Panel3 As Panel
    Friend WithEvents ListBox2 As ListBox
    Friend WithEvents ListBox1 As ListBox
    Friend WithEvents Label3 As Label

End Class
