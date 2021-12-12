diff --git a/engine/src/main/java/org/terasology/persistence/internal/StoragePathProvider.java b/engine/src/main/java/org/terasology/persistence/internal/StoragePathProvider.java
index 8f65097..e72050d 100644
--- a/engine/src/main/java/org/terasology/persistence/internal/StoragePathProvider.java
+++ b/engine/src/main/java/org/terasology/persistence/internal/StoragePathProvider.java
@@ -124,7 +124,7 @@
     }
 
     public Path getChunkPath(Vector3i chunkPos) {
-        return worldsPath.resolve(getChunkFilename(chunkPos));
+        return worldPath.resolve(getChunkFilename(chunkPos));
     }
 
     public Path getChunkTempPath(Vector3i chunkPos) {
