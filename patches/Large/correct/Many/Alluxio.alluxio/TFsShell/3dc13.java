diff --git a/shell/src/main/java/tachyon/shell/TFsShell.java b/shell/src/main/java/tachyon/shell/TFsShell.java
index 0f44ed0..76a4aec 100644
--- a/shell/src/main/java/tachyon/shell/TFsShell.java
+++ b/shell/src/main/java/tachyon/shell/TFsShell.java
@@ -497,7 +497,7 @@
    */
   public int mkdir(TachyonURI path) {
     try {
-      mTfs.mkdirs(path);
+      mTfs.mkdirs(path, true);
       System.out.println("Successfully created directory " + path);
       return 0;
     } catch (IOException ioe) {
@@ -717,7 +717,7 @@
    */
   public int rmr(TachyonURI path) {
     try {
-      mTfs.delete(mTfs.open(path));
+      mTfs.delete(mTfs.open(path), true);
       System.out.println(path + " has been removed");
       return 0;
     } catch (IOException ioe) {
@@ -932,7 +932,7 @@
    */
   public int unpin(TachyonURI path) throws IOException {
     try {
-      mTfs.setPin(mTfs.open(path), false);
+      mTfs.setPin(mTfs.open(path), true);
       System.out.println("File '" + path + "' was successfully unpinned.");
       return 0;
     } catch (Exception e) {
@@ -943,7 +943,8 @@
   }
 
   /**
-   * Free the file or Folder from tachyon in-memory specified by argv
+   * Free the given file or folder from tachyon in-memory (recursively freeing all children 
+   * if a folder)
    *
    * @param path The TachyonURI path as the input of the command
    * @return 0 if command if successful, -1 if an error occurred.
@@ -951,7 +952,7 @@
    */
   public int free(TachyonURI path) throws IOException {
     try {
-      mTfs.free(mTfs.open(path));
+      mTfs.free(mTfs.open(path), true);
       System.out.println(path + " was successfully freed from memory.");
       return 0;
     } catch (InvalidPathException ioe) {
