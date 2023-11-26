package Quiz_Repo;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        //Declaração de variáveis

        Scanner ler = new Scanner(System.in);
        String continua;
        int cont=0;
        int contp=0;
        String nome;
        //Cabeçalho

        Cabecinha head = new Cabecinha();
        head.aluno = "Eliel Dias Matos";
        head.professor = "Brenno";
        head.facul = "UNIFAN";
        head.materia = "Lógica de programação e algoritmos 2";
        head.printhead();
        //end cabeçalho

        System.out.println("Insira algum valor para continuar");
        continua = ler.next();
        if (continua.equals(continua)){
            //______________________________________________________Início Quiz_Repo.Quiz

            System.out.println("--------------------------------------QUIZZZZZZZ-DO-GEÓGRAFO---------------------------------------------");
            System.out.println("+++++Regras+++++\n"+"+Cada questão terá o valor de 5 Pontos\n");
            System.out.println("Qual seu nome Jovem?");
            nome = ler.next();

            System.out.println("--------------------------------  Informe qual alternativa é a correta. ----------------------------------");

            //Questão 01

            Questao qst1 = new Questao();

            //text

            qst1.pergunta = "01 - Qual o maior país da America Latina?";
            qst1.a = "A) China";
            qst1.b = "B) Argentina";
            qst1.c = "C) Rússia";
            qst1.d = "D) Brasil";
            qst1.rstc = "D";
            qst1.Setbase();
            qst1.SetValitator();

            // Quiz_Repo.Questao 02

            Questao qst2 = new Questao();
            qst2.pergunta = "02 - Qual o maior rio da America Latina ?";
            qst2.a = "A) Rio Araguaia";
            qst2.b = "B) Rio Paraná";
            qst2.c = "C) Rio Amazonas";
            qst2.d = "D) Rio São Franscisco";
            qst2.rstc = "C";
            qst2.Setbase();
            qst2.SetValitator();

            //QUestão 03

            Questao qst3 = new Questao();
            qst3.pergunta = "03 - Qual maior ôceano do mundo?";
            qst3.a = "A) Pacífico";
            qst3.b = "B) Atlântico";
            qst3.c = "C) ìndico";
            qst3.d = "D) Antártico";
            qst3.rstc = "A";
            qst3.Setbase();
            qst3.SetValitator();


            //Questão 04

            Questao qst4 = new Questao();
            qst4.pergunta = "04 - Qual o maior lençol freático do mundo?";
            qst4.a = "A) Kalahari ";
            qst4.b = "B) Arenito Núbia";
            qst4.c = "C) Guarani";
            qst4.d = "D) Alter do Chão";
            qst4.rstc = "C";
            qst4.Setbase();
            qst4.SetValitator();

            //Questão 05

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "b";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 06 --------------------- EDITAR QUESTÕES

            Questao qst6 = new Questao();
            qst6.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst6.a = "A) 2-regiões";
            qst6.b = "B) 5-regiões";
            qst6.c = "C) 3-regiões";
            qst6.d = "D) 4-regiões";
            qst6.rstc = "5";
            qst6.Setbase();
            qst6.SetValitator();

            //Questão 07

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 08

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 09

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 10

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 11

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 12

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 13

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 14

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            //Questão 15

            Questao qst5 = new Questao();
            qst5.pergunta=" 05 - O Brasil é divido em quantas regiões";
            qst5.a = "A) 2-regiões";
            qst5.b = "B) 5-regiões";
            qst5.c = "C) 3-regiões";
            qst5.d = "D) 4-regiões";
            qst5.rstc = "5";
            qst5.Setbase();
            qst5.SetValitator();

            
            //end

            cont = (qst1.contador+qst2.contador+qst3.contador+qst4.contador+qst5.contador);
            contp = cont*5;

            System.out.println(nome +" você  acertou o total de "+cont+" questões");
            System.out.println("SEUS PONTOS : "+contp);

        }else{
            System.out.println("Error");
        }

        System.out.println("_____________________________________________________________Fim Quiz_____________________________________________________________");

    }}
