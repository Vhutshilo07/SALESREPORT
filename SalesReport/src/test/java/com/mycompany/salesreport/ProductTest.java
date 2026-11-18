/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.salesreport;



/**
 *
 * @author Student
 */
 

 

import java.io.ByteArrayInputStream; 
import org.junit.jupiter.api.Test; 

import static org.junit.jupiter.api.Assertions.*; 

 

public class ProductTest { 

 

    private Product createProductWithTestData() { 

        String input = "25\n18\n20\n15\n10\n12\n18\n15\n20\n"; 

        System.setIn(new ByteArrayInputStream(input.getBytes())); 

        return new Product(); 

    } 

 

    @Test 

    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() { 

        Product p = createProductWithTestData(); 

        assertEquals(153, p.getTotalProductsSold()); 

    } 

 

    @Test 

    public void GetAverageSales_WithValidData_ReturnsCorrectValue() { 

        Product p = createProductWithTestData(); 

        assertEquals(17.0, p.getAverageProductsSold(), 0.01); 

    } 

 

    @Test 

    public void GetMostPopularProduct_WithValidData_ReturnsCorrectValue() { 

        Product p = createProductWithTestData(); 

        assertEquals("Cozy Nights Monarch(25)", p.getMostPopularProduct()); 

    } 

} 
