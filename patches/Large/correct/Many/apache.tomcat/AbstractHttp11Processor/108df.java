diff --git a/java/org/apache/coyote/http11/AbstractHttp11Processor.java b/java/org/apache/coyote/http11/AbstractHttp11Processor.java
index 63fe799..0e6f672 100644
--- a/java/org/apache/coyote/http11/AbstractHttp11Processor.java
+++ b/java/org/apache/coyote/http11/AbstractHttp11Processor.java
@@ -1637,9 +1637,8 @@
     @Override
     public SocketState upgradeDispatch(SocketStatus status) throws IOException {
         // Should never reach this code but in case we do...
-        // TODO
-        throw new IOException(
-                sm.getString("TODO"));
+        throw new IllegalStateException(
+                sm.getString("http11Processor.upgrade"));
     }
 
 
