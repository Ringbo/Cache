diff --git a/java/org/apache/coyote/http2/Http2UpgradeHandler.java b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
index 1afc6b6..0a4d581 100644
--- a/java/org/apache/coyote/http2/Http2UpgradeHandler.java
+++ b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
@@ -459,7 +459,7 @@
 
         if (log.isDebugEnabled()) {
             log.debug(sm.getString("upgradeHandler.rst.debug", connectionId,
-                    Integer.toString(se.getStreamId()), se.getError()));
+                    Integer.toString(se.getStreamId()), se.getError(), se.getMessage()));
         }
 
         // Write a RST frame
