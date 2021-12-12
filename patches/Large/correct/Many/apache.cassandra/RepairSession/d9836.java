diff --git a/src/java/org/apache/cassandra/repair/RepairSession.java b/src/java/org/apache/cassandra/repair/RepairSession.java
index 9762159..70bfaa6 100644
--- a/src/java/org/apache/cassandra/repair/RepairSession.java
+++ b/src/java/org/apache/cassandra/repair/RepairSession.java
@@ -276,7 +276,7 @@
             {
                 logger.error(String.format("[repair #%s] Session completed with the following error", getId()), t);
                 Tracing.traceRepair("Session completed with the following error: {}", t);
-                setException(t);
+                forceShutdown(t);
             }
         });
     }
