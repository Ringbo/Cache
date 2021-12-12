diff --git a/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/KahaDBStore.java b/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/KahaDBStore.java
index bd45394..3e0968e 100644
--- a/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/KahaDBStore.java
+++ b/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/KahaDBStore.java
@@ -1116,11 +1116,11 @@
 
     @Override
     public long getLastProducerSequenceId(ProducerId id) {
-        indexLock.readLock().lock();
+        indexLock.writeLock().lock();
         try {
             return metadata.producerSequenceIdTracker.getLastSeqId(id);
         } finally {
-            indexLock.readLock().unlock();
+            indexLock.writeLock().unlock();
         }
     }
 
