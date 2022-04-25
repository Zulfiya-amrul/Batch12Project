        package com.syntax.replits;

        import java.util.HashMap;
        import java.util.Iterator;
        import java.util.LinkedHashMap;
        import java.util.Map;

        public class r202 {
            public static void main(String[] args) {
   /*             LinkedHashMap<String, String> items = new LinkedHashMap<>();
                items.put("1 item", "apple");
                items.put("2 item", "banana");
                items.put("3 item", "pear");
                items.put("4 item", "tomato");
                items.put("5 item", "mango");
                items.put("6 item", "kiwi");


                Iterator <Map.Entry <String, String>> iterator = items.entrySet().iterator();

                while (iterator.hasNext()) {
                    Map.Entry<String, String> entry = iterator.next();
                   // System.out.println(entry);
                    System.out.println( "Key is " + entry.getKey()+ " and value is "+ entry.getValue());
                   // System.out.println(entry.getValue());
                }*/
                ///Key is 1 item and values is apple


                        /*
                        Create HashMap

                add values as below

                map.put("mango", 10);

                map.put("apple", 30);

                map.put("orange", 20);

                map.put("mango", 40);

                map.put("mango", 40);
                    Key = orange and value = 20
                    Key = apple and value = 30
                    Key = mango and value = 40
                         */
                HashMap <String, Integer> map= new HashMap<>();

                map.put("mango", 10);

                map.put("apple", 30);

                map.put("orange", 20);

                map.put("mango", 40);

                map.put("mango", 40);

                Iterator <Map.Entry<String, Integer>> iterator1= map.entrySet().iterator();
                while (iterator1.hasNext()) {
                    Map.Entry<String, Integer> entry = iterator1.next();
                  //  System.out.println( entry.getKey());
                    System.out.println("Key = "+ entry.getKey() + " and value = " + entry.getValue());
                }




                    }
                }
