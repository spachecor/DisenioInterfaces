namespace TaskList
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }
        private void aniadir_Click(object sender, EventArgs e)
        {
            if(tarea.Text == "")
            {
                MessageBox.Show("Para agregar una tarea, debes escribir una tarea", "ERROR", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                lista.Items.Add(tarea.Text);
            }
            tarea.Clear();
        }

        private void Eliminar_Click(object sender, EventArgs e)
        {
            if (lista.SelectedItems != null)
            {
                lista.Items.Remove(lista.SelectedItem);
            }
        }
        private void guardar_Click(object sender, EventArgs e)
        {
            //abrimos un cuadro de dialogo para guardar el archivo txt
            using (SaveFileDialog saveFileDialog = new SaveFileDialog())
            {
                //ajustamos el filtro para tipos de archivo(en este caso txt o cualquiera)
                saveFileDialog.Filter = "Text files (*.txt)|*.txt|All files (*.*)|*.*";
                //ajustamos el titulo del cuadro de dialogo
                saveFileDialog.Title = "Save tasks to a file";
                if (saveFileDialog.ShowDialog() == DialogResult.OK)
                {
                    //si el usuario selecciona "OK", guardamos las tareas en el archivo
                    using (StreamWriter writer = new StreamWriter(saveFileDialog.FileName))
                    {
                        foreach (var item in lista.Items)
                        {
                            //escribimos cada tarea en una línea del archivo
                            writer.WriteLine(item.ToString());
                        }
                    }
                }
            }
            lista.Items.Clear();
        }
        private void cargar_Click(object sender, EventArgs e)
        {
            //abrimos un cuadro de diálogo para abrir un archivo txt
            using (OpenFileDialog openFileDialog = new OpenFileDialog())
            {
                //ajustamos el filtro para tipos de archivo(en este caso, txt o cualquiera)
                openFileDialog.Filter = "Text files (*.txt)|*.txt|All files (*.*)|*.*";
                //modificamos el titulo del cuadro de diálogo
                openFileDialog.Title = "Open tasks file";
                if (openFileDialog.ShowDialog() == DialogResult.OK)
                {
                    //limpiamos la lista de tareas
                    lista.Items.Clear();
                    //si el usuario selecciona "OK", cargamos las tareas desde el archivo
                    using (StreamReader reader = new StreamReader(openFileDialog.FileName))
                    {
                        string line;
                        while ((line = reader.ReadLine()) != null)
                        {
                            //añadimos cada línea del archivo como una tarea en la lista
                            lista.Items.Add(line);
                        }
                    }
                }
            }
        }

        private void lista_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

    }
}
