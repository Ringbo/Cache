diff --git a/test/com/google/javascript/jscomp/MakeDeclaredNamesUniqueTest.java b/test/com/google/javascript/jscomp/MakeDeclaredNamesUniqueTest.java
index a951335..1d47c2b 100644
--- a/test/com/google/javascript/jscomp/MakeDeclaredNamesUniqueTest.java
+++ b/test/com/google/javascript/jscomp/MakeDeclaredNamesUniqueTest.java
@@ -100,7 +100,7 @@
     invert = false;
   }
 
-  private String wrapInFunction(String s) {
+  private static String wrapInFunction(String s) {
     return "function f(){" + s + "}";
   }
 
