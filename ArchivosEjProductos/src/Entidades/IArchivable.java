/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author borda
 */
public interface IArchivable {
    void cargar(String ruta);
    ArrayList<Producto> buscarPorCategoria(String categoria);
    void guardarTXT(String Encabezado,String categoria);
}
