/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romano;

import java.util.ArrayList;

/**
 *
 * @author roman
 */
public class Rubrica implements Dictionary{
    private ArrayList<Voce> elenco = new ArrayList<Voce>();
    @Override
    public boolean isEmpty() {
        return elenco.isEmpty();
    }

    @Override
    public void makeEmpty() {
        elenco=new ArrayList<Voce>();
    }

    @Override
    public void insert(Comparable key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Comparable key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object find(Comparable key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
