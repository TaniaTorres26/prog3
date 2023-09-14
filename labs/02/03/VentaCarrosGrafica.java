/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro;

/**
 *
 * @author Tania
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

class Carro {
  String marca;
  String modelo;
  String color;
  int kilometraje;

  public Carro(String marca, String modelo, String color, int kilometraje) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.kilometraje = kilometraje;
  }

  @Override
  public String toString() {
    return "<html><b>" + marca + " " + modelo + "</b><br/>Color: " + color + "<br/>Kilometraje: " + kilometraje + " km</html>";
  }
}

public class VentaCarrosGrafica extends JFrame {
  private Carro[] carros;
  private final JList < Carro > list;

  public VentaCarrosGrafica() {
    setTitle("Catálogo de Vehículos");
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    JButton btnOrdenarModelo = new JButton("Ordenar por Modelo");
    JButton btnOrdenarKilometraje = new JButton("Ordenar por Kilometraje");

    DefaultListModel < Carro > model = new DefaultListModel < > ();
    list = new JList < > (model);
    list.setFont(new Font("Arial", Font.PLAIN, 14));
    JScrollPane scrollPane = new JScrollPane(list);
    
    JPanel btnPanel = new JPanel(new GridLayout(1, 2));
    btnPanel.add(btnOrdenarModelo);
    btnPanel.add(btnOrdenarKilometraje);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(scrollPane, BorderLayout.CENTER);
    getContentPane().add(btnPanel, BorderLayout.NORTH);

    Color fondo = new Color(255, 240, 219);
    Color botonColor = new Color(237, 108, 99);

    getContentPane().setBackground(fondo);
    btnPanel.setBackground(fondo);
    btnOrdenarModelo.setBackground(botonColor);
    btnOrdenarKilometraje.setBackground(botonColor);

    btnOrdenarModelo.addActionListener((ActionEvent e) -> {
        ordenarPorModelo();
    });

    btnOrdenarKilometraje.addActionListener((ActionEvent e) -> {
        ordenarPorKilometraje();
    });

    setVisible(true);
  }

  private void ordenarPorModelo() {
    Arrays.sort(carros, (c1, c2) -> c1.modelo.compareTo(c2.modelo));
    ordenar();
  }

  private void ordenarPorKilometraje() {
    Arrays.sort(carros, (c1, c2) -> Integer.compare(c1.kilometraje, c2.kilometraje));
    ordenar();
  }

  private void ordenar() {
    DefaultListModel < Carro > model = new DefaultListModel < > ();
    for (Carro carro: carros) {
      model.addElement(carro);
    }
    list.setModel(model);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        int cantidadCarros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de carros:"));
        Carro[] carros1 = new Carro[cantidadCarros];
        for (int i = 0; i < cantidadCarros; i++) {
            carros1[i] = new Carro(
                    JOptionPane.showInputDialog("Ingrese la marca del carro " + (i + 1) + ":"),
                    JOptionPane.showInputDialog("Ingrese el modelo del carro " + (i + 1) + ":"),
                    JOptionPane.showInputDialog("Ingrese el color del carro " + (i + 1) + ":"),
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del carro " + (i + 1) + ":"))
            );
        }
        VentaCarrosGrafica ej3 = new VentaCarrosGrafica();
        ej3.carros = carros1;
    });
  }
}

