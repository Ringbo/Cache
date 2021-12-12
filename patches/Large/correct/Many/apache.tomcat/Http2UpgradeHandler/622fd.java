diff --git a/java/org/apache/coyote/http2/Http2UpgradeHandler.java b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
index 4993d37..673ca17 100644
--- a/java/org/apache/coyote/http2/Http2UpgradeHandler.java
+++ b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
@@ -186,8 +186,8 @@
                     remoteSettings.set(id, value);
                 }
             } catch (Http2Exception | IOException ioe) {
-                // TODO i18n
-                throw new ProtocolException();
+                throw new ProtocolException(
+                        sm.getString("upgradeHandler.upgrade.fail", connectionId));
             }
         }
 
@@ -204,8 +204,8 @@
         try {
             parser.readConnectionPreface();
         } catch (Http2Exception e) {
-            // TODO i18n
-            throw new ProtocolException();
+            throw new ProtocolException(
+                    sm.getString("upgradeHandler.invalidPreface", connectionId));
         }
 
         if (webConnection != null) {
