diff --git a/core/src/test/java/tachyon/master/MasterFaultToleranceTest.java b/core/src/test/java/tachyon/master/MasterFaultToleranceTest.java
index 18f9e56..8d1482f 100644
--- a/core/src/test/java/tachyon/master/MasterFaultToleranceTest.java
+++ b/core/src/test/java/tachyon/master/MasterFaultToleranceTest.java
@@ -89,7 +89,7 @@
    */
   private void faultTestDataCheck(List<Pair<Integer, String>> answer) throws IOException {
     TachyonFS tfs = mLocalTachyonClusterMultiMaster.getClient();
-    List<String> files = mTfs.ls(Constants.PATH_SEPARATOR, true);
+    List<String> files = tfs.ls(Constants.PATH_SEPARATOR, true);
     if (answer.size() != files.size()) {
       System.out.println("Files===========================");
       for (int k = 0; k < files.size(); k ++) {
