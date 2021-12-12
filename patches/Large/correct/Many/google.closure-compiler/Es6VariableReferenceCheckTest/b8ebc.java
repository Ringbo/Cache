diff --git a/test/com/google/javascript/jscomp/Es6VariableReferenceCheckTest.java b/test/com/google/javascript/jscomp/Es6VariableReferenceCheckTest.java
index b64b2de..b708fd0 100644
--- a/test/com/google/javascript/jscomp/Es6VariableReferenceCheckTest.java
+++ b/test/com/google/javascript/jscomp/Es6VariableReferenceCheckTest.java
@@ -367,7 +367,7 @@
    * Expects the JS to generate one bad-read warning.
    */
   private void assertRedeclare(String js) {
-    testError(js, VariableReferenceCheck.REDECLARED_VARIABLE);
+    testWarning(js, VariableReferenceCheck.REDECLARED_VARIABLE);
   }
 
   /**
