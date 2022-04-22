package com.stackroute;

//package com.stackroute.strings;

import java.util.Arrays;  

public class AnagramString {  
    public String checkAnagrams(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println("ANAGRAMS");  
        } else {  
            System.out.println("NOT_ANAGRAMS");  
        }
		return null;  
    }  
}

   
  
