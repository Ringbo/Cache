diff --git a/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java b/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
index 0b46d11..c26ee6c 100644
--- a/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
+++ b/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
@@ -514,7 +514,7 @@
       index = (MapReduceIndex<K, V, FileContent>)custom;
     }
     else {
-      index = new MapReduceIndex<K, V, FileContent>(indexId, extension.getIndexer(), storage, extension.hasSnapshotMapping() ? extension.getKeyDescriptor() : null);
+      index = new MapReduceIndex<K, V, FileContent>(indexId, extension.getIndexer(), storage);
     }
 
     final KeyDescriptor<K> keyDescriptor = extension.getKeyDescriptor();
