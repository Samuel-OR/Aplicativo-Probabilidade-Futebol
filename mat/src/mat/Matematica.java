package mat;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Matematica {

    public void Vencer() {

        int nj, jr, vj, c = 1, d = 1, f, p, e = 1, h = 1, x, k, forca, golf, gols, saldo, qe;
        double reba, t, y, po;

        Scanner ler = new Scanner(System.in);

        System.out.println("Total de jogos do campeonato");
        nj = ler.nextInt();
        System.out.println("Jogos restantes para o fim do torneio");
        jr = ler.nextInt();
        System.out.println("Quantidade de jogos que precisam ser vencidos para a equipe ñ ser rebaixada");
        vj = ler.nextInt();
        x = vj;
        
        
        for (int v = 1; v <= x; v++) {
            h = h * v;
        }

        k = x;
        t = 2.718;
        System.out.println("Insira a media de vitorias da equipe no torneio");
        y = ler.nextDouble();

        po = Math.pow(t, -y) * Math.pow(y, k) / h;

        DecimalFormat df = new DecimalFormat("###.####");
        df.setRoundingMode(RoundingMode.UP);

        System.out.println("________________________________________");

        System.out.println("A probabilidade da equipe vencer " + x + " jogos é = " + df.format(po) + "%");

        System.out.println("________________________________________");
    }

    public void Força() {
        int nj, jr, vj, c = 1, d = 1, f, p, e = 1, h = 1, x, k, forca, golf, gols, saldo, qe;
        double reba, t, y, po;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a forca da equipe dentro e fora de casa");
        forca = ler.nextInt();
        if(forca <=0 || forca >=101){
            System.out.println("Valor inalido!, Insira novamente");
             forca = ler.nextInt();
          }
        if (forca <= 30 && forca > 0) {
            System.out.println("A equipe é muito boa e tem muita chance de escapar do rabaixamento");
        }
        if (forca >= 31 && forca <= 70) {
            System.out.println("A equipe é mediana e tem chances medias de escapar do rabaixamento");
        }
        if (forca > 71 && forca<101) {
            System.out.println("A equipe é muito fraca e tem poucas chance de escapar do rabaixamento");
        }
    }

    public void Rebaixamento() {
        int nj = 0, jr = 0, vj = 0, c = 1, d = 1, f, p, e = 1, h = 1, x, k, forca = 0, golf, gols, saldo, qe;
        double reba, t, y, po = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Total de jogos do campeonato");
        nj = ler.nextInt();
        System.out.println("Jogos restantes para o fim do torneio");
        jr = ler.nextInt();
        System.out.println("Quantidade de jogos que precisam ser vencidos para a equipe não ser rebaixada");
        vj = ler.nextInt();
        x = vj;
        System.out.println("Insira a forca da equipe dentro e fora de casa");
        forca = ler.nextInt();
        if(forca <=0 || forca >=101){
            System.out.println("Valor inalido!, Insira novamente");
             forca = ler.nextInt();
          }

        
        for (int v = 1; v <= x; v++) {
            h = h * v;
        }

        k = x;
        t = 2.718;
        System.out.println("Insira a media de vitorias da equipe no torneio");
        y = ler.nextDouble();

        po = Math.pow(t, -y) * Math.pow(y, k) / h;

        System.out.println("Insira a quantidade de gols feitos pela equipe");
        golf = ler.nextInt();
        System.out.println("Insira a quantidade de gols sofrido pela equipe");
        gols = ler.nextInt();

        saldo = golf - gols;
        if (saldo < 0) {
            saldo = saldo * (-1);
        }

        // 100 a 71=bom elenco
        // 70 a 31=bom elenco
        // 30 a 1=bom elenco
        System.out.println("Insira a qualidade do elenco");
        qe = ler.nextInt();

        for (int i = 1; i <= jr; i++) {
            c = c * i;

        }
        System.out.println("c = " + c);
        for (int g = 1; g <= vj; g++) {

            d = d * g;

        }
        System.out.println("d = " + d);
        p = jr - vj;

        for (int j = 1; j <= p; j++) {
            e = e * j;
        }
        System.out.println("e = " + e);

        reba = (po * qe / saldo * ( e * nj) * forca * c);

        System.out.println("--------------------------------------------------------------");

        System.out.println("Chance de rebaixamento é = " + reba);

        System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        int oi = 0;

        Matematica M = new Matematica();

       

        System.out.println("Digite a opção que deseja");
        System.out.println("1 - Probabilidade de Vencer X Jogos");
        System.out.println("2 - Capacidade da Equipe");
        System.out.println("3 - Chances de Rebaixamento");
        System.out.println("0 - Sair");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        oi = dado.nextInt();

        while (oi != 0) {
            switch (oi) {
                case 1:
                    M.Vencer();
                    break;
                case 2:
                    M.Força();
                    break;
                case 3:
                    M.Rebaixamento();
                    break;
            }
            System.out.println("Digite a opção que deseja");
            System.out.println("1 - Probabilidade de Vencer X Jogos");
            System.out.println("2 - Capacidade da Equipe");
            System.out.println("3 - Chances de Rebaixamento");
            System.out.println("0 - Sair");
            oi = dado.nextInt();
        }

    }

}
