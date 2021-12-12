diff --git a/java/org/apache/coyote/http11/upgrade/AprServletOutputStream.java b/java/org/apache/coyote/http11/upgrade/AprServletOutputStream.java
index 9f92a71..cdac3f9 100644
--- a/java/org/apache/coyote/http11/upgrade/AprServletOutputStream.java
+++ b/java/org/apache/coyote/http11/upgrade/AprServletOutputStream.java
@@ -141,7 +141,7 @@
                 throw new EOFException(sm.getString("apr.clientAbort"));
             } else if (written < 0) {
                 throw new IOException(sm.getString("apr.write.error",
-                        Integer.valueOf(-written), Long.valueOf(socket)));
+                        Integer.valueOf(-written), Long.valueOf(socket), wrapper));
             }
             start += written;
             left -= written;
