diff --git a/server/sonar-process-monitor/src/main/java/org/sonar/process/monitor/Timeouts.java b/server/sonar-process-monitor/src/main/java/org/sonar/process/monitor/Timeouts.java
index 51c1e5e..3db3a32 100644
--- a/server/sonar-process-monitor/src/main/java/org/sonar/process/monitor/Timeouts.java
+++ b/server/sonar-process-monitor/src/main/java/org/sonar/process/monitor/Timeouts.java
@@ -31,7 +31,7 @@
   }
 
   public Timeouts() {
-    this(60000L);
+    this(60_000L);
   }
 
   /**
