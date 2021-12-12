diff --git a/test/com/google/javascript/jscomp/ConstCheckTest.java b/test/com/google/javascript/jscomp/ConstCheckTest.java
index 3b061c5..1b7acf6 100644
--- a/test/com/google/javascript/jscomp/ConstCheckTest.java
+++ b/test/com/google/javascript/jscomp/ConstCheckTest.java
@@ -186,10 +186,10 @@
   public void testConstNameInExterns() {
     String externs = "/** @const */ var FOO;";
     String js = "FOO = 1;";
-    test(externs, js, (String) null, ConstCheck.CONST_REASSIGNED_VALUE_ERROR, null);
+    test(externs, js, (String) null, null, ConstCheck.CONST_REASSIGNED_VALUE_ERROR);
   }
 
   private void testError(String js) {
-    testError(js, ConstCheck.CONST_REASSIGNED_VALUE_ERROR);
+    testWarning(js, ConstCheck.CONST_REASSIGNED_VALUE_ERROR);
   }
 }
