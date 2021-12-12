diff --git a/handlebars/test/src/com/dmarcotte/handlebars/editor/templates/HbsLiveTemplatesTest.java b/handlebars/test/src/com/dmarcotte/handlebars/editor/templates/HbsLiveTemplatesTest.java
index d4869f7..db56eb6 100644
--- a/handlebars/test/src/com/dmarcotte/handlebars/editor/templates/HbsLiveTemplatesTest.java
+++ b/handlebars/test/src/com/dmarcotte/handlebars/editor/templates/HbsLiveTemplatesTest.java
@@ -24,9 +24,9 @@
   }
 
   private void doTest() {
-    myFixture.configureByFiles(getTestName(false) + ".hbs");
+    myFixture.configureByFiles(getTestName(true) + ".hbs");
     expandTemplate();
-    myFixture.checkResultByFile(getTestName(false) + ".after.hbs");
+    myFixture.checkResultByFile(getTestName(true) + ".after.hbs");
   }
 
   public void testItar() {
