diff --git a/javaparser-core/src/main/java/com/github/javaparser/utils/Utils.java b/javaparser-core/src/main/java/com/github/javaparser/utils/Utils.java
index 4b5813e..9c03073 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/utils/Utils.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/utils/Utils.java
@@ -162,19 +162,19 @@
      * Capitalizes the first character in the string.
      */
     public static String capitalize(String s) {
-        return stringTransformer(s, it -> it.toUpperCase());
+        return stringTransformer(s, "capitalize", it -> it.toUpperCase());
     }
 
     /**
      * Lower-cases the first character in the string.
      */
     public static String decapitalize(String s) {
-        return stringTransformer(s, it -> it.toLowerCase());
+        return stringTransformer(s, "decapitalize", it -> it.toLowerCase());
     }
 
-    private static String stringTransformer(String s, Function<String, String> transformation) {
+    private static String stringTransformer(String s, String operationDescription, Function<String, String> transformation) {
         if (s.isEmpty()) {
-            throw new IllegalArgumentException();
+            throw new IllegalArgumentException(String.format("You cannot %s an empty string", operationDescription));
         }
         StringBuilder sb = new StringBuilder();
         sb.append(transformation.apply(s.substring(0, 1)));
