diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
index 4231d29..062111f 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
@@ -238,7 +238,7 @@
             }
 
             Broadcaster existingOne = store.putIfAbsent(id, createBroadcaster(c, id));
-            if (existingOne == null) {
+            if (existingOne != null) {
                 logger.debug("Added Broadcaster {} . Factory size: {}", id, store.size());
             } else {
                 logger.warn("Duplicate Broadcaster's name {}. You must invoke Broadcaster.destroy() on that instance to prevent memory leak.", existingOne);
