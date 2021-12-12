diff --git a/integration-tests/src/test/java/tachyon/client/FileOutStreamIntegrationTest.java b/integration-tests/src/test/java/tachyon/client/FileOutStreamIntegrationTest.java
index 996e92a..3f33e0c 100644
--- a/integration-tests/src/test/java/tachyon/client/FileOutStreamIntegrationTest.java
+++ b/integration-tests/src/test/java/tachyon/client/FileOutStreamIntegrationTest.java
@@ -227,13 +227,12 @@
   /**
    * Test writing to a file and specify the location to be localhost.
    *
-   * @throws IOException
-   * @throws InterruptedException
+   * @throws IOException if file can not be opened successfully.
    */
   @Test
-  public void writeSpecifyLocalTest() throws IOException, InterruptedException {
+  public void writeSpecifyLocalTest() throws IOException {
     TachyonURI filePath = new TachyonURI(PathUtils.uniqPath());
-    int len = 2;
+    final int len = 2;
     FileOutStream os = mTfs.getOutStream(filePath, sWriteLocal);
     os.write((byte) 0);
     os.write((byte) 1);
@@ -251,7 +250,7 @@
   @Test
   public void longWriteChangesSessionId() throws IOException, InterruptedException {
     TachyonURI filePath = new TachyonURI(PathUtils.uniqPath());
-    int len = 2;
+    final int len = 2;
     FileOutStream os = mTfs.getOutStream(filePath, sWriteUnderStore);
     os.write((byte) 0);
     Thread.sleep(mMasterTachyonConf.getInt(Constants.USER_HEARTBEAT_INTERVAL_MS) * 2);
