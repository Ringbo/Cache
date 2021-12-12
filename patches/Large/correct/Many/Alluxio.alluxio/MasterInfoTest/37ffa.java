diff --git a/core/src/test/java/tachyon/master/MasterInfoTest.java b/core/src/test/java/tachyon/master/MasterInfoTest.java
index 41fccb7..0fac0e5 100644
--- a/core/src/test/java/tachyon/master/MasterInfoTest.java
+++ b/core/src/test/java/tachyon/master/MasterInfoTest.java
@@ -359,7 +359,7 @@
     mMasterInfo.createFile("testFile", Constants.DEFAULT_BLOCK_SIZE_BYTE);
   }
 
-  @Test(expected = InvalidPathException.class)
+  @Test(expected = FileAlreadyExistException.class)
   public void createFileInvalidPathTest2() throws InvalidPathException, FileAlreadyExistException,
       BlockInfoException, TachyonException {
     mMasterInfo.createFile("/", Constants.DEFAULT_BLOCK_SIZE_BYTE);
