diff --git a/zookeeper/test/com/yahoo/zookeeper/test/QuorumTest.java b/zookeeper/test/com/yahoo/zookeeper/test/QuorumTest.java
index 1e0b6b2..f8a954c 100644
--- a/zookeeper/test/com/yahoo/zookeeper/test/QuorumTest.java
+++ b/zookeeper/test/com/yahoo/zookeeper/test/QuorumTest.java
@@ -30,10 +30,10 @@
         s3dir = new File(s3dir + ".dir");
         s3dir.mkdirs();
         s4dir = File.createTempFile("test", ".junit", baseTest);
-        s4dir = new File(s3dir + ".dir");
+        s4dir = new File(s4dir + ".dir");
         s4dir.mkdirs();
         s5dir = File.createTempFile("test", ".junit", baseTest);
-        s5dir = new File(s3dir + ".dir");
+        s5dir = new File(s5dir + ".dir");
         s5dir.mkdirs();
         startServers();
         ZooLog.logWarn("Setup finished");
