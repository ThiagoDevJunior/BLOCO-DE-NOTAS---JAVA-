//default.SalavarTxt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalvarTxt {
    
    //objetos criados:
    private String texto;
    private String nome;

    //texto
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    //METODO PARA SALVAR AS INFORMAÇÕES:
    
    public String salvar(){
      
            
        
        try {
            FileWriter fw = new FileWriter("C:\\Users\\TIAGO\\Desktop\\" +nome+ ".txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("" + this.texto);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SalvarTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return null;
    }
    

    
/////FINAL PROPRAMA
}
