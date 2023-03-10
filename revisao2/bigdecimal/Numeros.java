package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Numeros {
    public static void main(String[] args) {
        double d1 = 0.1;
        double d2 = 0.2;

        System.out.println(d1 + d2);

        // BigDecimal =  usado para resolver problema de representação
        // de números decimais quando precisamos de alta precisão
        // A classe representa os decimais somente com valores inteiros, por exemplo:
        // 3.14 = 314 escalar 2

        // como utilizamos a classe:
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3.toString());

        // cuidados com o uso do BigDecimal

        // não se deve usar na inicialização do BigDecimal, um valor decimal
        // pois este valor já está representado de forma incorreta em binário
        BigDecimal bdProblema = new BigDecimal(0.1);
        System.out.println("Com problema 0.1:" + bdProblema);

        BigDecimal bdResolvido = BigDecimal.valueOf(0.1);
        System.out.println(bdResolvido);


        // Como dividir
        BigDecimal bd4 = new BigDecimal("1");
        BigDecimal bd5 = new BigDecimal("3");

        // desta forma dará erro. O  BigDecimal não faz arredondamento automático
        // precisamos informar COMO o arredondamento deve ser feito
        // System.out.println(bd4.divide(bd5));

        // resolvendo o problema do arredondamento
        // indica que o arredondamento será feito com 3 casas decimais
        // e o tipo de arredondamento será para cima (UP)
        System.out.println(bd4.divide(bd5,4,RoundingMode.UP));
        System.out.println(bd4.divide(bd5,3,RoundingMode.HALF_DOWN));


    }

}