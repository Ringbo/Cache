diff --git a/bundles/binding/org.openhab.binding.plex/src/main/java/org/openhab/binding/plex/internal/PlexConnector.java b/bundles/binding/org.openhab.binding.plex/src/main/java/org/openhab/binding/plex/internal/PlexConnector.java
index 3795cad..a4a0db5 100644
--- a/bundles/binding/org.openhab.binding.plex/src/main/java/org/openhab/binding/plex/internal/PlexConnector.java
+++ b/bundles/binding/org.openhab.binding.plex/src/main/java/org/openhab/binding/plex/internal/PlexConnector.java
@@ -356,11 +356,11 @@
 				Thread.sleep(delay);
 				open();
 			} catch (IOException e) {
-				logger.error("Error connecting to Plex", e);
+				logger.debug("Error connecting to Plex", e);
 			} catch (InterruptedException e) {
-				logger.error("Interrupted while reconnecting to Plex", e);
+				logger.debug("Interrupted while connecting to Plex", e);
 			} catch (ExecutionException e) {
-				logger.error("Error connecting to Plex", e);
+				logger.debug("Error connecting to Plex", e);
 			}
 			delay = RECONNECT_DELAY;
 		}
@@ -389,7 +389,7 @@
 			} else if (e instanceof TimeoutException) {
 				logger.debug("[{}]: Websocket timeout error", connection.getHost());
 			} else {
-				logger.error("[{}]: Websocket error: {}", connection.getHost(), e.getMessage());
+				logger.debug("[{}]: Websocket error: {}", connection.getHost(), e.getMessage());
 			}
 		}
 		
