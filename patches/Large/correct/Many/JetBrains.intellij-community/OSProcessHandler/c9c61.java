diff --git a/execution/openapi/com/intellij/execution/process/OSProcessHandler.java b/execution/openapi/com/intellij/execution/process/OSProcessHandler.java
index 8b40abc..bb8ae5b 100644
--- a/execution/openapi/com/intellij/execution/process/OSProcessHandler.java
+++ b/execution/openapi/com/intellij/execution/process/OSProcessHandler.java
@@ -248,7 +248,7 @@
             return -1;
           }
           try {
-            Thread.sleep(50);
+            Thread.sleep(3);
           }
           catch (InterruptedException ignore) {
           }
