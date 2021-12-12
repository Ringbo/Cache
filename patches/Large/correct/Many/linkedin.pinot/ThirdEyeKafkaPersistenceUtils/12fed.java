diff --git a/thirdeye/thirdeye-realtime/src/main/java/com/linkedin/thirdeye/realtime/ThirdEyeKafkaPersistenceUtils.java b/thirdeye/thirdeye-realtime/src/main/java/com/linkedin/thirdeye/realtime/ThirdEyeKafkaPersistenceUtils.java
index b1b1b86..957e73e 100644
--- a/thirdeye/thirdeye-realtime/src/main/java/com/linkedin/thirdeye/realtime/ThirdEyeKafkaPersistenceUtils.java
+++ b/thirdeye/thirdeye-realtime/src/main/java/com/linkedin/thirdeye/realtime/ThirdEyeKafkaPersistenceUtils.java
@@ -64,7 +64,7 @@
 
         if (!hasData)
         {
-          if (LOG.isDebugEnabled())
+          if (LOGGER.isDebugEnabled())
           {
             LOGGER.debug("No data for node {} will not write buffer", node.getId());
           }
