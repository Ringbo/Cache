diff --git a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/LayoutSceneImpl.java b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/LayoutSceneImpl.java
index 2012229..d8a59ce 100644
--- a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/LayoutSceneImpl.java
+++ b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/LayoutSceneImpl.java
@@ -295,7 +295,7 @@
 
             if (mParams.isCustomBackgroundEnabled()) {
                 Graphics2D gc = mImage.createGraphics();
-                gc.setColor(new Color(mParams.getCustomBackgroundColor()));
+                gc.setColor(new Color(mParams.getCustomBackgroundColor(), true));
                 gc.fillRect(0, 0, renderScreenWidth, renderScreenHeight - mScreenOffset);
                 gc.dispose();
             }
