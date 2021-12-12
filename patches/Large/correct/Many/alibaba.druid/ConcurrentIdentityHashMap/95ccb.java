diff --git a/src/main/java/com/alibaba/druid/util/ConcurrentIdentityHashMap.java b/src/main/java/com/alibaba/druid/util/ConcurrentIdentityHashMap.java
index b1d03c5..1b7b8ca 100644
--- a/src/main/java/com/alibaba/druid/util/ConcurrentIdentityHashMap.java
+++ b/src/main/java/com/alibaba/druid/util/ConcurrentIdentityHashMap.java
@@ -39,7 +39,7 @@
  * @param <K> the type of keys maintained by this map
  * @param <V> the type of mapped values
  */
-public final class ConcurrentIdentityHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
+public class ConcurrentIdentityHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
 
     /**
      * The default initial capacity for this table, used when not otherwise specified in a constructor.
@@ -853,7 +853,7 @@
      * @param m mappings to be stored in this map
      */
     @Override
-    public void putAll(Map<? extends K, ? extends V> m) {
+    public final void putAll(Map<? extends K, ? extends V> m) {
         for (Map.Entry<? extends K, ? extends V> e : m.entrySet()) {
             put(e.getKey(), e.getValue());
         }
