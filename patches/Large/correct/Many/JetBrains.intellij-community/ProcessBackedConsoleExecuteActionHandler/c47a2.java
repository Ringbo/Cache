diff --git a/platform/lang-impl/src/com/intellij/execution/console/ProcessBackedConsoleExecuteActionHandler.java b/platform/lang-impl/src/com/intellij/execution/console/ProcessBackedConsoleExecuteActionHandler.java
index cc3a58b..2c957a4 100644
--- a/platform/lang-impl/src/com/intellij/execution/console/ProcessBackedConsoleExecuteActionHandler.java
+++ b/platform/lang-impl/src/com/intellij/execution/console/ProcessBackedConsoleExecuteActionHandler.java
@@ -75,6 +75,6 @@
 
   @Override
   public boolean value(LanguageConsoleImpl console) {
-    return isProcessTerminated();
+    return !isProcessTerminated();
   }
 }
\ No newline at end of file
