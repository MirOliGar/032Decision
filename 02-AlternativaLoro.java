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

        final String nombre_amo = "Sócrates";
        final String MSG_SI = "¡Ave César!";
        final String MSG_NO = "¡Sócrates socorro!";

        System.out.println("Alternativa Loro");
        System.out.println("================");

        System.out.printf("Persona que se acerca ..: ");
        String nombrePersona = SCN.nextLine();
        System.out.println("---");
        System.out.printf("Dueño loro .............: %s%n", nombre_amo);
        System.out.println("---");
        //sintaxis para elegir la persona que se acerca
        if (nombrePersona.equals(nombre_amo)) {
            System.out.printf("Mensaje Loro ...........: %s%n", MSG_SI);
        } else {
            System.out.printf("Mensaje Loro ...........: %s%n", MSG_NO);
        }
    }
}
