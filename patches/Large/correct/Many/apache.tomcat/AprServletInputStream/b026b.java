diff --git a/java/org/apache/coyote/http11/upgrade/AprServletInputStream.java b/java/org/apache/coyote/http11/upgrade/AprServletInputStream.java
index dcc515e..24f9ff8 100644
--- a/java/org/apache/coyote/http11/upgrade/AprServletInputStream.java
+++ b/java/org/apache/coyote/http11/upgrade/AprServletInputStream.java
@@ -100,7 +100,7 @@
             throw new EOFException(sm.getString("apr.clientAbort"));
         } else {
             throw new IOException(sm.getString("apr.read.error",
-                    Integer.valueOf(-result), Long.valueOf(socket)));
+                    Integer.valueOf(-result), Long.valueOf(socket), wrapper));
         }
     }
 
