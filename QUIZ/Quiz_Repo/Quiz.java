package Quiz_Repo;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        //Declaração de variáveis

        Scanner ler = new Scanner(System.in);
        String continua;
        int cont;
        int contp;
        String nome;
        //Cabeçalho

        Cabecinha head = new Cabecinha();
        head.aluno = "Eliel Dias Matos";
        head.professor = "Brenno";
        head.facul = "UNIFAN";
        head.materia = "Lógica de programação e algoritmos 2";
        head.printhead();
        //end cabeçalho

        System.out.println("Entre com um valor para continuar");
        continua = ler.next();
        if (continua.equals(continua)){
            //______________________________________________________Início Quiz_Repo.Quiz

            System.out.println("--------------------------------------QUIZ---------------------------------------------");
            System.out.println("Cada Questão terá o valor de 5 pontos.");
            System.out.println("Insira o seu nome?");
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
            qst6.pergunta=" 06 - quantos litros de sangue uma pessoa tem? Em média, quantos são retirados numa doação de sangue?";
            qst6.a = "A) Tem entre 2 a 4 litros. São retirados 450 mililitros";
            qst6.b = "B) Tem entre 4 a 6 litros. São retirados 450 mililitros";
            qst6.c = "C) Tem 10 litros. São retirados 2 litros";
            qst6.d = "D) em 7 litros. São retirados 1,5 litros";
            qst6.rstc = "b";
            qst6.Setbase();
            qst6.SetValitator();

            //Questão 07

            Questao qst7 = new Questao();
            qst7.pergunta=" 07 - De quem é a famosa frase “Penso, logo existo”?";
            qst7.a = "A) Platão";
            qst7.b = "B) Galileu Galilei";
            qst7.c = "C) Descartes";
            qst7.d = "D) Sócrates";
            qst7.rstc = "c";
            qst7.Setbase();
            qst7.SetValitator();

            //Questão 08

            Questao qst8 = new Questao();
            qst8.pergunta=" 08 - De onde é a invenção do chuveiro elétrico?";
            qst8.a = "A) França";
            qst8.b = "B) Inglaterra";
            qst8.c = "C) Austrália";
            qst8.d = "D) Brasil";
            qst8.rstc = "d";
            qst8.Setbase();
            qst8.SetValitator();

            //Questão 09

            Questao qst9 = new Questao();
            qst9.pergunta=" 09 - Quais o menor e o maior país do mundo?";
            qst9.a = "A) Vaticano e Rússia";
            qst9.b = "B) Nauru e China";
            qst9.c = "C) Mônaco e Canadá";
            qst9.d = "D)  Malta e Estados Unidos";
            qst9.rstc = "a";
            qst9.Setbase();
            qst9.SetValitator();

            //Questão 10

            Questao qst10 = new Questao();
            qst10.pergunta=" 10 - Qual o nome do presidente do Brasil que ficou conhecido como Jango?";
            qst10.a = "A) Jânio Quadros";
            qst10.b = "B) Jacinto Anjos";
            qst10.c = "C) João Goulart";
            qst10.d = "D) João Figueiredo";
            qst10.rstc = "c";
            qst10.Setbase();
            qst10.SetValitator();

            //Questão 11

            Questao qst11 = new Questao();
            qst11.pergunta=" 11 - Qual o livro mais vendido no mundo a seguir à Bíblia?";
            qst11.a = "A) O Senhor dos Anéis";
            qst11.b = "B) Dom Quixote";
            qst11.c = "C) O Pequeno Príncipe";
            qst11.d = "D) Um Conto de Duas Cidades";
            qst11.rstc = "b";
            qst11.Setbase();
            qst11.SetValitator();

            //Questão 12

            Questao qst12 = new Questao();
            qst12.pergunta=" 12 - Quantas casas decimais tem o número pi?";
            qst12.a = "A) Duas";
            qst12.b = "B) Centenas";
            qst12.c = "C) Infinitas";
            qst12.d = "D) Milhares";
            qst12.rstc = "c";
            qst12.Setbase();
            qst12.SetValitator();

            //Questão 13

            Questao qst13 = new Questao();
            qst13.pergunta=" 13 - Atualmente, quantos elementos químicos a tabela periódica possui?";
            qst13.a = "A) 118";
            qst13.b = "B) 109";
            qst13.c = "C) 113";
            qst13.d = "D) 92";
            qst13.rstc = "a";
            qst13.Setbase();
            qst13.SetValitator();

            //Questão 14

            Questao qst14 = new Questao();
            qst14.pergunta=" 14 - O que a palavra legend significa em português?";
            qst14.a = "A) Legendário";
            qst14.b = "B) Legenda";
            qst14.c = "C) Lenda";
            qst14.d = "D) Conto";
            qst14.rstc = "c";
            qst14.Setbase();
            qst14.SetValitator();

            //Questão 15

            Questao qst15 = new Questao();
            qst15.pergunta=" 15 - Qual o número mínimo de jogadores em cada time numa partida de futebol?";
            qst15.a = "A) 8";
            qst15.b = "B) 9";
            qst15.c = "C) 5";
            qst15.d = "D) 7";
            qst15.rstc = "d";
            qst15.Setbase();
            qst15.SetValitator();
            
            //end

            cont = (qst1.contador+qst2.contador+qst3.contador+qst4.contador+qst5.contador+qst6.contador+ qst7.contador+ qst8.contador+ qst9.contador+ qst10.contador
            + qst11.contador+ qst12.contador+ qst13.contador+ qst14.contador+ qst15.contador);
            contp = cont*5;

            System.out.println(nome +" você  acertou o total de "+cont+" questões");
            System.out.println("Você atingiu : "+contp +" Pontos");

        }else{
            System.out.println("Error");
        }

        System.out.println("_____________________________________________________________Fim Quiz_____________________________________________________________");

    }}
