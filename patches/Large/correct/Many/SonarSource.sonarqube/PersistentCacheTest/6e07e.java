diff --git a/sonar-home/src/test/java/org/sonar/home/cache/PersistentCacheTest.java b/sonar-home/src/test/java/org/sonar/home/cache/PersistentCacheTest.java
index 8f8596e..e9abb0b 100644
--- a/sonar-home/src/test/java/org/sonar/home/cache/PersistentCacheTest.java
+++ b/sonar-home/src/test/java/org/sonar/home/cache/PersistentCacheTest.java
@@ -103,7 +103,7 @@
     assertCacheHit(false);
 
     File root = tmp.getRoot();
-    FileUtils.deleteDirectory(root);
+    FileUtils.deleteQuietly(root);
 
     // should re-create cache directory and start using the cache
     cache.reconfigure(false);
