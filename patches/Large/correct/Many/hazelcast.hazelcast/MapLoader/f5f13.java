diff --git a/hazelcast/src/main/java/com/hazelcast/core/MapLoader.java b/hazelcast/src/main/java/com/hazelcast/core/MapLoader.java
index 5d54cd5..73d69df 100644
--- a/hazelcast/src/main/java/com/hazelcast/core/MapLoader.java
+++ b/hazelcast/src/main/java/com/hazelcast/core/MapLoader.java
@@ -32,7 +32,7 @@
  * will be placed into the distributed map and they will stay in-memory until they are
  * explicitly removed or implicitly evicted (if eviction is configured).
  */
-public interface MapLoader {
+public interface MapLoader<K, V> {
     /**
      * Loads the value of a given key. If distributed map doesn't contain the value
      * for the given key then Hazelcast will call implementation's load (key) method
@@ -42,7 +42,7 @@
      * @param key
      * @return value of the key
      */
-    Object load(Object key);
+    V load(K key);
 
     /**
      * Loads given keys. This is batch load operation so that implementation can
@@ -51,5 +51,5 @@
      * @param keys keys of the values entries to load
      * @return map of loaded key-value pairs.
      */
-    Map loadAll(Collection keys);
+    Map<K, V> loadAll(Collection<K> keys);
 }
\ No newline at end of file
