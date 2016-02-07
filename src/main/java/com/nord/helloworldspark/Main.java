/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nord.helloworldspark;

import static spark.Spark.get;
import static spark.SparkBase.port;


/**
 *
 * @author xqn7
 */
public class Main {

    public static void main(String[] args) {
        port(4590);
        get("/hello", (req, res) -> "Hello World");
    }   
}
