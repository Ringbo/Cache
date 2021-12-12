diff --git a/app/src/cc/arduino/contributions/packages/ui/InstallerJDialogUncaughtExceptionHandler.java b/app/src/cc/arduino/contributions/packages/ui/InstallerJDialogUncaughtExceptionHandler.java
index 048e1ab..80694f1 100644
--- a/app/src/cc/arduino/contributions/packages/ui/InstallerJDialogUncaughtExceptionHandler.java
+++ b/app/src/cc/arduino/contributions/packages/ui/InstallerJDialogUncaughtExceptionHandler.java
@@ -47,7 +47,7 @@
 
   @Override
   public void uncaughtException(Thread t, final Throwable e) {
-    String errorMessage = _(e.getMessage().substring(e.getMessage().indexOf(":") + 2));
+    String errorMessage = _(e.getMessage().substring(e.getMessage().indexOf(":") + 1));
     if (errorMessage.startsWith("Error downloading")) {
       errorMessage = connectionErrorMessage;
     }
