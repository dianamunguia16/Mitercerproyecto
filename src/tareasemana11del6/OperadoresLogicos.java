/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasemana11del6;

/**
 *
 * @author diana
 */
public class OperadoresLogicos
 {
 public static void main(String[] args){
 // crea tabla de verdad para el operador && (AND condicional)
 System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
 /*"AND condicional (&&)", "false && false" */(false && false),
 "false && true", (false && true), 
 "true && false", (true && false), 
 "true && true", (true && true),

 // crea tabla de verdad para el operador || (OR condicional)
 System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "OR condicional (||)", "false || false", (false || false),
 "false || true", (false || true),
 "true || false", (true || false), 
 "true || true", (true || true)),

 // crea tabla de verdad para el operador & (AND lógico booleano)
 System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
 "AND logico booleano (&)", "false & false", (false & false),
 "false & true", (false & true), 
 "true & false", (true & false),
 "true & true", (true & true)),

 // crea tabla de verdad para el operador | (OR inclusivo lógico booleano)
 System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
 "OR inclusivo logico booleano (|)",
 "false | false", (false | false),
 "false | true", (false | true),
 "true | false", (true | false), 
 "true | true", (true | true)),

 // crea tabla de verdad para el operador ^ (OR exclusivo lógico booleano)
 System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
 "OR exclusivo logico booleano (^)",
 "false ^ false", (false ^ false),
 "false ^ true", (false ^ true), 
 "true ^ false", (true ^ false),
 "true ^ true", (true ^ true)),

 // crea tabla de verdad para el operador ! (negación lógica)
 System.out.printf("%s%n%s: %b%n%s: %b%n", "NOT logico (!)",
 "!false", (!false), "!true", (!true)),


