/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mapslab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jkemper3
 */
public class MapsLab {
    public static void main(String[] args) throws FileNotFoundException {
        
   
 File data = new File("src/lab1.txt");              
	  		
Scanner sc = new Scanner(data);

List<Contacts> contact = new ArrayList<Contacts>();

while(sc.hasNextLine()){
    String line = sc.nextLine();
    String [] details = line.split(",");
    String firstName = details[0];
    String lastName = details[1];
    String address = details[2];
    String city = details[3];
    String state = details[4];
    String zipCode = details[5];
    
    Contacts c = new Contacts(firstName,lastName,address, city, state, zipCode);
            
    contact.add(c);
    
    Set <Contacts> c1 = new HashSet<Contacts>(contact);
       
}

//for(Contacts c : contact )
        //System.out.println(c.toString());

for(Contacts c : c1)
        System.out.println(c1.toString());
}

  
}
 