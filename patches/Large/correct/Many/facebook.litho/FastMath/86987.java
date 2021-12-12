diff --git a/litho-core/src/main/java/com/facebook/litho/FastMath.java b/litho-core/src/main/java/com/facebook/litho/FastMath.java
index 42c11bb..6e906f7 100644
--- a/litho-core/src/main/java/com/facebook/litho/FastMath.java
+++ b/litho-core/src/main/java/com/facebook/litho/FastMath.java
@@ -14,7 +14,7 @@
  * This will always have the downside of not supporting all the edge cases which the java Math
  * package does support so please read up on those edge cases before using these methods.
  */
-class FastMath {
+public class FastMath {
 
   /**
    * This stack overflow post has more context around what cases this implementation won't handle.
@@ -23,7 +23,7 @@
    * @param val The value to round
    * @return The rounded value
    */
-  static int round(float val) {
+  public static int round(float val) {
     if (val > 0) {
       return (int) (val + 0.5);
     } else {
