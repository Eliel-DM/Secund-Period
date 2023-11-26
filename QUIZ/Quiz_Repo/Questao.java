package Quiz_Repo;
import java.util.Scanner;
public class Questao {
    Scanner ler = new Scanner(System.in);
    String pergunta;
    String a;
    String b;
    String c;
    String d;
    String rst;
    String rstc;
    public boolean valitator = false;

    int contador = 0;
   public void Setbase(){
       System.out.println(this.pergunta);
       System.out.println("-");
       System.out.println(this.a);
       System.out.println(this.b);
       System.out.println(this.c);
       System.out.println(this.d);
       this.rst = ler.next();
   }

    public void SetValitator(){

        if (this.rst.equalsIgnoreCase(this.rstc)) {
            System.out.println(" Parabéns você acertou a questão!\n");

            if (valitator = true){
                this.contador = 1;
            } else if (valitator = false){
                this.contador = 0;
            }
        } else {
            System.out.println(" Você errou!\n");

            System.out.println(" OBS: As perguntas devem ser respondidas de acordo com a letra da alternativa. Exemplo : 'A' .");

        }

    }



    }


