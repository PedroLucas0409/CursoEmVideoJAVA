/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author LU
 */
public class ResolucaoDaTela {
    public static void main(String[] args) {
            Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.println("Sua resolução de tela é " + d.width + "x" + d.height);
    }
  }

        
