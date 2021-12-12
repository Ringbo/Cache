diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/NCSARequestLog.java b/jetty-server/src/main/java/org/eclipse/jetty/server/NCSARequestLog.java
index 78cac3a..8e725bd 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/NCSARequestLog.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/NCSARequestLog.java
@@ -485,7 +485,7 @@
             if (_logDateCache != null)
                 buf.append(_logDateCache.format(request.getTimeStamp()));
             else
-                buf.write(request.getTimeStampBuffer().toString());
+                buf.append(request.getTimeStamp());
 
             buf.append("] \"");
             buf.append(request.getMethod());
@@ -506,7 +506,7 @@
             else
                 buf.append("Async");
 
-            long responseLength = response.getContentCount();
+            long responseLength = response.getLongContentLength();
             if (responseLength >= 0)
             {
                 buf.append(' ');
