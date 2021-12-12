diff --git a/flink-runtime/src/test/java/org/apache/flink/runtime/taskmanager/TaskManagerTest.java b/flink-runtime/src/test/java/org/apache/flink/runtime/taskmanager/TaskManagerTest.java
index ba08a9f..2da8b9f 100644
--- a/flink-runtime/src/test/java/org/apache/flink/runtime/taskmanager/TaskManagerTest.java
+++ b/flink-runtime/src/test/java/org/apache/flink/runtime/taskmanager/TaskManagerTest.java
@@ -387,7 +387,7 @@
 	}
 	
 	public static TaskManager createTaskManager(JobManager jm) throws Exception {
-		InetAddress localhost = InetAddress.getLoopbackAddress();
+		InetAddress localhost = InetAddress.getLocalHost();
 		InetSocketAddress jmMockAddress = new InetSocketAddress(localhost, 55443);
 		
 		Configuration cfg = new Configuration();
