diff --git a/thirdeye/thirdeye-server/src/main/java/com/linkedin/thirdeye/resource/QueryResource.java b/thirdeye/thirdeye-server/src/main/java/com/linkedin/thirdeye/resource/QueryResource.java
index 819a183..525bf39 100644
--- a/thirdeye/thirdeye-server/src/main/java/com/linkedin/thirdeye/resource/QueryResource.java
+++ b/thirdeye/thirdeye-server/src/main/java/com/linkedin/thirdeye/resource/QueryResource.java
@@ -51,7 +51,7 @@
       throw e;
     }
 
-    if (LOG.isDebugEnabled()) {
+    if (LOGGER.isDebugEnabled()) {
       LOGGER.debug("{}", sql);
     }
 
