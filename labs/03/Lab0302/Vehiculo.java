import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

class Vehiculo {
    protected String placa;
    protected String tipo;
    protected Date fechaHoraIngreso;
    protected int numero;
    protected boolean haSalido;
    
    public Vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
        this.fechaHoraIngreso = new Date();
        this.numero = Parqueadero.generarNumeroVehiculo();
        this.haSalido = false;
    }
    


