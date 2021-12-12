diff --git a/src/main/java/com/google/devtools/build/lib/remote/SimpleBlobStoreActionCache.java b/src/main/java/com/google/devtools/build/lib/remote/SimpleBlobStoreActionCache.java
index 85a06fe..af7920e 100644
--- a/src/main/java/com/google/devtools/build/lib/remote/SimpleBlobStoreActionCache.java
+++ b/src/main/java/com/google/devtools/build/lib/remote/SimpleBlobStoreActionCache.java
@@ -197,7 +197,7 @@
       if (file.isDirectory()) {
         // TODO(olaola): to implement this for a directory, will need to create or pass a
         // TreeNodeRepository to call uploadTree.
-        throw new UnsupportedOperationException("Storing a directory is not yet supported.");
+        throw new IOException("Storing a directory is not yet supported.");
       }
       // TODO(olaola): inline small file contents here.
       // First put the file content to cache.
