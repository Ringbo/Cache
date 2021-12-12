diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index 9b559e5..f925fa7 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -659,7 +659,7 @@
         {
             InetAddress destination = iter.next();
             CompactEndpointSerializationHelper.serialize(destination, dos);
-            String id = MessagingService.instance().addCallback(handler, message, destination, message.getTimeout());
+            String id = MessagingService.instance().addCallback(handler, message, destination, message.getTimeout(), handler.consistencyLevel);
             dos.writeUTF(id);
         }
         message = message.withParameter(RowMutation.FORWARD_TO, bos.toByteArray());
