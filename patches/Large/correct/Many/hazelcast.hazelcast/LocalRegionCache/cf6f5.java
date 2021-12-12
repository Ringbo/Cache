diff --git a/hazelcast-hibernate/src/main/java/com/hazelcast/hibernate/local/LocalRegionCache.java b/hazelcast-hibernate/src/main/java/com/hazelcast/hibernate/local/LocalRegionCache.java
index a10a802..5ea97bc 100644
--- a/hazelcast-hibernate/src/main/java/com/hazelcast/hibernate/local/LocalRegionCache.java
+++ b/hazelcast-hibernate/src/main/java/com/hazelcast/hibernate/local/LocalRegionCache.java
@@ -193,7 +193,7 @@
                 if (v.getLock() == LOCK_SUCCESS) {
                     continue;
                 }
-                if (v.getCreationTime() + timeToLive > now) {
+                if (v.getCreationTime() + timeToLive < now) {
                     iter.remove();
                 } else if (maxSize > 0 && maxSize != Integer.MAX_VALUE) {
                     if (entries == null) {
