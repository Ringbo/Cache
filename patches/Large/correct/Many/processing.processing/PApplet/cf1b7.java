diff --git a/core/PApplet.java b/core/PApplet.java
index 636535b..044a21d 100644
--- a/core/PApplet.java
+++ b/core/PApplet.java
@@ -3264,18 +3264,40 @@
 
   //
 
+  /**
+   * Returns a String that contains the binary value of a byte. 
+   * The returned value will always have 8 digits. 
+   */
   static final public String binary(byte what) {
     return binary(what, 8);
   }
 
+  /**
+   * Returns a String that contains the binary value of a char. 
+   * The returned value will always have 16 digits because chars
+   * are two bytes long.
+   */
   static final public String binary(char what) {
     return binary(what, 16);
   }
 
+  /**
+   * Returns a String that contains the binary value of an int. 
+   * The length depends on the size of the number itself. 
+   * An int can be up to 32 binary digits, but that seems like
+   * overkill for almost any situation, so this function just
+   * auto-sizes. If you want a specific number of digits (like all 32)
+   * use binary(int what, int digits) to specify how many digits.
+   */
   static final public String binary(int what) {
-    return binary(what, 32);
+    return Integer.toBinaryString(what);
+    //return binary(what, 32);
   }
 
+  /**
+   * Returns a String that contains the binary value of an int.
+   * The digits parameter determines how many digits will be used. 
+   */
   static final public String binary(int what, int digits) {
     String stuff = Integer.toBinaryString(what);
 
@@ -3284,13 +3306,17 @@
       return stuff.substring(length - digits);
 
     } else if (length < digits) {
-      int offset = 8 - (digits-length);
+      int offset = 32 - (digits-length);
       return "00000000000000000000000000000000".substring(offset) + stuff;
     }
     return stuff;
   }
 
 
+  /**
+   * Unpack a binary String into an int.
+   * i.e. unbinary("00001000") would return 8.
+   */
   static final int unbinary(String what) {
     return Integer.parseInt(what, 2);
   }
