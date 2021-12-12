diff --git a/src/main/java/tachyon/client/RawColumn.java b/src/main/java/tachyon/client/RawColumn.java
index 762cbe6..5d1a191 100644
--- a/src/main/java/tachyon/client/RawColumn.java
+++ b/src/main/java/tachyon/client/RawColumn.java
@@ -31,7 +31,7 @@
   }
 
   // TODO creating file here should be based on id.
-  public TachyonFile getPartition(int pId, boolean cachedMetadata) {
+  public TachyonFile getPartition(int pId, boolean cachedMetadata) throws IOException {
     return TFS.getFile(RAW_TABLE.getPath() + Constants.PATH_SEPARATOR + MasterInfo.COL +
         COLUMN_INDEX + Constants.PATH_SEPARATOR + pId, cachedMetadata);
   }
