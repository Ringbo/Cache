diff --git a/hazelcast/src/test/java/com/hazelcast/map/MergePolicyTest.java b/hazelcast/src/test/java/com/hazelcast/map/MergePolicyTest.java
index 3468240..dd0d3cc 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/MergePolicyTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/MergePolicyTest.java
@@ -84,11 +84,11 @@
         IMap<Object, Object> map2 = h2.getMap(mapName);
         map1.put("key1", "value");
         // prevent updating at the same time
-        sleepAtLeastMillis(1);
+        sleepAtLeastMillis(1000);
         map2.put("key1", "LatestUpdatedValue");
         map2.put("key2", "value2");
         // prevent updating at the same time
-        sleepAtLeastMillis(1);
+        sleepAtLeastMillis(1000);
         map1.put("key2", "LatestUpdatedValue2");
 
         // allow merge process to continue
