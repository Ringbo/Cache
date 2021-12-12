diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/caps/EntityCapsManager.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/caps/EntityCapsManager.java
index 75ffbf6..b8cfe13 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/caps/EntityCapsManager.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/caps/EntityCapsManager.java
@@ -199,7 +199,7 @@
         DiscoverInfo info = CAPS_CACHE.get(nodeVer);
 
         // If it was not in CAPS_CACHE, try to retrieve the information from persistentCache
-        if (info == null) {
+        if (info == null && persistentCache != null) {
             info = persistentCache.lookup(nodeVer);
             // Promote the information to CAPS_CACHE if one was found
             if (info != null) {
