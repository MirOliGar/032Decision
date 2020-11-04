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

    public static void main(String[] args) {
        try {
            //presentación
            System.out.println("Alternativa de Multa");
            System.out.println("====================");

            // petición de datos
            System.out.print("Días de demora ..........:");
            int diasd = SCN.nextInt();

            //coste inicial
            double multa = 60;
            System.out.printf("Importe inicial multa ....: %.2f €%n", multa);
            System.out.println("---");

            //analisis de descuento 
            int desc = 20;
            int plazo = 30;
            double imp_d = 0;
            if (diasd <= plazo) {
                imp_d = multa * desc / 100;
                multa = multa - imp_d;
            }
            //Visualización de resultados
            System.out.printf("Plazo con descuento .......: %d días%n", plazo);
            System.out.printf("Tanto descuento ...........: %d %%%n", desc);
            System.out.printf("Importe descuento .........: %.2f €%n", imp_d);
            System.out.println("---");
            System.out.printf("Importe final multa .......: %.2f €%n", multa);
        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
        } finally {
            SCN.nextLine();
        }
    }

}
