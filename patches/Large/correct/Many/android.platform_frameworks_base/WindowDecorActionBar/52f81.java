diff --git a/core/java/com/android/internal/app/WindowDecorActionBar.java b/core/java/com/android/internal/app/WindowDecorActionBar.java
index 2377c22..785b303 100644
--- a/core/java/com/android/internal/app/WindowDecorActionBar.java
+++ b/core/java/com/android/internal/app/WindowDecorActionBar.java
@@ -496,7 +496,7 @@
 
         mOverlayLayout.setHideOnContentScrollEnabled(false);
         mContextView.killMode();
-        ActionModeImpl mode = new ActionModeImpl(callback);
+        ActionModeImpl mode = new ActionModeImpl(mContextView.getContext(), callback);
         if (mode.dispatchOnCreate()) {
             mode.invalidate();
             mContextView.initForMode(mode);
@@ -940,9 +940,9 @@
         private MenuBuilder mMenu;
         private WeakReference<View> mCustomView;
         
-        public ActionModeImpl(ActionMode.Callback callback) {
+        public ActionModeImpl(Context context, ActionMode.Callback callback) {
             mCallback = callback;
-            mMenu = new MenuBuilder(getThemedContext())
+            mMenu = new MenuBuilder(context)
                     .setDefaultShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
             mMenu.setCallback(this);
         }
