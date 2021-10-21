package com.leven.estudo;

import java.util.stream.IntStream;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class condicionais {
    public static void main(String[] args) {
        final var condicao = true;
        final var numero = 3.1415;

        Date novadata = new Date();
        Long currentTimeMillis = System.currentTimeMillis();
        Date testedata = new Date(currentTimeMillis);

        Calendar agora = Calendar.getInstance();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        var dataFormatada = formatter.format(novadata);
        System.out.println(dataFormatada);

        System.out.println(agora.getTime());
        System.out.printf("%tF\n",agora);

        System.out.println(novadata);
        System.out.println(testedata);

        System.out.printf("Numero é: %.2f \n", numero);

        if (condicao){
            System.out.println("Condicao verdadeira");
        } else {
            System.out.println("Condicao é falsa");
        }

        for (int i = 0; i <=10; i++){
            System.out.println("X+"+i);
        }

        IntStream.of(1,2,3,4,5).forEach(n ->{
            System.out.println(n);
        });

        IntStream.range(0,15).forEach(n ->{
            System.out.println("numero: "+n);
        });
    }
}
