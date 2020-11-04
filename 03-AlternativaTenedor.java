/* 
 * Copyright 2020 Mireia Oliver García - mireia.oliver.11@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {

        System.out.println("Alternativa Tenedor");
        System.out.println("===================");
        
        try {
            //Tipo de comida
            System.out.print("Tipo de comida .: ");
            String tipoComida = SCN.nextLine();
            System.out.println("---");
            
            //púas
            int puas;
            int puas0 = 0;
            int puas1 = 3;
            int puas2 = 4;
            
            //Comida
            final String comida1 = "Carne";
            final String comida2 = "Pescado";

            if (tipoComida.equals(comida1)) {
                puas = puas1;
            } else if (tipoComida.equals(comida2)) {
                puas = puas2;
            } else {
                puas = puas0;
            }
            
            System.out.printf("Tenedor con ....: %d púas%n", puas);

        } catch (Exception e) {
            System.out.println("Error: Entrada incorrecta.");
        }

    }
}
