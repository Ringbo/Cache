diff --git a/ambari-server/src/test/java/org/apache/ambari/server/actionmanager/TestActionScheduler.java b/ambari-server/src/test/java/org/apache/ambari/server/actionmanager/TestActionScheduler.java
index bc4d397..fd8b4ea 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/actionmanager/TestActionScheduler.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/actionmanager/TestActionScheduler.java
@@ -317,7 +317,7 @@
     stages.get(0).setHostRoleStatus(hostname, "SECONDARY_NAMENODE", HostRoleStatus.IN_PROGRESS);
     scheduler.doWork();
     assertEquals(1, stages.get(0).getAttemptCount(hostname, "NAMENODE"));
-    assertEquals(2, stages.get(0).getAttemptCount(hostname, "SECONDARY_NAMENODE"));
+    assertEquals(1, stages.get(0).getAttemptCount(hostname, "SECONDARY_NAMENODE"));
 
     while (!stages.get(0).getHostRoleStatus(hostname, "SECONDARY_NAMENODE")
         .equals(HostRoleStatus.TIMEDOUT) && cycleCount++ <= MAX_CYCLE_ITERATIONS) {
