diff --git a/platform/lang-impl/src/com/intellij/execution/console/ConsoleExecuteAction.java b/platform/lang-impl/src/com/intellij/execution/console/ConsoleExecuteAction.java
index 878b257..b9e5046 100644
--- a/platform/lang-impl/src/com/intellij/execution/console/ConsoleExecuteAction.java
+++ b/platform/lang-impl/src/com/intellij/execution/console/ConsoleExecuteAction.java
@@ -144,7 +144,7 @@
       myPreserveMarkup = preserveMarkup;
     }
 
-    public final ConsoleHistoryModel getConsoleHistoryModel() {
+    public ConsoleHistoryModel getConsoleHistoryModel() {
       return myCommandHistoryModel;
     }
 
