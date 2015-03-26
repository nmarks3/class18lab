/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author nmarks3
 */
public class Lab1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(3,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(4,"Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee(1,"Mallay", "Fred", "111-11-1111");
        
        //Part 2
        Map<String, Employee> map = new HashMap<String, Employee>();
        map.put(e1.getSsn(), e1);
        map.put(e2.getSsn(), e2);
        map.put(e3.getSsn(), e3);
        map.put(e4.getSsn(), e4);
        
        System.out.println("Now retrieving key that matches: 111-11-1111");
        System.out.println(map.get("111-11-1111"));
        
        Set<String> keys = map.keySet();
        
        System.out.println("\nNow retrieving all keys with duplicate SSN removed: ");
        for(String key : keys) {
            Employee found = map.get(key);
            System.out.println(found.toString());
        }
        
        //Part 3
        Map<String, Employee> map1 = new TreeMap<String, Employee>();
        map1.put(e1.getSsn(), e1);
        map1.put(e2.getSsn(), e2);
        map1.put(e3.getSsn(), e3);
        map1.put(e4.getSsn(), e4);
        
        Set<String> keys1 = map1.keySet();
        
        System.out.println("\nNow retrieving all keys with duplicate SSN removed"
                + "and sorted: ");
        for(String key : keys1) {
            Employee found = map.get(key);
            System.out.println(found.toString());
        }
        
        //Part 4
        Set set = new TreeSet();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        
        List<Employee> list = new ArrayList(set);
        
        System.out.println("\nNow retrieving ordered set: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        
    }
    
}}
