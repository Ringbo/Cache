diff --git a/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java b/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
index caa2c65..a00e992 100644
--- a/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
+++ b/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
@@ -108,7 +108,7 @@
                         }
 
                         // if we have lagged this round, we probably have work to do already so we don't sleep
-                        if (sleep < 0)
+                        if (sleep < 0 || !run)
                             continue;
 
                         try
