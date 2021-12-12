diff --git a/hazelcast/src/main/java/com/hazelcast/impl/ClientHandlerService.java b/hazelcast/src/main/java/com/hazelcast/impl/ClientHandlerService.java
index 628f2e2..ef40c24 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/ClientHandlerService.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/ClientHandlerService.java
@@ -665,7 +665,7 @@
         abstract void processCall(Packet packet, SemaphoreProxy semaphoreProxy, Integer value, boolean flag);
 
         public void processCall(Node node, Packet packet) {
-            final SemaphoreProxy semaphoreProxy = (SemaphoreProxy) factory.getSemaphore(packet.name);
+            final SemaphoreProxy semaphoreProxy = (SemaphoreProxy) factory.getOrCreateProxyByName(packet.name);
             final Integer value = (Integer) toObject(packet.getValueData());
             final boolean flag = (Boolean) toObject(packet.getKeyData());
             processCall(packet, semaphoreProxy, value, flag);
@@ -688,7 +688,7 @@
     private class SemaphoreCancelAcquireHandler extends ClientOperationHandler {
         public void processCall(Node node, Packet packet) {
             ConcurrentMapManager.MSemaphore msemaphore = node.concurrentMapManager.new MSemaphore();
-            packet.setValue(toData(msemaphore.cancelAcquire(toData(packet.name))));
+            packet.setValue(toData(msemaphore.cancelAcquire(toData(packet.name.substring(Prefix.SEMAPHORE.length())))));
         }
     }
 
@@ -720,7 +720,7 @@
         void processCall(Packet packet, SemaphoreProxy semaphoreProxy, Integer permits, boolean detach) {
             if (detach) {
                 semaphoreProxy.releaseDetach(permits);
-                getClientEndpoint(packet.conn).attachDetachPermits(packet.name, -permits);
+                getClientEndpoint(packet.conn).attachDetachPermits(semaphoreProxy.getName(), -permits);
             } else {
                 semaphoreProxy.release(permits);
             }
@@ -734,7 +734,7 @@
                 if (attach) {
                     acquired = semaphoreProxy.tryAcquireAttach(permits, packet.timeout, TimeUnit.MILLISECONDS);
                     if (acquired) {
-                        getClientEndpoint(packet.conn).attachDetachPermits(packet.name, permits);
+                        getClientEndpoint(packet.conn).attachDetachPermits(semaphoreProxy.getName(), permits);
                     }
                 } else {
                     acquired = semaphoreProxy.tryAcquire(permits, packet.timeout, TimeUnit.MILLISECONDS);
