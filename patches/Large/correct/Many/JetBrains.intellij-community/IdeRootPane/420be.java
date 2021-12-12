diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/IdeRootPane.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/IdeRootPane.java
index 3000bb2..5f0ae68 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/IdeRootPane.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/IdeRootPane.java
@@ -87,7 +87,7 @@
   private boolean myFullScreen;
 
   public IdeRootPane(ActionManagerEx actionManager, UISettings uiSettings, DataManager dataManager, Application application, final IdeFrame frame) {
-    if (SystemInfo.isWindows && frame instanceof IdeFrameImpl) {
+    if (SystemInfo.isWindows && (UIUtil.isUnderDarcula() || UIUtil.isUnderIntelliJLaF()) && frame instanceof IdeFrameImpl) {
       setWindowDecorationStyle(FRAME);
     }
     myActionManager = actionManager;
