/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author csqueiroz
 */
public class MainFrameBar extends JMenuBar{
    
    private JMenu criarFicha;
    private JMenuItem dtFicha; //3D&TFicha
    
    public MainFrameBar() {
        inicializacaoMenus();
        adicionandoAcoes();
        montandoMenu();
    }

    private void montandoMenu() {
        criarFicha.add(dtFicha);
        
        this.add(criarFicha);
    }

    public void inicializacaoMenus() {
        criarFicha = new JMenu("Criar Ficha");
        dtFicha = new JMenuItem("3D&T");
        
    }

    public void adicionandoAcoes() {
        
    }
}
