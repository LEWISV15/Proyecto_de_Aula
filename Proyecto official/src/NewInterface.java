import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewInterface extends JFrame {

    private DefaultTableModel modelo;
    private JTable tabla;
    private JButton jugarButton;

    public NewInterface() {
        setTitle("Tabla de Clasificación de Fútbol");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        modelo = new DefaultTableModel();
        tabla = new JTable(modelo);

        // Agregar las columnas a la tabla
        modelo.addColumn("Equipo");
        modelo.addColumn("Partidos Jugados");
        modelo.addColumn("Partidos Ganados");
        modelo.addColumn("Partidos Perdidos");

        // Agregar filas con valores iniciales
        agregarEquipo("Equipo 1");
        agregarEquipo("Equipo 2");
        agregarEquipo("Equipo 3");

        // Botón "Jugar"
        jugarButton = new JButton("Jugar");
        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumarPartidoJugado();
            }
        });

        // Configurar el diseño de la ventana
        setLayout(new java.awt.BorderLayout());
        add(new JScrollPane(tabla), java.awt.BorderLayout.CENTER);
        add(jugarButton, java.awt.BorderLayout.SOUTH);

        setVisible(true);
    }

    private void agregarEquipo(String nombreEquipo) {
        Object[] fila = {nombreEquipo, 0, 0, 0};
        modelo.addRow(fila);
    }

    private void sumarPartidoJugado() {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            int partidosJugados = (int) modelo.getValueAt(i, 1);
            modelo.setValueAt(partidosJugados + 1, i, 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewInterface();
            }
        });
    }
}

