diff --git a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeManagerImpl.java b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeManagerImpl.java
index 224fdb0..c4472c8 100644
--- a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeManagerImpl.java
+++ b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/StarTreeManagerImpl.java
@@ -240,7 +240,7 @@
                   catch (Exception e)
                   {
                     // n.b. there may be partial data i.e. during a push; another watch will be fired later
-                    if (LOG.isDebugEnabled())
+                    if (LOGGER.isDebugEnabled())
                     {
                       LOGGER.debug("{}", e);
                     }
