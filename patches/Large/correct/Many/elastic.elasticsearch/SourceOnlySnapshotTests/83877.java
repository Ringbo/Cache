diff --git a/x-pack/plugin/core/src/test/java/org/elasticsearch/snapshots/SourceOnlySnapshotTests.java b/x-pack/plugin/core/src/test/java/org/elasticsearch/snapshots/SourceOnlySnapshotTests.java
index 4e08f8e..48db059 100644
--- a/x-pack/plugin/core/src/test/java/org/elasticsearch/snapshots/SourceOnlySnapshotTests.java
+++ b/x-pack/plugin/core/src/test/java/org/elasticsearch/snapshots/SourceOnlySnapshotTests.java
@@ -303,7 +303,7 @@
     }
 
     static class DropFullDeletedSegmentsReader extends FilterDirectoryReader {
-        public DropFullDeletedSegmentsReader(DirectoryReader in) throws IOException {
+        DropFullDeletedSegmentsReader(DirectoryReader in) throws IOException {
             super(in, new SubReaderWrapper() {
                 @Override
                 protected LeafReader[] wrap(List<? extends LeafReader> readers) {
