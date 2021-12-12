diff --git a/servers/src/main/java/tachyon/worker/block/meta/StorageTierView.java b/servers/src/main/java/tachyon/worker/block/meta/StorageTierView.java
index aa1e907..eb5c43f 100644
--- a/servers/src/main/java/tachyon/worker/block/meta/StorageTierView.java
+++ b/servers/src/main/java/tachyon/worker/block/meta/StorageTierView.java
@@ -63,9 +63,9 @@
    * Get a StorageDirView with a dirIndex
    *
    * @param dirIndex of the dirView requested
-   * @throws IOException if dirIndex is out of range
+   * @throws IndexOutOfBoundsException if dirIndex is out of range
    */
-  public StorageDirView getDirView(int dirIndex) throws IOException {
+  public StorageDirView getDirView(int dirIndex) {
     return mDirViews.get(dirIndex);
   }
 
