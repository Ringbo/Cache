diff --git a/h2/src/main/org/h2/mvstore/MVStore.java b/h2/src/main/org/h2/mvstore/MVStore.java
index a9dfdf2..c67d294 100644
--- a/h2/src/main/org/h2/mvstore/MVStore.java
+++ b/h2/src/main/org/h2/mvstore/MVStore.java
@@ -1538,7 +1538,7 @@
             }
         }
 
-        private void registerChunk(int chunkId) {
+        void registerChunk(int chunkId) {
             if (referencedChunks.put(chunkId, 1) == null && parent != null) {
                 parent.registerChunk(chunkId);
             }
