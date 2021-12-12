diff --git a/titan-hadoop-parent/titan-hadoop-core/src/main/java/com/thinkaurelius/titan/hadoop/config/HBaseAuthHelper.java b/titan-hadoop-parent/titan-hadoop-core/src/main/java/com/thinkaurelius/titan/hadoop/config/HBaseAuthHelper.java
index 8f136cb..0e1bf3b 100644
--- a/titan-hadoop-parent/titan-hadoop-core/src/main/java/com/thinkaurelius/titan/hadoop/config/HBaseAuthHelper.java
+++ b/titan-hadoop-parent/titan-hadoop-core/src/main/java/com/thinkaurelius/titan/hadoop/config/HBaseAuthHelper.java
@@ -67,7 +67,7 @@
                 Object user = getCurrent.invoke(null);
                 Method obtainAuthTokenForJob = clazz.getMethod("obtainAuthTokenForJob", Configuration.class, Job.class);
                 obtainAuthTokenForJob.invoke(user, configuration, job);
-                log.error("Obtained HBase Auth Token from ZooKeeper quorum {} for job {}", configuration.get(quorumCfgKey), job.getJobName());
+                log.info("Obtained HBase Auth Token from ZooKeeper quorum {} for job {}", configuration.get(quorumCfgKey), job.getJobName());
             } catch (ClassNotFoundException e) {
                 log.error("Failed to generate or store HBase auth token", e);
             } catch (InvocationTargetException e) {
@@ -81,7 +81,7 @@
             }
 
         } else {
-            log.error("Not obtaining HBase Auth Token for MapReduce job " + job.getJobName());
+            log.info("Not obtaining HBase Auth Token for MapReduce job " + job.getJobName());
         }
     }
 }
