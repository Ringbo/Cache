diff --git a/integration-tests/src/test/java/tachyon/master/JournalIntegrationTest.java b/integration-tests/src/test/java/tachyon/master/JournalIntegrationTest.java
index 45312b5..7b9e29b 100644
--- a/integration-tests/src/test/java/tachyon/master/JournalIntegrationTest.java
+++ b/integration-tests/src/test/java/tachyon/master/JournalIntegrationTest.java
@@ -193,18 +193,18 @@
   public void DeleteTest() throws Exception {
     for (int i = 0; i < 10; i ++) {
       String dirPath = "/i" + i;
-      mTfs.mkdirs(new TachyonURI(dirPath));
+      mTfs.mkdirs(new TachyonURI(dirPath), true);
       for (int j = 0; j < 10; j ++) {
         ClientOptions option =
             new ClientOptions.Builder(mMasterTachyonConf).setBlockSize((i + j + 1) * 64).build();
         String filePath = dirPath + "/j" + j;
         mTfs.getOutStream(new TachyonURI(filePath), option).close();
         if (j >= 5) {
-          mTfs.delete(mTfs.open(new TachyonURI(filePath)));
+          mTfs.delete(mTfs.open(new TachyonURI(filePath)), true);
         }
       }
       if (i >= 5) {
-        mTfs.delete(mTfs.open(new TachyonURI(dirPath)));
+        mTfs.delete(mTfs.open(new TachyonURI(dirPath)), true);
       }
     }
     mLocalTachyonCluster.stopTFS();
