diff --git a/driver-core/src/main/java/com/datastax/driver/core/Connection.java b/driver-core/src/main/java/com/datastax/driver/core/Connection.java
index 5aeaa33..824e5e5 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/Connection.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/Connection.java
@@ -1049,7 +1049,7 @@
         public void operationComplete(ChannelFuture future) throws Exception {
             // If we've closed the channel client side then we don't really want to defunct the connection, but
             // if there is remaining thread waiting on us, we still want to wake them up
-            if (isClosed()) {
+            if (!isInitialized || isClosed()) {
                 dispatcher.errorOutAllHandler(new TransportException(address, "Channel has been closed"));
                 // we still want to force so that the future completes
                 Connection.this.closeAsync().force();
