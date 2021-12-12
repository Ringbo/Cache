diff --git a/plugins/discovery-gce/src/test/java/org/elasticsearch/discovery/gce/RetryHttpInitializerWrapperTests.java b/plugins/discovery-gce/src/test/java/org/elasticsearch/discovery/gce/RetryHttpInitializerWrapperTests.java
index 73964b1..300a89c 100644
--- a/plugins/discovery-gce/src/test/java/org/elasticsearch/discovery/gce/RetryHttpInitializerWrapperTests.java
+++ b/plugins/discovery-gce/src/test/java/org/elasticsearch/discovery/gce/RetryHttpInitializerWrapperTests.java
@@ -113,7 +113,7 @@
 
     @Test
     public void testRetryWaitTooLong() throws Exception {
-        int maxWait = 50;
+        int maxWait = 10;
 
         FailThenSuccessBackoffTransport fakeTransport =
                 new FailThenSuccessBackoffTransport(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, 50);
@@ -124,7 +124,7 @@
         MockSleeper oneTimeSleeper = new MockSleeper() {
             @Override
             public void sleep(long millis) throws InterruptedException {
-                Thread.sleep(maxWait);
+                Thread.sleep(maxWait * 10);
                 super.sleep(0); // important number, use this to get count
             }
         };
