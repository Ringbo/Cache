diff --git a/azkaban-common/src/main/java/azkaban/jobExecutor/JavaProcessJob.java b/azkaban-common/src/main/java/azkaban/jobExecutor/JavaProcessJob.java
index 134602b..e8e2dac 100644
--- a/azkaban-common/src/main/java/azkaban/jobExecutor/JavaProcessJob.java
+++ b/azkaban-common/src/main/java/azkaban/jobExecutor/JavaProcessJob.java
@@ -172,7 +172,7 @@
 
       if (xmx > sizeMaxXmx) {
         throw new Exception(String.format("%s: Xmx value has exceeded the allowed limit (max Xmx = %s)",
-                getId(), maxXms));
+                getId(), maxXmx));
       }
     }
 
