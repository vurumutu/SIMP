/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simp;

import java.io.File;

/**
 *
 * @author Wojcisz
 */
public  class menuCloseFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            return file.isDirectory() || file.getAbsolutePath().endsWith(".png");
        }
        @Override
        public String getDescription() {
            return "Portable Network Graphics (*.png)";
        }
    } 