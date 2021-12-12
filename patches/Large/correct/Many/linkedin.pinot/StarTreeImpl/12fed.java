diff --git a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeImpl.java b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeImpl.java
index f398179..ee9eed4 100644
--- a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeImpl.java
+++ b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeImpl.java
@@ -156,7 +156,7 @@
       }
       if (valid)
       {
-        if (LOG.isTraceEnabled())
+        if (LOGGER.isTraceEnabled())
         {
           LOGGER.trace(
               "Added record:{} to node:{}",
