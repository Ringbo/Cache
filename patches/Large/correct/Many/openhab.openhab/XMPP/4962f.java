diff --git a/bundles/action/org.openhab.action.xmpp/src/main/java/org/openhab/action/xmpp/internal/XMPP.java b/bundles/action/org.openhab.action.xmpp/src/main/java/org/openhab/action/xmpp/internal/XMPP.java
index 6416058..b6b762c 100644
--- a/bundles/action/org.openhab.action.xmpp/src/main/java/org/openhab/action/xmpp/internal/XMPP.java
+++ b/bundles/action/org.openhab.action.xmpp/src/main/java/org/openhab/action/xmpp/internal/XMPP.java
@@ -138,7 +138,7 @@
 				} catch (IOException e) {
 					logger.error("Could not open url '{}' for sending it via XMPP", attachmentUrl, e);
 				} finally {
-					IOUtils.closeQuitely(is);
+					IOUtils.closeQuietly(is);
 				}
 			}
 		} catch (NotInitializedException e) {
