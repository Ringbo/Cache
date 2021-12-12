diff --git a/ambari-server/src/main/java/org/apache/ambari/server/actionmanager/ActionScheduler.java b/ambari-server/src/main/java/org/apache/ambari/server/actionmanager/ActionScheduler.java
index c9613a1..6254b48 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/actionmanager/ActionScheduler.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/actionmanager/ActionScheduler.java
@@ -866,7 +866,7 @@
             && !status.equals(HostRoleStatus.IN_PROGRESS)) {
       return false;
     }
-    if (currentTime > stage.getLastAttemptTime(hostName, role)
+    if (currentTime >= stage.getLastAttemptTime(hostName, role)
         + taskTimeout) {
       return true;
     }
