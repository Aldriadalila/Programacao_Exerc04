package sin.multiprog.usjt.br.meusfilmes;

public class FilmeDAO {
    private static Filme[] filmes;

    private FilmeDAO(){

    }

    public static Filme[] getFilmes(){
        if(filmes == null){

            filmes = new Filme[10];
            filmes[0] = new Filme(1,"High School Musical ","Kenny Ortega", "Estudantes conspiram contra uma estrela do basquete e uma tímida novata, para evitar que eles cantem em uma produção musical.\n","93", "03/12/2006", "highschoolmusical.png");
            filmes[1] = new Filme(2,"High School Musical 2 "," Kenny Ortega","Nas férias de verão, a turma da East High está pronta para se divertir e curtir o sol. Infelizmente, todos estão sem dinheiro e precisam arranjar empregos. Troy acha que seu problema está resolvido quando passa a trabalhar na sensacional casa de campo da família de Sharpay e Ryan, mas não sabe que ela tem um outro motivo para contratá-lo. Felizmente, para sorte de Troy, alguns dos seus colegas Wildcats conseguem empregos por lá também.","94","17/08/2007", "highschoolmusical2.png");
            filmes[2] = new Filme(3,"High School Musical 3"," Kenny Ortega","Em meio a preparativos para um campeonato de basquete, baile e formatura, os namorados Troy Bolton e Gabriella Montez curtem cada momento, sabendo que a faculdade coloca o futuro de seu relacionamento em jogo. Um elaborado musical de primavera é apenas mais uma oportunidade para os dois Wildcats e seus colegas expressarem os medos e as esperanças para o futuro.","94","24/10/2008" , "highschoolmusical3.png");
            filmes[3] = new Filme(4,"Camp Rock","Matthew Diamond","Uma adolescente quer desesperadamente passar o verão em um acampamento de rock, mas a única maneira pela qual pode entrar é trabalhando na cozinha. Quando um astro pop adolescente ouve seu canto, ele sai para encontrar qual garota é dona da voz.","94","20/06/2008" , "camprock.png");
            filmes[4] = new Filme(5,"Camp Rock 2","Paul Hoen","Mitchie, Shane, Jason, Nate e seus amigos retornam ao Camp Rock para outro grande verão de música e diversão. No entanto, eles descobrem que um novo local para arte e interpretações de música, o Camp Star, abriu do outro lado do lago e tem atraído muitos dos instrutores e campistas do Camp Rock, col… ","95","03/09/2010" , "camprock2.png");
            filmes[5] = new Filme(6,"Como Eu Era Antes De Você","Thea Sharrock","A jovem e peculiar Louisa \"Lou\" Clark transita de emprego a emprego para ajudar a sustentar sua família. Entretanto, sua atitude alegre é testada quando se torna cuidadora de Will Traynor.","95","16/06/2016" , "comoeueraantescomoeueraantesdevoce.png");
            filmes[6] = new Filme(7,"Truque de Mestre","Louis Leterrier","Um grupo de ilusionistas encanta o público com suas mágicas e também rouba bancos em outro continente, distribuindo a quantia roubada para os próprios espectadores. O agente do FBI Dylan Hobbs está determinado a capturá-los e conta com a ajuda de Alma Vargas, uma detetive da Interpol, e também de Thaddeus Bradley, um veterano desmistificador de mágicos que insiste que os assaltos são realizados a partir de disfarces e jogos envolvendo vídeos.","93","05/07/2013" , "truquedemestre.png");
            filmes[7] = new Filme(8,"Truque de Mestre 2","Jon M. Chu","Os ilusionistas conhecidos como os \"Quatro Cavaleiros\" precisam executar um truque inédito para limpar seus nomes e demonstrar as práticas antiéticas de um magnata da tecnologia.","92","09/06/2016" , "truquedemestre2.png");
            filmes[8] = new Filme(9,"O Resgate do soldado Ryan","Steven Spielberg","Ao desembarcar na Normandia, no dia 6 de junho de 1944, capitão Miller (Tom Hanks) recebe a missão de comandar um grupo do segundo batalhão para o resgate do soldado James Ryan, caçula de quatro irmãos, dentre os quais três morreram em combate." + " Por ordens do chefe George C. Marshall, eles precisam procurar o soldado e garantir o seu retorno, com vida, para casa.","100","11/09/1998" , "regatesoldadoryan.png");
            filmes[9] = new Filme(10,"Três Homens em Conflito","Sergio Leone","Em meio à Guerra Civil Americana, três homens fazem de tudo para colocar as mãos em 200 mil dólares roubados.","46","17/04/1976" , "treshomensemconflitos.png");
        }

        return filmes;
    }

}
