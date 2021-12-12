diff --git a/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java b/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
index 4899bcd..e83a755 100644
--- a/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
+++ b/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
@@ -2113,7 +2113,7 @@
       final VirtualFile file = fileContent.getVirtualFile();
       final boolean reallyRemoved = myFilesToUpdate.remove(file);
       if (reallyRemoved && file.isValid()) {
-        if (onlyRemoveOutdatedData) {
+        if (onlyRemoveOutdatedData || isTooLarge(file)) {
           // on shutdown there is no need to re-index the file, just remove outdated data from indices
           final List<ID<?, ?>> affected = new ArrayList<ID<?, ?>>();
           for (final ID<?, ?> indexId : myRequiringContentIndices) {  // non requiring content indices should be flushed
