diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
index 1ee1b7c..3e10c93 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
@@ -602,7 +602,7 @@
                 }
             }
         }
-        if (keys.isEmpty()) {
+        if (keySet.isEmpty()) {
             return result;
         }
         MapGetAllRequest request = new MapGetAllRequest(name, keySet);
