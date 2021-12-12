diff --git a/test/com/google/javascript/jscomp/StrictModeCheckTest.java b/test/com/google/javascript/jscomp/StrictModeCheckTest.java
index 39627b8..75929cc 100644
--- a/test/com/google/javascript/jscomp/StrictModeCheckTest.java
+++ b/test/com/google/javascript/jscomp/StrictModeCheckTest.java
@@ -44,7 +44,7 @@
 
   private void testSameEs6Strict(String js) {
     setAcceptedLanguage(LanguageMode.ECMASCRIPT_2015);
-    testSame(js, js);
+    testSame(js);
   }
 
   public void testUseOfWith1() {
