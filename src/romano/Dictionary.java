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
public interface Dictionary {

    /**
     * verifica se il dizionario contiene almeno una coppia chiave/valore
     */
    boolean isEmpty();

    /** 
    * svuota il dizionario 
    */
    void makeEmpty();

    /**
    * Inserisce un elemento nel dizionario. L'inserimento va sempre a buon fine. 
      Se la chiave non esiste la coppia key/value viene aggiunta al dizionario; 
      se la chiave esiste gia' il valore ad essa associato viene sovrascritto 
      con il nuovo valore; se key e` null viene lanciata IllegalArgumentException 
     */
    void insert(Comparable key, Object value);

    /** 
    * Rimuove dal dizionario l'elemento specificato dalla chiave key 
      Se la chiave non esiste viene lanciata DictionaryItemNotFoundException 
     */
    void remove(Comparable key);

    /**
    * Cerca nel dizionario l'elemento specificato dalla chiave key 
    * La ricerca per chiave restituisce soltanto il valore ad essa associato 
    * Se la chiave non esiste viene lanciata DictionaryItemNotFoundException 
    */
    Object find(Comparable key);
}
