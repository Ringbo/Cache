diff --git a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
index 56c0876..7ce2c79 100644
--- a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
@@ -1496,7 +1496,7 @@
      * Iterates from this number up to the given number
      */
     public static void upto(Number self, Number to, Closure closure) {
-        for (int i = self.intValue(), size = to.intValue(); i < size; i++) {
+        for (int i = self.intValue(), size = to.intValue(); i <= size; i++) {
             closure.call(new Integer(i));
         }
     }
