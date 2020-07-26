package com.mycompany.persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

    public static void crearPersonaDB(Persona persona) {
        Coneccion con = new Coneccion();
        try (Connection cn = con.getConeccion()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO persona (nombre, profesion) VALUES (?,?)";
                ps = cn.prepareStatement(query);
                ps.setString(1, persona.getNombre());
                ps.setString(2, persona.getProfesion());
                ps.executeUpdate();
                System.out.println("Se reguistro la informacion");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerPersonaDB() {
        Coneccion cn = new Coneccion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection co = cn.getConeccion()) {
            String query = "SELECT * FROM persona";
            ps = co.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("------------------------");
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("NOMBRE: " + rs.getString("nombre"));
                System.out.println("PROFESION: " + rs.getString("profesion"));
                System.out.println("FECHA: " + rs.getString("fecha"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void editPersonaDB(Persona persona) {
        Coneccion cn=new Coneccion();
        try(Connection co=cn.getConeccion()){
            PreparedStatement ps=null;
            try{
                String query="UPDATE persona set profesion=? where id=?";
                ps=co.prepareStatement(query);
                ps.setString(1, persona.getProfesion());
                ps.setInt(2, persona.getCodigo());
                ps.executeUpdate();
                System.out.println("Se actualizo la profesion");
            }catch(SQLException e){
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void borrarPersonaDB(int id) {
        Coneccion cn=new Coneccion();
        try(Connection co=cn.getConeccion()){
            PreparedStatement ps=null;
            try{
                String query="DELETE FROM persona where id=?";
                ps=co.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("El registro fue eliminado");
            }catch(SQLException e){
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
