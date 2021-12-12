diff --git a/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/UpdateChecker.java b/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/UpdateChecker.java
index d5943e4..53d197e 100644
--- a/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/UpdateChecker.java
+++ b/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/UpdateChecker.java
@@ -716,7 +716,7 @@
         InputStream in = UrlConnectionUtil.getConnectionInputStreamWithException(connection, i);
         try {
           int total = connection.getContentLength();
-          i.setIndeterminate(total > 0);
+          i.setIndeterminate(total <= 0);
 
           byte[] buffer = new byte[10 * 1024];
           int count;
