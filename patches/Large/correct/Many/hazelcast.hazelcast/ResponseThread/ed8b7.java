diff --git a/hazelcast/src/main/java/com/hazelcast/spi/impl/operationexecutor/classic/ResponseThread.java b/hazelcast/src/main/java/com/hazelcast/spi/impl/operationexecutor/classic/ResponseThread.java
index 756c6a5..b08db03 100644
--- a/hazelcast/src/main/java/com/hazelcast/spi/impl/operationexecutor/classic/ResponseThread.java
+++ b/hazelcast/src/main/java/com/hazelcast/spi/impl/operationexecutor/classic/ResponseThread.java
@@ -96,7 +96,7 @@
             responsePacketHandler.handle(responsePacket);
         } catch (Throwable e) {
             inspectOutputMemoryError(e);
-            logger.severe("Failed to process response: " + responsePacket + " on response thread:" + getName());
+            logger.severe("Failed to process response: " + responsePacket + " on response thread:" + getName(), e);
         }
     }
 
