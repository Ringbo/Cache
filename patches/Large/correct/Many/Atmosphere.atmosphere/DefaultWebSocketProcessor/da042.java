diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
index 5a74c30..88eaaf9 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
@@ -431,7 +431,7 @@
                     } catch (IOException e) {
                         logger.trace("", e);
                     }
-                    AtmosphereResourceImpl.class.cast(r)._destroy();
+                    AtmosphereResourceImpl.class.cast(resource)._destroy();
                 }
             } finally {
                 if (r != null) {
