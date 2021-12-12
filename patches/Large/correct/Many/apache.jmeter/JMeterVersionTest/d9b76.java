diff --git a/test/src/org/apache/jmeter/JMeterVersionTest.java b/test/src/org/apache/jmeter/JMeterVersionTest.java
index 52789e6..b0f24dc 100644
--- a/test/src/org/apache/jmeter/JMeterVersionTest.java
+++ b/test/src/org/apache/jmeter/JMeterVersionTest.java
@@ -115,7 +115,8 @@
         propNames.remove("rat-tasks");
         versions.remove("rat-tasks");
         // remove optional hsqldb, jacoco and sonar jars (required for coverage reporting, not required for jmeter)
-        for (String optLib : Arrays.asList("jacocoant", "sonarqube-ant-task", "hsqldb", "activemq-all")) {
+        for (String optLib : Arrays.asList("jacocoant", "sonarqube-ant-task", "hsqldb", "activemq-all",
+                "mina-core", "ftplet-api", "ftpserver-core")) {
             propNames.remove(optLib);
             versions.remove(optLib);
         }
