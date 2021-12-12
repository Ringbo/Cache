diff --git a/pinot-core/src/test/java/com/linkedin/pinot/core/query/scheduler/MultiLevelPriorityQueueTest.java b/pinot-core/src/test/java/com/linkedin/pinot/core/query/scheduler/MultiLevelPriorityQueueTest.java
index f133809..ba28ea7 100644
--- a/pinot-core/src/test/java/com/linkedin/pinot/core/query/scheduler/MultiLevelPriorityQueueTest.java
+++ b/pinot-core/src/test/java/com/linkedin/pinot/core/query/scheduler/MultiLevelPriorityQueueTest.java
@@ -51,7 +51,7 @@
   }
 
   @Test
-  public void testSimplePutTake() throws OutOfCapacityError {
+  public void testSimplePutTake() throws OutOfCapacityException {
     MultiLevelPriorityQueue queue = createQueue();
     // NOTE: Timing matters here...running through debugger for
     // over 30 seconds can cause the query to expire
@@ -69,7 +69,7 @@
   }
 
   @Test
-  public void testPutOutOfCapacity() throws OutOfCapacityError {
+  public void testPutOutOfCapacity() throws OutOfCapacityException {
     PropertiesConfiguration conf = new PropertiesConfiguration();
     conf.setProperty(MultiLevelPriorityQueue.MAX_PENDING_PER_GROUP_KEY, 2);
     ResourceManager rm = new UnboundedResourceManager(conf);
@@ -84,7 +84,7 @@
     // it should throw now
     try {
       queue.put(createQueryRequest(groupOne, metrics));
-    } catch (OutOfCapacityError e) {
+    } catch (OutOfCapacityException e) {
       assertTrue(true);
       return;
     }
@@ -108,7 +108,7 @@
   }
 
   @Test
-  public void testTakeWithLimits() throws OutOfCapacityError, BrokenBarrierException, InterruptedException {
+  public void testTakeWithLimits() throws OutOfCapacityException, BrokenBarrierException, InterruptedException {
     // Test that take() will not return query if that group is already using hardLimit resources
     PropertiesConfiguration conf = new PropertiesConfiguration();
     conf.setProperty(ResourceManager.QUERY_WORKER_CONFIG_KEY, 40);
@@ -177,7 +177,7 @@
   }
 
   @Test
-  public void testNoPendingAfterTrim() throws OutOfCapacityError, BrokenBarrierException, InterruptedException {
+  public void testNoPendingAfterTrim() throws OutOfCapacityException, BrokenBarrierException, InterruptedException {
     MultiLevelPriorityQueue queue = createQueue();
     queue.put(createQueryRequest(groupOne, metrics));
     queue.put(createQueryRequest(groupTwo, metrics));
