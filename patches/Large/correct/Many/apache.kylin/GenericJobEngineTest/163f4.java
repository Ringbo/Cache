diff --git a/job/src/test/java/com/kylinolap/job/engine/GenericJobEngineTest.java b/job/src/test/java/com/kylinolap/job/engine/GenericJobEngineTest.java
index 47974fc..d7d1486 100644
--- a/job/src/test/java/com/kylinolap/job/engine/GenericJobEngineTest.java
+++ b/job/src/test/java/com/kylinolap/job/engine/GenericJobEngineTest.java
@@ -117,7 +117,7 @@
         System.setProperty(KylinConfig.KYLIN_CONF, tempTestMetadataUrl);
 
         // deploy files to hdfs
-        SSHClient hadoopCli = new SSHClient(getHadoopCliHostname(), getHadoopCliUsername(), getHadoopCliPassword(), null);
+        SSHClient hadoopCli = new SSHClient(getHadoopCliHostname(), getHadoopCliUsername(), getHadoopCliPassword());
         scpFilesToHdfs(hadoopCli, new String[] { "src/test/resources/json/dummy_jobinstance.json" }, mrInputDir);
         // deploy sample java jar
         hadoopCli.scpFileToRemote("src/test/resources/jarfile/SampleJavaProgram.jarfile", "/tmp");
@@ -156,7 +156,7 @@
 
     @Before
     public void before() throws Exception {
-        SSHClient hadoopCli = new SSHClient(getHadoopCliHostname(), getHadoopCliUsername(), getHadoopCliPassword(), null);
+        SSHClient hadoopCli = new SSHClient(getHadoopCliHostname(), getHadoopCliUsername(), getHadoopCliPassword());
         removeHdfsDir(hadoopCli, mrOutputDir1);
         removeHdfsDir(hadoopCli, mrOutputDir2);
 
