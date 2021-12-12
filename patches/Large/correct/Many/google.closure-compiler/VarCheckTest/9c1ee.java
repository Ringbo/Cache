diff --git a/test/com/google/javascript/jscomp/VarCheckTest.java b/test/com/google/javascript/jscomp/VarCheckTest.java
index 79d60c3..f23a762 100644
--- a/test/com/google/javascript/jscomp/VarCheckTest.java
+++ b/test/com/google/javascript/jscomp/VarCheckTest.java
@@ -107,12 +107,12 @@
 
   public void testVarReferenceInExterns() {
     testSame("asdf;", "var asdf;",
-        VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR, true);
+        VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR);
   }
 
   public void testCallInExterns() {
     testSame("yz();", "function yz() {}",
-        VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR, true);
+        VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR);
   }
 
   public void testPropReferenceInExterns1() {
