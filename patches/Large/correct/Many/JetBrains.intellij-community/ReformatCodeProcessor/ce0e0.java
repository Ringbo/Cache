diff --git a/platform/lang-impl/src/com/intellij/codeInsight/actions/ReformatCodeProcessor.java b/platform/lang-impl/src/com/intellij/codeInsight/actions/ReformatCodeProcessor.java
index 326cfea..79d1c80 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/actions/ReformatCodeProcessor.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/actions/ReformatCodeProcessor.java
@@ -127,10 +127,10 @@
           CaretVisualPositionKeeper caretPositionKeeper = new CaretVisualPositionKeeper(document);
 
           if (processChangedTextOnly) {
-            CodeStyleManager.getInstance(myProject).reformatText(file, ranges);
+            CodeStyleManager.getInstance(myProject).reformatTextWithContext(file, ranges);
           }
           else {
-            CodeStyleManager.getInstance(myProject).reformatTextWithContext(file, ranges);
+            CodeStyleManager.getInstance(myProject).reformatText(file, ranges);
           }
 
           caretPositionKeeper.restoreOriginalLocation();
