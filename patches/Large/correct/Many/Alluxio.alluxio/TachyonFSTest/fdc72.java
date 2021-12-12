diff --git a/core/src/test/java/tachyon/client/TachyonFSTest.java b/core/src/test/java/tachyon/client/TachyonFSTest.java
index df6842d..194f4b1 100644
--- a/core/src/test/java/tachyon/client/TachyonFSTest.java
+++ b/core/src/test/java/tachyon/client/TachyonFSTest.java
@@ -262,9 +262,9 @@
   }
 
   private void getTestHelper(TachyonFS tfs) throws IOException {
-    int fileId = mTfs.createFile(new TachyonURI("/root/testFile1"));
+    int fileId = tfs.createFile(new TachyonURI("/root/testFile1"));
     Assert.assertEquals(3, fileId);
-    Assert.assertNotNull(mTfs.getFile(fileId));
+    Assert.assertNotNull(tfs.getFile(fileId));
   }
 
   @Test
