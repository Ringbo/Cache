diff --git a/modules/web/src/main/java/org/apache/ignite/cache/websession/WebSessionFilter.java b/modules/web/src/main/java/org/apache/ignite/cache/websession/WebSessionFilter.java
index 2b7442f..70b6349 100644
--- a/modules/web/src/main/java/org/apache/ignite/cache/websession/WebSessionFilter.java
+++ b/modules/web/src/main/java/org/apache/ignite/cache/websession/WebSessionFilter.java
@@ -854,8 +854,8 @@
      */
     private void handleAttributeUpdateException(final String sesId, final int tryCnt, final RuntimeException e) {
         if (tryCnt == retries - 1) {
-            U.warn(log, "Failed to apply updates for session (maximum number of retries exceeded) [sesId=" +
-                sesId + ", retries=" + retries + ']');
+            U.error(log, "Failed to apply updates for session (maximum number of retries exceeded) [sesId=" +
+                sesId + ", retries=" + retries + ']', e);
         }
         else {
             U.warn(log, "Failed to apply updates for session (will retry): " + sesId);
