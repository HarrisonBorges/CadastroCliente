/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Harrison
 */
public class PaisDAO {
    private Collection<PaisData> paises;

    
    public PaisDAO() {
        if(paises == null){
            this.paises = new ArrayList<PaisData>();
        }
    }

    public ArrayList<PaisData> getPaises() {
        return (ArrayList<PaisData>) paises;
    }

    public void setPaises(Collection<PaisData> paises) {
        this.paises = paises;
    }
   
    public void criar(PaisData pais){
        int valorId = 0;
        for(PaisData cd : paises){
            if(cd.getId() > valorId){
                valorId = cd.getId();
            }
        }
        pais.setId(++valorId);
        paises.add(pais);
    }
    
    public void alterar(PaisData pais, int id){
        excluir(pais, id);
        criar(pais);
    }
    
    public void excluir(PaisData pais, int id){
        paises.remove(pais);
    }
    
    public PaisData ler(int id){
        return null;
    }
    
    public Collection<PaisData> ler(){
        return null;
    }
}
