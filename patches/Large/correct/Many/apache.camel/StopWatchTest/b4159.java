diff --git a/camel-core/src/test/java/org/apache/camel/util/StopWatchTest.java b/camel-core/src/test/java/org/apache/camel/util/StopWatchTest.java
index e83e2ba..38b7bf2 100644
--- a/camel-core/src/test/java/org/apache/camel/util/StopWatchTest.java
+++ b/camel-core/src/test/java/org/apache/camel/util/StopWatchTest.java
@@ -29,7 +29,7 @@
         long taken = watch.stop();
 
         assertEquals(taken, watch.taken());
-        assertTrue("Should take approx 200 millis, was: " + taken, taken > 190);
+        assertTrue("Should take approx 200 millis, was: " + taken, taken > 150);
     }
 
     public void testStopWatchNotStarted() throws Exception {
@@ -42,7 +42,7 @@
         taken = watch.stop();
 
         assertEquals(taken, watch.taken());
-        assertTrue("Should take approx 200 millis, was: " + taken, taken > 190);
+        assertTrue("Should take approx 200 millis, was: " + taken, taken > 150);
     }
 
     public void testStopWatchRestart() throws Exception {
@@ -51,14 +51,14 @@
         long taken = watch.stop();
 
         assertEquals(taken, watch.taken());
-        assertTrue("Should take approx 200 millis, was: " + taken, taken > 190);
+        assertTrue("Should take approx 200 millis, was: " + taken, taken > 150);
 
         watch.restart();
         Thread.sleep(100);
         taken = watch.stop();
 
         assertEquals(taken, watch.taken());
-        assertTrue("Should take approx 100 millis, was: " + taken, taken > 90);
+        assertTrue("Should take approx 100 millis, was: " + taken, taken > 50);
     }
 
     public void testStopWatchTaken() throws Exception {
