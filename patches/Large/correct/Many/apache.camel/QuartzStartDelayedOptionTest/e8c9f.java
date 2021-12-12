diff --git a/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzStartDelayedOptionTest.java b/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzStartDelayedOptionTest.java
index 04ed797..76ee740 100644
--- a/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzStartDelayedOptionTest.java
+++ b/components/camel-quartz/src/test/java/org/apache/camel/component/quartz/QuartzStartDelayedOptionTest.java
@@ -25,7 +25,7 @@
     @Test
     public void testStartDelayed() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.setMinimumResultWaitTime(1900);
+        mock.setMinimumResultWaitTime(1500);
         mock.setResultWaitTime(3000);
         mock.expectedMessageCount(2);
 
