public class Leet {
      private static String[][] replacements = 
            {
                  {"elite", "1337"},
                  {"cool", "k3wl"},
                  {"!", "!!!11"},
                  {"ck", "xx"},
                  {"ers", "0rz"},
                  {"er", "0rz"},
                  {"en", "n"},
                  {"e", "3"},
                  {"t", "7"},
                  {"o", "0"},
                  {"a", "@"}
            };
            
      public static String toLeet(String normal) {
         String oldString = "";
         String newString = normal;
         for(String[] replacement : replacements) {
            while(newString.contains(replacement[0])){
                oldString = newString;
                newString = newString.replace(replacement[0], replacement[1]);
                
                if(replacement[0].equals("!")) break;
            }
         }
         return newString;
      } 
      
      public static String[] allToLeet(String[] normals) {
         String[] newStrings = new String[normals.length];
         for(int i = 0; i < normals.length; i++) {
            newStrings[i] = toLeet(normals[i]);
         }
         return newStrings;
      }
      
      public static void main(String[] args) {
         String[] leetspeak = allToLeet(args);
         for(String s : leetspeak) {
            System.out.println(s);
         }
      }
}