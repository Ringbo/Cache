diff --git a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSGraphics.java b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSGraphics.java
index 01873fe..48a5c51 100644
--- a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSGraphics.java
+++ b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSGraphics.java
@@ -192,7 +192,7 @@
 		ppiX = ppi;
 		ppiY = ppi;
 		ppcX = ppiX / 2.54f;
-		ppcY = ppcY / 2.54f;
+		ppcY = ppiY / 2.54f;
 		app.debug(tag, "Display: ppi=" + ppi + ", density=" + density);
 
 		// time + FPS
