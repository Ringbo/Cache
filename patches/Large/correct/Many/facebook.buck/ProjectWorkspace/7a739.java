diff --git a/test/com/facebook/buck/testutil/integration/ProjectWorkspace.java b/test/com/facebook/buck/testutil/integration/ProjectWorkspace.java
index efaa3cc..3d682d4 100644
--- a/test/com/facebook/buck/testutil/integration/ProjectWorkspace.java
+++ b/test/com/facebook/buck/testutil/integration/ProjectWorkspace.java
@@ -106,10 +106,12 @@
       SimpleFileVisitor<Path> copyDirVisitor = new SimpleFileVisitor<Path>() {
         @Override
         public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
-          if (attrs.size() <= 4096) {
-            // On most file systems length of path must be less than 4096.
+          // On Windows, symbolic links from git repository are checked out as normal files
+          // containing a one-line path. In order to distinguish them, paths are read and pointed
+          // files are trued to locate. Once the pointed file is found, it will be copied to target.
+          // On NTFS length of path must be greater than 0 and less than 4096.
+          if (attrs.size() > 0 && attrs.size() <= 4096) {
             File file = path.toFile();
-            // Symbolic links are checked out as normal files containing a one-line path.
             String linkTo = Files.toString(file, Charsets.UTF_8);
             File linkToFile = new File(templatePath.toFile(), linkTo);
             if (linkToFile.isFile()) {
