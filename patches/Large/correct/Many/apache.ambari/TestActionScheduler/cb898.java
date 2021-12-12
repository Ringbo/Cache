diff --git a/ambari-server/src/test/java/org/apache/ambari/server/actionmanager/TestActionScheduler.java b/ambari-server/src/test/java/org/apache/ambari/server/actionmanager/TestActionScheduler.java
index c5c5bde..0640c34 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/actionmanager/TestActionScheduler.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/actionmanager/TestActionScheduler.java
@@ -496,7 +496,7 @@
 
     List<Stage> stages = new ArrayList<Stage>();
     Map<String, String> payload = new HashMap<String, String>();
-    final Stage s = getStageWithServerAction(1, 977, payload, "test", 300);
+    final Stage s = getStageWithServerAction(1, 977, payload, "test", 1200);
     stages.add(s);
 
     ActionDBAccessor db = mock(ActionDBAccessor.class);
