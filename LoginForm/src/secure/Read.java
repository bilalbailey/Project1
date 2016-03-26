/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;

import jxl.Workbook;
import java.io.*;
import jxl.Cell;
import jxl.Sheet;


/**
 *
 * @author Bilal
 */
public class Read {
    public static void main(String[] args) throws Exception{
    
     
        File f;
        Sheet s;
        Workbook wb;
        int row;
        int col;
        f = new File("C:\test.xlsx");
        wb = Workbook.getWorkbook(f);
        s = wb.getSheet(0);
        row = s.getRows();
        col = s.getColumns();
        for (int i = 0; i < row; i++){
        
            for (int j =0; j < col; j++){        
                Cell c = s.getCell(j, i);
                System.out.println(c.getContents()+"\t\t");
                
            }
           System.out.println("");
    }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
