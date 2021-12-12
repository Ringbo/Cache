diff --git a/base/test/com/thoughtworks/go/util/ZipUtilTest.java b/base/test/com/thoughtworks/go/util/ZipUtilTest.java
index 4da07ea..7aca832 100644
--- a/base/test/com/thoughtworks/go/util/ZipUtilTest.java
+++ b/base/test/com/thoughtworks/go/util/ZipUtilTest.java
@@ -145,7 +145,7 @@
         File specialFile = new File(srcDir, "$`#?@!()?-_{}^'~.+=[];,a.txt");
         FileUtils.writeStringToFile(specialFile, "specialFile");
 
-        zipFile = zipUtil.zip(srcDir, temporaryFolder.newFolder(), Deflater.NO_COMPRESSION);
+        zipFile = zipUtil.zip(srcDir, temporaryFolder.newFile(), Deflater.NO_COMPRESSION);
         zipUtil.unzip(zipFile, destDir);
         File baseDir = new File(destDir, srcDir.getName());
 
