/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {

     

    public void printTotalProductSales(Product product) { 

        System.out.println("TOTAL PRODUCT SALES: " + product.getTotalProductsSold()); 

    } 

 

    public void printAverageProductSales(Product product) { 

        System.out.println("AVERAGE PRODUCT SALES: " + product.getAverageProductsSold()); 

    } 

 

    public void printMostPopularProduct(Product product) { 

        System.out.println("MOST POPULAR PRODUCT: "+ product.getMostPopularProduct()); 

    } 

 

    public void printReport(Product product) { 

        printTotalProductSales(product); 

        printAverageProductSales(product); 

        printMostPopularProduct(product); 

    } 

} 

 

