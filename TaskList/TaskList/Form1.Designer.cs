namespace TaskList
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            tableLayoutPanel1 = new TableLayoutPanel();
            tableLayoutPanel2 = new TableLayoutPanel();
            Eliminar = new Button();
            guardar = new Button();
            cargar = new Button();
            aniadir = new Button();
            lista = new ListBox();
            tarea = new RichTextBox();
            tableLayoutPanel1.SuspendLayout();
            tableLayoutPanel2.SuspendLayout();
            SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            tableLayoutPanel1.ColumnCount = 1;
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 100F));
            tableLayoutPanel1.Controls.Add(tableLayoutPanel2, 0, 2);
            tableLayoutPanel1.Controls.Add(lista, 0, 1);
            tableLayoutPanel1.Controls.Add(tarea, 0, 0);
            tableLayoutPanel1.Dock = DockStyle.Fill;
            tableLayoutPanel1.Location = new Point(0, 0);
            tableLayoutPanel1.Name = "tableLayoutPanel1";
            tableLayoutPanel1.RowCount = 3;
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 10F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 70F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 20F));
            tableLayoutPanel1.Size = new Size(617, 549);
            tableLayoutPanel1.TabIndex = 0;
            tableLayoutPanel1.Paint += tableLayoutPanel1_Paint;
            // 
            // tableLayoutPanel2
            // 
            tableLayoutPanel2.ColumnCount = 4;
            tableLayoutPanel2.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            tableLayoutPanel2.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            tableLayoutPanel2.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            tableLayoutPanel2.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            tableLayoutPanel2.Controls.Add(Eliminar, 1, 0);
            tableLayoutPanel2.Controls.Add(guardar, 2, 0);
            tableLayoutPanel2.Controls.Add(cargar, 3, 0);
            tableLayoutPanel2.Controls.Add(aniadir, 0, 0);
            tableLayoutPanel2.Dock = DockStyle.Fill;
            tableLayoutPanel2.Location = new Point(3, 441);
            tableLayoutPanel2.Name = "tableLayoutPanel2";
            tableLayoutPanel2.RowCount = 1;
            tableLayoutPanel2.RowStyles.Add(new RowStyle(SizeType.Percent, 100F));
            tableLayoutPanel2.Size = new Size(611, 105);
            tableLayoutPanel2.TabIndex = 0;
            // 
            // Eliminar
            // 
            Eliminar.Dock = DockStyle.Fill;
            Eliminar.Location = new Point(155, 3);
            Eliminar.Name = "Eliminar";
            Eliminar.Size = new Size(146, 99);
            Eliminar.TabIndex = 1;
            Eliminar.Text = "Eliminar";
            Eliminar.UseVisualStyleBackColor = true;
            Eliminar.Click += Eliminar_Click;
            // 
            // guardar
            // 
            guardar.Dock = DockStyle.Fill;
            guardar.Location = new Point(307, 3);
            guardar.Name = "guardar";
            guardar.Size = new Size(146, 99);
            guardar.TabIndex = 2;
            guardar.Text = "Guardar";
            guardar.UseVisualStyleBackColor = true;
            guardar.Click += guardar_Click;
            // 
            // cargar
            // 
            cargar.Dock = DockStyle.Fill;
            cargar.Location = new Point(459, 3);
            cargar.Name = "cargar";
            cargar.Size = new Size(149, 99);
            cargar.TabIndex = 3;
            cargar.Text = "Cargar";
            cargar.UseVisualStyleBackColor = true;
            cargar.Click += cargar_Click;
            // 
            // aniadir
            // 
            aniadir.Dock = DockStyle.Fill;
            aniadir.Location = new Point(3, 3);
            aniadir.Name = "aniadir";
            aniadir.Size = new Size(146, 99);
            aniadir.TabIndex = 4;
            aniadir.Text = "Añadir";
            aniadir.UseVisualStyleBackColor = true;
            aniadir.Click += aniadir_Click;
            // 
            // lista
            // 
            lista.Dock = DockStyle.Fill;
            lista.Font = new Font("Times New Roman", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lista.FormattingEnabled = true;
            lista.ItemHeight = 31;
            lista.Location = new Point(3, 57);
            lista.Name = "lista";
            lista.Size = new Size(611, 378);
            lista.TabIndex = 1;
            lista.SelectedIndexChanged += lista_SelectedIndexChanged;
            // 
            // tarea
            // 
            tarea.Dock = DockStyle.Fill;
            tarea.Font = new Font("Times New Roman", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            tarea.Location = new Point(3, 3);
            tarea.Name = "tarea";
            tarea.Size = new Size(611, 48);
            tarea.TabIndex = 2;
            tarea.Text = "";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(617, 549);
            Controls.Add(tableLayoutPanel1);
            Name = "Form1";
            Text = "Lista de tareas";
            tableLayoutPanel1.ResumeLayout(false);
            tableLayoutPanel2.ResumeLayout(false);
            ResumeLayout(false);
        }

        #endregion

        private TableLayoutPanel tableLayoutPanel1;
        private TableLayoutPanel tableLayoutPanel2;
        private Button Eliminar;
        private Button guardar;
        private Button cargar;
        private Button aniadir;
        private ListBox lista;
        private RichTextBox tarea;
    }
}
