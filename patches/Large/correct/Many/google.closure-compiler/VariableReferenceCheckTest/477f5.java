diff --git a/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java b/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java
index 2156b95..1529276 100644
--- a/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java
+++ b/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java
@@ -259,7 +259,7 @@
    * Expects the JS to generate one bad-read error.
    */
   private void assertRedeclare(String js) {
-    testWarning(js, VariableReferenceCheck.REDECLARED_VARIABLE);
+    testError(js, VariableReferenceCheck.REDECLARED_VARIABLE);
   }
 
   /**
