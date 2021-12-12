diff --git a/server/sonar-process/src/main/java/org/sonar/process/ProcessUtils.java b/server/sonar-process/src/main/java/org/sonar/process/ProcessUtils.java
index 5548cc5..1baab88 100644
--- a/server/sonar-process/src/main/java/org/sonar/process/ProcessUtils.java
+++ b/server/sonar-process/src/main/java/org/sonar/process/ProcessUtils.java
@@ -58,7 +58,7 @@
         process.destroy();
         sentSignal = true;
       } catch (Exception e) {
-        LoggerFactory.getLogger(ProcessUtils.class).error("Fail to kill " + process);
+        LoggerFactory.getLogger(ProcessUtils.class).error("Fail to kill " + process, e);
       }
     }
     return sentSignal;
