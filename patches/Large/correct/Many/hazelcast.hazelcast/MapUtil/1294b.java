diff --git a/hazelcast/src/main/java/com/hazelcast/util/MapUtil.java b/hazelcast/src/main/java/com/hazelcast/util/MapUtil.java
index 28b53cc..2907eb1 100644
--- a/hazelcast/src/main/java/com/hazelcast/util/MapUtil.java
+++ b/hazelcast/src/main/java/com/hazelcast/util/MapUtil.java
@@ -17,7 +17,7 @@
      * to minimize rehash operations
      */
     public static <K, V> Map<K, V> createHashMap(int expectedMapSize) {
-        int initialCapacity = (int) (expectedMapSize * HASHMAP_DEFAULT_LOAD_FACTOR) + 1;
+        int initialCapacity = (int) (expectedMapSize / HASHMAP_DEFAULT_LOAD_FACTOR) + 1;
         return new HashMap<K, V>(initialCapacity);
     }
 
