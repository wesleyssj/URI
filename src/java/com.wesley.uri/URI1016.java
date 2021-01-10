package com.wesley.uri;

import java.io.IOException;
import java.util.Scanner;

public class URI1016 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int velocidade = scan.nextInt();
        int tempo = velocidade * 2;

        System.out.println(tempo + " minutos");

    }

}
