diff --git a/hazelcast/src/main/java/com/hazelcast/internal/adapter/TransactionalMapDataStructureAdapter.java b/hazelcast/src/main/java/com/hazelcast/internal/adapter/TransactionalMapDataStructureAdapter.java
index 1335e7c..0d28e99 100644
--- a/hazelcast/src/main/java/com/hazelcast/internal/adapter/TransactionalMapDataStructureAdapter.java
+++ b/hazelcast/src/main/java/com/hazelcast/internal/adapter/TransactionalMapDataStructureAdapter.java
@@ -72,7 +72,7 @@
     @Override
     public void set(K key, V value) {
         begin();
-        transactionalMap.put(key, value);
+        transactionalMap.set(key, value);
         commit();
     }
 
