diff --git a/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java b/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java
index 1529276..2156b95 100644
--- a/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java
+++ b/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java
@@ -259,7 +259,7 @@
    * Expects the JS to generate one bad-read error.
    */
   private void assertRedeclare(String js) {
-    testError(js, VariableReferenceCheck.REDECLARED_VARIABLE);
+    testWarning(js, VariableReferenceCheck.REDECLARED_VARIABLE);
   }
 
   /**
