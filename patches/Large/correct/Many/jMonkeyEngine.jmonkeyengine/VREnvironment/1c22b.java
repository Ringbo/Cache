diff --git a/jme3-vr/src/main/java/com/jme3/app/VREnvironment.java b/jme3-vr/src/main/java/com/jme3/app/VREnvironment.java
index e9e6d0a..93f6b06 100644
--- a/jme3-vr/src/main/java/com/jme3/app/VREnvironment.java
+++ b/jme3-vr/src/main/java/com/jme3/app/VREnvironment.java
@@ -73,7 +73,7 @@
     	
         guiManager   = new VRGuiManager(this);
         mouseManager = new VRMouseManager(this);
-        dummyCam = new Camera();
+        dummyCam = new Camera(settings.getWidth(), settings.getHeight());
         
         processSettings();
     }
@@ -347,7 +347,7 @@
     			if (application.getCamera() != null){
     				dummyCam = application.getCamera().clone();
     			} else {
-    				return new Camera();
+    				return new Camera(settings.getWidth(), settings.getHeight());
     			}
     		} else {
     			throw new IllegalStateException("VR environment is not attached to any application.");
