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
public  class menuOpenFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            return file.isDirectory() || file.getAbsolutePath().endsWith(".bmp")|| file.getAbsolutePath().endsWith(".jpg")|| file.getAbsolutePath().endsWith(".tif");
        }
        @Override
        public String getDescription() {
            return "Podstawowe typy obrazów(*.jpg,*.bmp,*.tif)";
        }
    } 


//pobierz 3 pliki stad:
//https://stackoverflow.com/questions/25385966/reading-tiff-file-using-jai
//z pierwszej odpowiedzi
//kliknij na SIMP->properties>library->add libraries i dodaj te 3 pliki