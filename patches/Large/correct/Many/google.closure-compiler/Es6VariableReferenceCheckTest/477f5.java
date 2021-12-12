diff --git a/test/com/google/javascript/jscomp/Es6VariableReferenceCheckTest.java b/test/com/google/javascript/jscomp/Es6VariableReferenceCheckTest.java
index b708fd0..b64b2de 100644
--- a/test/com/google/javascript/jscomp/Es6VariableReferenceCheckTest.java
+++ b/test/com/google/javascript/jscomp/Es6VariableReferenceCheckTest.java
@@ -367,7 +367,7 @@
    * Expects the JS to generate one bad-read warning.
    */
   private void assertRedeclare(String js) {
-    testWarning(js, VariableReferenceCheck.REDECLARED_VARIABLE);
+    testError(js, VariableReferenceCheck.REDECLARED_VARIABLE);
   }
 
   /**
