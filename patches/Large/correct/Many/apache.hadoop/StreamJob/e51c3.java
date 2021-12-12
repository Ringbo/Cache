diff --git a/hadoop-mapreduce-project/src/contrib/streaming/src/java/org/apache/hadoop/streaming/StreamJob.java b/hadoop-mapreduce-project/src/contrib/streaming/src/java/org/apache/hadoop/streaming/StreamJob.java
index a019be7..b68e73e 100644
--- a/hadoop-mapreduce-project/src/contrib/streaming/src/java/org/apache/hadoop/streaming/StreamJob.java
+++ b/hadoop-mapreduce-project/src/contrib/streaming/src/java/org/apache/hadoop/streaming/StreamJob.java
@@ -718,7 +718,7 @@
     }
 
     // general MapRed job properties
-    jobConf_ = new JobConf(config_);
+    jobConf_ = new JobConf(config_, StreamJob.class);
     
     // All streaming jobs get the task timeout value
     // from the configuration settings.
