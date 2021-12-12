diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
index 3b58a09..c318813 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
@@ -1129,7 +1129,7 @@
          if (results.length == 0)
          {
             boolean lastInputWasTab =
-                  (nativeEvent_ != null && nativeEvent_.getKeyCode() != KeyCodes.KEY_TAB);
+                  (nativeEvent_ != null && nativeEvent_.getKeyCode() == KeyCodes.KEY_TAB);
             
             boolean lineIsWhitespace = docDisplay_.getCurrentLine().matches("^\\s*$");
             
