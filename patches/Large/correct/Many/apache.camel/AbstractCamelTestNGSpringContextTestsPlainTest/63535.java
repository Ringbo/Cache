diff --git a/components/camel-testng/src/test/java/org/apache/camel/testng/AbstractCamelTestNGSpringContextTestsPlainTest.java b/components/camel-testng/src/test/java/org/apache/camel/testng/AbstractCamelTestNGSpringContextTestsPlainTest.java
index 1984450..d1aa63d 100644
--- a/components/camel-testng/src/test/java/org/apache/camel/testng/AbstractCamelTestNGSpringContextTestsPlainTest.java
+++ b/components/camel-testng/src/test/java/org/apache/camel/testng/AbstractCamelTestNGSpringContextTestsPlainTest.java
@@ -103,8 +103,9 @@
     public void testStopwatch() {
         StopWatch stopWatch = StopWatchTestExecutionListener.getStopWatch();
         
+        // some servers is slower
         assertNotNull(stopWatch);
-        assertTrue(stopWatch.taken() < 100);
+        assertTrue(stopWatch.taken() < 1000);
     }
     
     @Test
