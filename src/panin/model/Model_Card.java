/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panin.model;

import javax.swing.Icon;

/**
 *
 * @author Eliannis
 */
public class Model_Card {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descripcion) {
        this.description = descripcion;
    }

    public Model_Card() {
    }

    public Model_Card(Icon icon, String title, String values, String descripcion) {
        this.icon = icon;
        this.title = title;
        this.values = values;
        this.description = descripcion;
    }
    
    
    Icon icon ;
    String title;
    String values;
    String description;
    
}
