diff --git a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/RenderSessionImpl.java b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/RenderSessionImpl.java
index 5cc743a..75db8e1 100644
--- a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/RenderSessionImpl.java
+++ b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/RenderSessionImpl.java
@@ -270,7 +270,7 @@
                     mViewRoot = topLayout;
                     topLayout.setOrientation(LinearLayout.HORIZONTAL);
 
-                    if (Config.showOnScreenNavBar(params.getSimulatePlatformVersion())) {
+                    if (Config.showOnScreenNavBar(params.getSimulatedPlatformVersion())) {
                         try {
                             NavigationBar navigationBar = createNavigationBar(context,
                                     hardwareConfig.getDensity(), isRtl, params.isRtlSupported());
@@ -330,7 +330,7 @@
                     try {
                         StatusBar statusBar = createStatusBar(context, hardwareConfig.getDensity(),
                                 layoutDirection, params.isRtlSupported(),
-                                params.getSimulatePlatformVersion());
+                                params.getSimulatedPlatformVersion());
                         topLayout.addView(statusBar);
                     } catch (XmlPullParserException ignored) {
 
@@ -373,7 +373,7 @@
                     backgroundLayout.addView(mContentRoot);
                 }
 
-                if (Config.showOnScreenNavBar(params.getSimulatePlatformVersion()) &&
+                if (Config.showOnScreenNavBar(params.getSimulatedPlatformVersion()) &&
                         mNavigationBarOrientation == LinearLayout.HORIZONTAL &&
                         mNavigationBarSize > 0) {
                     // system bar
