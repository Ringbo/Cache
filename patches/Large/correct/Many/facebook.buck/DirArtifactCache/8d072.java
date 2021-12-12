diff --git a/src/com/facebook/buck/rules/DirArtifactCache.java b/src/com/facebook/buck/rules/DirArtifactCache.java
index 12765de..60fdb2d 100644
--- a/src/com/facebook/buck/rules/DirArtifactCache.java
+++ b/src/com/facebook/buck/rules/DirArtifactCache.java
@@ -83,7 +83,7 @@
       // as valid artifacts during subsequent buck runs.
       tmpCacheEntry = File.createTempFile(ruleKey.toString(), ".tmp", cacheDir).toPath();
       Files.copy(output.toPath(), tmpCacheEntry, REPLACE_EXISTING);
-      Files.move(tmpCacheEntry, cacheEntry.toPath());
+      Files.move(tmpCacheEntry, cacheEntry.toPath(), REPLACE_EXISTING);
     } catch (IOException e) {
       logger.warn(e, "Artifact store(%s, %s) error",
           ruleKey,
