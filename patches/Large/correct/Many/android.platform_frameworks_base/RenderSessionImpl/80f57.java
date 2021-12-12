diff --git a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/RenderSessionImpl.java b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/RenderSessionImpl.java
index c4f9136..c715003 100644
--- a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/RenderSessionImpl.java
+++ b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/impl/RenderSessionImpl.java
@@ -271,7 +271,7 @@
                     mViewRoot = topLayout;
                     topLayout.setOrientation(LinearLayout.HORIZONTAL);
 
-                    if (Config.showOnScreenNavBar(params.getSimulatePlatformVersion())) {
+                    if (Config.showOnScreenNavBar(params.getSimulatedPlatformVersion())) {
                         try {
                             NavigationBar navigationBar = createNavigationBar(context,
                                     hardwareConfig.getDensity(), isRtl, params.isRtlSupported());
@@ -331,7 +331,7 @@
                     try {
                         StatusBar statusBar = createStatusBar(context, hardwareConfig.getDensity(),
                                 layoutDirection, params.isRtlSupported(),
-                                params.getSimulatePlatformVersion());
+                                params.getSimulatedPlatformVersion());
                         topLayout.addView(statusBar);
                     } catch (XmlPullParserException ignored) {
 
@@ -374,7 +374,7 @@
                     backgroundLayout.addView(mContentRoot);
                 }
 
-                if (Config.showOnScreenNavBar(params.getSimulatePlatformVersion()) &&
+                if (Config.showOnScreenNavBar(params.getSimulatedPlatformVersion()) &&
                         mNavigationBarOrientation == LinearLayout.HORIZONTAL &&
                         mNavigationBarSize > 0) {
                     // system bar
