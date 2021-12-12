diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/ProxyHelper.java b/hazelcast-client/src/main/java/com/hazelcast/client/ProxyHelper.java
index f652170..dc3bae1 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/ProxyHelper.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/ProxyHelper.java
@@ -123,7 +123,7 @@
         request.setOperation(operation);
         request.setKey(key);
         request.setValue(value);
-        if (ttl > 0 && timeunit != null) {
+        if (ttl >= 0 && timeunit != null) {
             request.setTimeout(timeunit.toMillis(ttl));
         }
         return request;
