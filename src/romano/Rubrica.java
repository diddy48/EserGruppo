/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romano;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roman
 */
public class Rubrica implements Dictionary {

    private ArrayList<Voce> elenco = new ArrayList<Voce>();

    @Override
    public boolean isEmpty() {
        return elenco.isEmpty();
    }

    @Override
    public void makeEmpty() {
        elenco = new ArrayList<Voce>();
    }

    @Override
    public void insert(Comparable key, Object value) {
        if (key instanceof String) {
            if (key == null) {
                throw new NullPointerException();
            }
            for (int i = 0; i < elenco.size(); i++) {
                if (key.compareTo(elenco.get(i).getNome()) == 0) {
                    elenco.get(i).setNum((int) value);
                    break;
                }
            }
            elenco.add(new Voce((String) key, (int) value));
        }
    }

    @Override
    public void remove(Comparable key) {
        if (key == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < elenco.size(); i++) {
            if (key.compareTo(elenco.get(i).getNome()) == 0) {
                elenco.remove(i);
                break;
            }
        }
        try {
            throw new DictionaryItemNotFoundException();
        } catch (DictionaryItemNotFoundException ex) {
            Logger.getLogger(Rubrica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object find(Comparable key) {
        if(key==null) throw new NullPointerException();
        for (int i = 0; i < elenco.size(); i++) {
            if (key.compareTo(elenco.get(i).getNome()) == 0) {
                return (Object) elenco.get(i).getNum();
            }
        }
        try {
            throw new DictionaryItemNotFoundException();
        } catch (DictionaryItemNotFoundException ex) {
            Logger.getLogger(Rubrica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
