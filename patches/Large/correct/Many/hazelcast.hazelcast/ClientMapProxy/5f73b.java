diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
index 08eaa16..b34677a 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
@@ -546,7 +546,7 @@
         if (keys.isEmpty()) {
             return;
         }
-        final Collection<Data> dataKeys = convertKeysToData(keys);
+        final List<Data> dataKeys = convertKeysToData(keys);
         if (replaceExistingValues) {
             invalidateNearCache(dataKeys);
         }
@@ -555,7 +555,7 @@
     }
 
     // todo duplicate code.
-    private <K> Collection<Data> convertKeysToData(Set<K> keys) {
+    private <K> List<Data> convertKeysToData(Set<K> keys) {
         if (keys == null || keys.isEmpty()) {
             return Collections.emptyList();
         }
