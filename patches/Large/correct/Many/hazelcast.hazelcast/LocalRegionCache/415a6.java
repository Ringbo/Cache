diff --git a/hazelcast-hibernate/src/main/java/com/hazelcast/hibernate/local/LocalRegionCache.java b/hazelcast-hibernate/src/main/java/com/hazelcast/hibernate/local/LocalRegionCache.java
index 428c489..fb45dce 100644
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
