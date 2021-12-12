diff --git a/ambari-server/src/test/java/org/apache/ambari/server/topology/AsyncCallableServiceTest.java b/ambari-server/src/test/java/org/apache/ambari/server/topology/AsyncCallableServiceTest.java
index 60bb2ba..4d96294 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/topology/AsyncCallableServiceTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/topology/AsyncCallableServiceTest.java
@@ -74,8 +74,8 @@
   public void testCallableServiceShouldCancelTaskWhenTimeoutExceeded() throws Exception {
     // GIVEN
 
-    //the timeout period should be small!!!
-    timeout = 1l;
+    //the timeout period should be less zero for guaranteed timeout!
+    timeout = -1l;
 
     // the task to be executed never completes successfully
     expect(futureMock.get(timeout, TimeUnit.MILLISECONDS)).andThrow(new TimeoutException("Testing the timeout exceeded case"));
