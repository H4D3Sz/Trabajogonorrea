import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Metodos {
    public LinkedList<Vehiculo> LlenarLista() {
        Boolean Continuar = true;
        LinkedList<Vehiculo> Lista = new LinkedList<>();
        String Marca;
        String Color;
        int Modelo;
        Double Precio;
        int Peso;
        int opt = 0;
        while (Continuar) {
            Marca = JOptionPane.showInputDialog(null, "Ingrese la marca");
            Color = JOptionPane.showInputDialog(null, "Ingrese el color");
            Modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modelo"));
            Precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio"));
            Peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso"));

            Vehiculo v = new Vehiculo(Marca, Color, Modelo, Precio, Peso);
            Lista.add(v);

            opt = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Desea seguir ingresando mas vahiculos 1: si, 2: no"));
            if (opt == 2) {
                Continuar = false;
            }
        }
        return Lista;

    }

    public void MostrarLista(LinkedList<Vehiculo> Lista) {
        for (Vehiculo item : Lista) {
            JOptionPane.showMessageDialog(null,
                    "Marca: " + item.getMarca() + "\n" + "Color: " + item.getColor() + "\n" + "Modelo: "
                            + item.getModelo() + "\n" + "Precio: " + item.getPrecio() + "\n" + "Peso: "
                            + item.getPeso());
        }
    }

}
