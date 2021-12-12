diff --git a/ql/src/java/org/apache/hadoop/hive/ql/io/rcfile/merge/BlockMergeTask.java b/ql/src/java/org/apache/hadoop/hive/ql/io/rcfile/merge/BlockMergeTask.java
index b83c343..e791d49 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/io/rcfile/merge/BlockMergeTask.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/io/rcfile/merge/BlockMergeTask.java
@@ -212,7 +212,7 @@
           }
           HadoopJobExecHelper.runningJobKillURIs.remove(rj.getJobID());
         }
-        RCFileMergeMapper.jobClose(outputPath, noName, job, console);
+        RCFileMergeMapper.jobClose(outputPath, success, job, console);
       } catch (Exception e) {
       }
     }
