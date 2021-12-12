diff --git a/core/src/main/java/io/undertow/protocols/ssl/SslConduit.java b/core/src/main/java/io/undertow/protocols/ssl/SslConduit.java
index ce36a54..453f9f1 100644
--- a/core/src/main/java/io/undertow/protocols/ssl/SslConduit.java
+++ b/core/src/main/java/io/undertow/protocols/ssl/SslConduit.java
@@ -612,7 +612,7 @@
             engine.closeInbound();
         } catch (SSLException e) {
             UndertowLogger.REQUEST_IO_LOGGER.trace("Exception closing read side of SSL channel", e);
-            IoUtils.safeClose(delegate);
+            IoUtils.safeClose(connection, delegate);
         }
 
         state |= FLAG_READ_CLOSED | FLAG_ENGINE_INBOUND_SHUTDOWN | FLAG_READ_SHUTDOWN;
