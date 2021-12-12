diff --git a/java/org/apache/coyote/http2/Http2UpgradeHandler.java b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
index 76de1a8..b6ff6ad 100644
--- a/java/org/apache/coyote/http2/Http2UpgradeHandler.java
+++ b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
@@ -217,7 +217,7 @@
             socketWrapper.write(true, settings, 0, settings.length);
             socketWrapper.flush(true);
         } catch (IOException ioe) {
-            throw new IllegalStateException(sm.getString("upgradeHandler.sendPrefaceFail"), ioe);
+            throw new ProtocolException(sm.getString("upgradeHandler.sendPrefaceFail"), ioe);
         }
 
         // Make sure the client has sent a valid connection preface before we
