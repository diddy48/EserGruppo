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
class Voce implements Comparable{
    private String nome;
    private int numero;
    public Voce(String nome,int numero){
        this.nome=nome;
        this.numero=numero;
    }

    @Override
    public int compareTo(Object o) {
        if(nome.equals((String) o)) return 0;
        else return 1;
    }

    Object getNome() {
        return nome;
    }
    Object getNum() {
        return numero;
    }
    void setNum(int num) {
        this.numero=num;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+"  Numero: "+numero;
    }
}
