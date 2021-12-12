diff --git a/tslint/test/src/com/intellij/lang/javascript/linter/tslint/TsLintHighlightingTest.java b/tslint/test/src/com/intellij/lang/javascript/linter/tslint/TsLintHighlightingTest.java
index fc6a0dc..c7ebdee 100644
--- a/tslint/test/src/com/intellij/lang/javascript/linter/tslint/TsLintHighlightingTest.java
+++ b/tslint/test/src/com/intellij/lang/javascript/linter/tslint/TsLintHighlightingTest.java
@@ -44,7 +44,7 @@
   }
 
   public void testOne() {
-    doEditorHighlightingTest("one/one.ts");
+    doEditorHighlightingTest("one.ts");
   }
 
   public void testCustomConfigFileSupported() {
@@ -150,7 +150,7 @@
   }
 
   private void doFixTest(String mainFileName, String intentionDescription) {
-    String testDir = getTestName(true);
+    String testDir = getTestName(false);
     doEditorHighlightingTest(mainFileName + ".ts");
 
     IntentionAction intention = myFixture.getAvailableIntention(intentionDescription);
