diff --git a/core/src/test/java/tachyon/master/MasterFaultToleranceTest.java b/core/src/test/java/tachyon/master/MasterFaultToleranceTest.java
index 2afa78f..67e40f8 100644
--- a/core/src/test/java/tachyon/master/MasterFaultToleranceTest.java
+++ b/core/src/test/java/tachyon/master/MasterFaultToleranceTest.java
@@ -89,7 +89,7 @@
    */
   private void faultTestDataCheck(List<Pair<Integer, String>> answer) throws IOException {
     TachyonFS tfs = mLocalTachyonClusterMultiMaster.getClient();
-    List<String> files = mTfs.ls(Constants.PATH_SEPARATOR, true);
+    List<String> files = tfs.ls(Constants.PATH_SEPARATOR, true);
     Assert.assertEquals(answer.size(), files.size());
     for (int k = 0; k < answer.size(); k ++) {
       Assert.assertEquals(answer.get(k).getSecond(), tfs.getFile(answer.get(k).getFirst())
