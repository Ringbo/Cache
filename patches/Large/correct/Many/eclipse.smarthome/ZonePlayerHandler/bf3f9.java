diff --git a/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/handler/ZonePlayerHandler.java b/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/handler/ZonePlayerHandler.java
index b82680d..7580ae5 100644
--- a/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/handler/ZonePlayerHandler.java
+++ b/extensions/binding/org.eclipse.smarthome.binding.sonos/src/main/java/org/eclipse/smarthome/binding/sonos/handler/ZonePlayerHandler.java
@@ -737,7 +737,7 @@
     }
 
     public SonosMetaData getCurrentURIMetadata() {
-        if (stateMap.get("CurrentURIMetaData") != null) {
+        if (stateMap.get("CurrentURIMetaData") != null && !stateMap.get("CurrentURIMetaData").isEmpty()) {
             return SonosXMLParser.getMetaDataFromXML(stateMap.get("CurrentURIMetaData"));
         } else {
             return null;
@@ -745,7 +745,7 @@
     }
 
     public SonosMetaData getTrackMetadata() {
-        if (stateMap.get("CurrentTrackMetaData") != null) {
+        if (stateMap.get("CurrentTrackMetaData") != null && !stateMap.get("CurrentTrackMetaData").isEmpty()) {
             return SonosXMLParser.getMetaDataFromXML(stateMap.get("CurrentTrackMetaData"));
         } else {
             return null;
@@ -753,8 +753,8 @@
     }
 
     public SonosMetaData getEnqueuedTransportURIMetaData() {
-
-        if (stateMap.get("EnqueuedTransportURIMetaData") != null) {
+        if (stateMap.get("EnqueuedTransportURIMetaData") != null
+                && !stateMap.get("EnqueuedTransportURIMetaData").isEmpty()) {
             return SonosXMLParser.getMetaDataFromXML(stateMap.get("EnqueuedTransportURIMetaData"));
         } else {
             return null;
