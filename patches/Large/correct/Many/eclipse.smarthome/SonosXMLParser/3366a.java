diff --git a/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/internal/SonosXMLParser.java b/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/internal/SonosXMLParser.java
index 5bc3d9b..9e5593e 100644
--- a/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/internal/SonosXMLParser.java
+++ b/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/internal/SonosXMLParser.java
@@ -281,7 +281,7 @@
                 }
 
                 if (!ignore.contains(localName)) {
-                    logger.warn("Did not recognise element named {}", localName);
+                    logger.debug("Did not recognise element named {}", localName);
                 }
                 element = null;
             }
