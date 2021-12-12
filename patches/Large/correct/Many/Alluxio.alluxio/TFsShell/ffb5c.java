diff --git a/shell/src/main/java/tachyon/shell/TFsShell.java b/shell/src/main/java/tachyon/shell/TFsShell.java
index 76a4aec..d69c776 100644
--- a/shell/src/main/java/tachyon/shell/TFsShell.java
+++ b/shell/src/main/java/tachyon/shell/TFsShell.java
@@ -932,7 +932,7 @@
    */
   public int unpin(TachyonURI path) throws IOException {
     try {
-      mTfs.setPin(mTfs.open(path), true);
+      mTfs.unpin(mTfs.open(path));
       System.out.println("File '" + path + "' was successfully unpinned.");
       return 0;
     } catch (Exception e) {
