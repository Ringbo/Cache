diff --git a/jetty-http2/http2-common/src/main/java/org/eclipse/jetty/http2/HTTP2Connection.java b/jetty-http2/http2-common/src/main/java/org/eclipse/jetty/http2/HTTP2Connection.java
index 7298b9e..8b54c36 100644
--- a/jetty-http2/http2-common/src/main/java/org/eclipse/jetty/http2/HTTP2Connection.java
+++ b/jetty-http2/http2-common/src/main/java/org/eclipse/jetty/http2/HTTP2Connection.java
@@ -64,7 +64,7 @@
     public void onUpgradeTo(ByteBuffer prefilled)
     {
         if (LOG.isDebugEnabled())
-            LOG.debug("HTTP2 onUpgradeTo {} {}", this, BufferUtil.toDebugString(prefilled));
+            LOG.debug("HTTP2 onUpgradeTo {} {}", this, BufferUtil.toDetailString(prefilled));
         producer.prefill(prefilled);
     }
     
