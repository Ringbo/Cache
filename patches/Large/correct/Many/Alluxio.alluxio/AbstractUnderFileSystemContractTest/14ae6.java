diff --git a/core/common/src/test/java/alluxio/underfs/AbstractUnderFileSystemContractTest.java b/core/common/src/test/java/alluxio/underfs/AbstractUnderFileSystemContractTest.java
index 6f3b8df..15c1d0c 100644
--- a/core/common/src/test/java/alluxio/underfs/AbstractUnderFileSystemContractTest.java
+++ b/core/common/src/test/java/alluxio/underfs/AbstractUnderFileSystemContractTest.java
@@ -93,7 +93,7 @@
   @Test
   public void createAtomic() throws IOException {
     String testFile = PathUtils.concatPath(mUnderfsAddress, "createAtomic");
-    OutputStream stream = mUfs.create(testFile);
+    OutputStream stream = mUfs.create(testFile, CreateOptions.defaults().setEnsureAtomic(true));
     stream.write(TEST_BYTES);
     Assert.assertFalse(mUfs.isFile(testFile));
     stream.close();
