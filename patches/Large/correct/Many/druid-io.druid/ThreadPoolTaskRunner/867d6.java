diff --git a/indexing-service/src/main/java/io/druid/indexing/overlord/ThreadPoolTaskRunner.java b/indexing-service/src/main/java/io/druid/indexing/overlord/ThreadPoolTaskRunner.java
index 19c7a14..f7ae62f 100644
--- a/indexing-service/src/main/java/io/druid/indexing/overlord/ThreadPoolTaskRunner.java
+++ b/indexing-service/src/main/java/io/druid/indexing/overlord/ThreadPoolTaskRunner.java
@@ -144,7 +144,7 @@
              .addData("taskId", task.getId())
              .addData("dataSource", task.getDataSource())
              .emit();
-          log.warn(e, "Graceful shutdown of task[%s] aborted with exception.");
+          log.warn(e, "Graceful shutdown of task[%s] aborted with exception.", task.getId());
           error = true;
         }
       } else {
