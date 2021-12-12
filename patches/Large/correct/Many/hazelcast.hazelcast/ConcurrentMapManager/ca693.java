diff --git a/hazelcast/src/main/java/com/hazelcast/impl/ConcurrentMapManager.java b/hazelcast/src/main/java/com/hazelcast/impl/ConcurrentMapManager.java
index b01c711..85eb787 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/ConcurrentMapManager.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/ConcurrentMapManager.java
@@ -546,7 +546,7 @@
         }
         for (Future<Pairs> future : lsFutures) {
             Pairs pairs = future.get();
-            if (pairs != null) {
+            if (pairs != null && pairs.getKeyValues()!=null) {
                 for (KeyValue keyValue : pairs.getKeyValues()) {
                     results.addKeyValue(keyValue);
                 }
