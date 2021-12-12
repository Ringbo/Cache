diff --git a/core/java/android/util/PathParser.java b/core/java/android/util/PathParser.java
index 92b19be..18dc262 100644
--- a/core/java/android/util/PathParser.java
+++ b/core/java/android/util/PathParser.java
@@ -164,7 +164,7 @@
      * @return array of floats
      */
     private static float[] getFloats(String s) {
-        if (s.charAt(0) == 'z' | s.charAt(0) == 'Z') {
+        if (s.charAt(0) == 'z' || s.charAt(0) == 'Z') {
             return new float[0];
         }
         try {
