diff --git a/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/scm/TestSCMCli.java b/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/scm/TestSCMCli.java
index 19bc423..732221a 100644
--- a/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/scm/TestSCMCli.java
+++ b/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/scm/TestSCMCli.java
@@ -331,7 +331,7 @@
 
     openStatus = data.isOpen() ? "OPEN" : "CLOSED";
     expected = String
-        .format(formatStrWithHash, container.getContainerID(), openStatus,
+        .format(formatStr, container.getContainerID(), openStatus,
             data.getDBPath(), data.getContainerPath(), "",
             datanodeDetails.getHostName(), datanodeDetails.getHostName());
     assertEquals(expected, out.toString());
