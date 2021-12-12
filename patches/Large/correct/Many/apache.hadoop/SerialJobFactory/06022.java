diff --git a/hadoop-tools/hadoop-gridmix/src/main/java/org/apache/hadoop/mapred/gridmix/SerialJobFactory.java b/hadoop-tools/hadoop-gridmix/src/main/java/org/apache/hadoop/mapred/gridmix/SerialJobFactory.java
index af554ff..471d140 100644
--- a/hadoop-tools/hadoop-gridmix/src/main/java/org/apache/hadoop/mapred/gridmix/SerialJobFactory.java
+++ b/hadoop-tools/hadoop-gridmix/src/main/java/org/apache/hadoop/mapred/gridmix/SerialJobFactory.java
@@ -130,7 +130,7 @@
                   return;
                 }
                 if (LOG.isDebugEnabled()) {
-                  LOG.info(" job " + job.getName() + " completed ");
+                  LOG.debug(" job " + job.getName() + " completed ");
                 }
                 break;
               }
