diff --git a/engine/src/main/java/org/terasology/rendering/nui/layers/hud/HUDScreenLayer.java b/engine/src/main/java/org/terasology/rendering/nui/layers/hud/HUDScreenLayer.java
index 9b064f9..2158817 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/layers/hud/HUDScreenLayer.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/layers/hud/HUDScreenLayer.java
@@ -74,7 +74,7 @@
     }
 
     public ControlWidget getHUDElement(String uri) {
-        return getHUDElement(new AssetUri(uri));
+        return getHUDElement(new AssetUri(AssetType.UI_ELEMENT, uri));
     }
 
     public ControlWidget getHUDElement(AssetUri uri) {
@@ -86,7 +86,7 @@
     }
 
     public <T extends ControlWidget> T getHUDElement(String uri, Class<T> type) {
-        return getHUDElement(new AssetUri(uri), type);
+        return getHUDElement(new AssetUri(AssetType.UI_ELEMENT,uri), type);
     }
 
     public <T extends ControlWidget> T getHUDElement(AssetUri uri, Class<T> type) {
