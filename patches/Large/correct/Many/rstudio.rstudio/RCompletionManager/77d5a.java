diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
index 144a1cf..dc6a04e 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
@@ -2144,7 +2144,7 @@
          return "";
       
       // Exclude non-string and non-identifier tokens.
-      if (currentToken.hasType("operator", "comment", "numeric", "text"))
+      if (currentToken.hasType("operator", "comment", "numeric", "text", "punctuation"))
          return "";
       
       String tokenValue = currentToken.getValue();
