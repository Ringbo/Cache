diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
index 2a569af..e935d41 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
@@ -508,7 +508,7 @@
                 }
             }
         }
-        if (keys.isEmpty()) {
+        if (keySet.isEmpty()) {
             return result;
         }
         MapGetAllRequest request = new MapGetAllRequest(name, keySet);
