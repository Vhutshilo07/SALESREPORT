/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner; 

public class Product implements IProducts { 

 

    // my arrays 

    String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"}; 

    int[][] sales = new int[3][3]; 

 

    public static void main(String[] args) { 

        Product p = new Product(); 

        p.getSales(); 

        p.showReport(); 

    } 

 

    // ask user for sales 

    public void getSales() { 

        Scanner sc = new Scanner(System.in); 

 

        for (int i = 0; i < 3; i++) { 

            for (int j = 0; j < 3; j++) { 

                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: "); 

                sales[i][j] = sc.nextInt(); 

            } 

            System.out.println(); 

        } 

    } 

 

    // total 

    public int getTotalProductsSold() { 

        int total = 0; 

        for (int i = 0; i < 3; i++) { 

            for (int j = 0; j < 3; j++) { 

                total = total + sales[i][j]; 

            } 

        } 

        return total; 

    } 

 

    // average 

    public double getAverageProductsSold() { 

        double avg = getTotalProductsSold() / 9.0; 

        return avg; 

    } 

 

    // most popular - biggest number in the table 

    public String getMostPopularProduct() { 

        int biggest = sales[0][0]; 

        String best = products[0]; 

 

        for (int i = 0; i < 3; i++) { 

            for (int j = 0; j < 3; j++) { 

                if (sales[i][j] > biggest) { 

                    biggest = sales[i][j]; 

                    best = products[i]; 

                } 

            } 

        } 

        return best + "(" + biggest + ")"; 

    } 

 

    // print report 

    public void showReport() { 

        System.out.println("PRODUCT SALES REPORT - 2026"); 

        System.out.println("******************************************"); 

        System.out.println("TOTAL PRODUCT SALES: " + getTotalProductsSold()); 

        System.out.println("AVERAGE PRODUCT SALES: " + (int) getAverageProductsSold()); 

        System.out.println("MOST POPULAR PRODUCT: " + getMostPopularProduct()); 

    } 

} 
