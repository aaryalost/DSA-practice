public class LinearSearch {
          public static void main(String[] args) {
              int[] arr = {10, 25, 36, 48, 59};
              int key = 36;
              boolean found = false;
      
              for (int i = 0; i < arr.length; i++) {
                  if (arr[i] == key) {
                      System.out.println("Element found at index " + i);
                      found = true;
                      break;
                  }
              }
      
              if (!found) {
                  System.out.println("Element not found.");
              }
          }
      }
      