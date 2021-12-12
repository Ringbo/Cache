diff --git a/exec/java-exec/src/main/java/org/apache/drill/exec/work/foreman/Foreman.java b/exec/java-exec/src/main/java/org/apache/drill/exec/work/foreman/Foreman.java
index fe267ba..6840cf3 100644
--- a/exec/java-exec/src/main/java/org/apache/drill/exec/work/foreman/Foreman.java
+++ b/exec/java-exec/src/main/java/org/apache/drill/exec/work/foreman/Foreman.java
@@ -493,7 +493,7 @@
             .resourceError()
             .message(
                 "Unable to acquire queue resources for query within timeout.  Timeout for %s queue was set at %d seconds.",
-                queueTimeout / 1000, queueName)
+                queueName, queueTimeout / 1000)
             .build();
       }
 
