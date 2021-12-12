diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
index 8d690fb..144a1cf 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/console/shell/assist/RCompletionManager.java
@@ -2144,7 +2144,7 @@
          return "";
       
       // Exclude non-string and non-identifier tokens.
-      if (currentToken.hasType("operator", "comment", "numeric"))
+      if (currentToken.hasType("operator", "comment", "numeric", "text"))
          return "";
       
       String tokenValue = currentToken.getValue();
