diff --git a/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-hs/src/test/java/org/apache/hadoop/mapreduce/v2/hs/webapp/TestHsWebServices.java b/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-hs/src/test/java/org/apache/hadoop/mapreduce/v2/hs/webapp/TestHsWebServices.java
index 45a464e..66b3663 100644
--- a/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-hs/src/test/java/org/apache/hadoop/mapreduce/v2/hs/webapp/TestHsWebServices.java
+++ b/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-hs/src/test/java/org/apache/hadoop/mapreduce/v2/hs/webapp/TestHsWebServices.java
@@ -348,7 +348,7 @@
       String hadoopBuildVersion, String hadoopVersion, long startedon) {
     WebServicesTestUtils.checkStringMatch("hadoopVersionBuiltOn",
         VersionInfo.getDate(), hadoopVersionBuiltOn);
-    WebServicesTestUtils.checkStringMatch("hadoopBuildVersion",
+    WebServicesTestUtils.checkStringEqual("hadoopBuildVersion",
         VersionInfo.getBuildVersion(), hadoopBuildVersion);
     WebServicesTestUtils.checkStringMatch("hadoopVersion",
         VersionInfo.getVersion(), hadoopVersion);
