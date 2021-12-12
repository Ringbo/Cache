diff --git a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/MouseGestureManager.java b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/MouseGestureManager.java
index 62a0ea8..1936715 100644
--- a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/MouseGestureManager.java
+++ b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/MouseGestureManager.java
@@ -42,7 +42,7 @@
   private static final Logger LOG = Logger.getInstance("MouseGestureManager");
   private ActionManagerImpl myActionManager;
 
-  private Map<IdeFrame, GestureListener> myListeners = new HashMap<IdeFrame, GestureListener>();
+  private Map<IdeFrame, Object> myListeners = new HashMap<IdeFrame, Object>();
   private boolean HAS_TRACKPAD = false;
   
 
@@ -150,11 +150,11 @@
 
     if (SystemInfo.isMacOSSnowLeopard) {
       try {
-        GestureListener listener = myListeners.get(frame);
+        Object listener = myListeners.get(frame);
         JComponent cmp = frame.getComponent();
         myListeners.remove(frame);
         if (listener != null && cmp != null && cmp.isShowing()) {
-          GestureUtilities.removeGestureListenerFrom(cmp, listener);
+          GestureUtilities.removeGestureListenerFrom(cmp, (GestureListener)listener);
         }
       }
       catch (Throwable e) {
