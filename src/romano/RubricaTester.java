/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romano;

/**
 *
 * @author roman
 */
public class RubricaTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        if(rubrica.isEmpty()) System.out.println("E' vuota");
        Object num = 123456;
        Object num1 = "1214354";
        int num2 = 987654;
        rubrica.insert("gabriele",num );
        System.out.println(rubrica);
        rubrica.insert("gabriele1", num2);
        System.out.println(rubrica);
        rubrica.remove("gabriele");
        System.out.println(rubrica);
        Comparable comp="gabriele1";
        //rubrica.remove("g");
        //System.out.println(rubrica);
        //rubrica.makeEmpty();
        //rubrica.insert("io", num);
        //System.out.println(rubrica);
        System.out.println(rubrica.find(comp));
    }
    
}
