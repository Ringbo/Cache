diff --git a/test/com/google/javascript/jscomp/CompilerTestCase.java b/test/com/google/javascript/jscomp/CompilerTestCase.java
index d47481d..46f8fb1 100644
--- a/test/com/google/javascript/jscomp/CompilerTestCase.java
+++ b/test/com/google/javascript/jscomp/CompilerTestCase.java
@@ -658,7 +658,7 @@
     test(compiler, maybeCreateArray(expected), error, warning, description);
   }
 
-  private String[] maybeCreateArray(String expected) {
+  private static String[] maybeCreateArray(String expected) {
     if (expected != null) {
       return new String[] {expected};
     }
