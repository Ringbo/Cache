diff --git a/twitter4j-core/src/test/java/twitter4j/MBeansIntegrationTest.java b/twitter4j-core/src/test/java/twitter4j/MBeansIntegrationTest.java
index c9ee9ce..a3ef735 100644
--- a/twitter4j-core/src/test/java/twitter4j/MBeansIntegrationTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/MBeansIntegrationTest.java
@@ -38,7 +38,7 @@
         // monitoring is turned on with mbeanEnabled=true
         TwitterAPIMonitor monitor = TwitterAPIMonitor.getInstance();
         assertEquals(0, monitor.getStatistics().getCallCount());
-        twitter.getHomeTimeline();
+        twitter.getDailyTrends();
         assertEquals(1, monitor.getStatistics().getCallCount());
     }
 }
