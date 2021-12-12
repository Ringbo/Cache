diff --git a/lang-api/src/com/intellij/openapi/command/WriteCommandAction.java b/lang-api/src/com/intellij/openapi/command/WriteCommandAction.java
index 162b04e..32fcb2c 100644
--- a/lang-api/src/com/intellij/openapi/command/WriteCommandAction.java
+++ b/lang-api/src/com/intellij/openapi/command/WriteCommandAction.java
@@ -73,7 +73,7 @@
         }
       };
       Application application = ApplicationManager.getApplication();
-      if (application.isWriteAccessAllowed()) {
+      if (application.isWriteAccessAllowed() || application.isDispatchThread()) {
         runnable.run();
       }
       else {
