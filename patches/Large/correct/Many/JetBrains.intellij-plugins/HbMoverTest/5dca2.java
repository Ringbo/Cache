diff --git a/handlebars/test/src/com/dmarcotte/handlebars/editor/actions/HbMoverTest.java b/handlebars/test/src/com/dmarcotte/handlebars/editor/actions/HbMoverTest.java
index e009f3f..4f66dc2 100644
--- a/handlebars/test/src/com/dmarcotte/handlebars/editor/actions/HbMoverTest.java
+++ b/handlebars/test/src/com/dmarcotte/handlebars/editor/actions/HbMoverTest.java
@@ -16,9 +16,9 @@
   }
 
   private void doTest(@NotNull String ext) {
-    myFixture.configureByFile(getTestName(true) + "." + ext);
+    myFixture.configureByFile(getTestName(false) + "." + ext);
     myFixture.performEditorAction(IdeActions.ACTION_MOVE_STATEMENT_UP_ACTION);
-    myFixture.checkResultByFile(getTestName(true) + "_after." + ext);
+    myFixture.checkResultByFile(getTestName(false) + "_after." + ext);
   }
   
   @NotNull
