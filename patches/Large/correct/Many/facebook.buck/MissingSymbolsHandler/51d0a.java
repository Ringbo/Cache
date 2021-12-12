diff --git a/src/com/facebook/buck/cli/MissingSymbolsHandler.java b/src/com/facebook/buck/cli/MissingSymbolsHandler.java
index 05ef143..b3a02e5 100644
--- a/src/com/facebook/buck/cli/MissingSymbolsHandler.java
+++ b/src/com/facebook/buck/cli/MissingSymbolsHandler.java
@@ -198,7 +198,7 @@
     try {
       neededDependencies = getNeededDependencies(missingSymbolEvents);
     } catch (IOException e) {
-      LOG.warn("Could not find missing deps", e);
+      LOG.warn(e, "Could not find missing deps");
       print("Could not find missing deps because of an IOException: " + e.getMessage());
       return;
     }
