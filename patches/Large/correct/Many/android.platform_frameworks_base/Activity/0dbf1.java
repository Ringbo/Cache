diff --git a/core/java/android/app/Activity.java b/core/java/android/app/Activity.java
index 5257430..4c32989 100644
--- a/core/java/android/app/Activity.java
+++ b/core/java/android/app/Activity.java
@@ -2075,15 +2075,15 @@
      * <p>In order to use a Toolbar within the Activity's window content the application
      * must not request the window feature {@link Window#FEATURE_ACTION_BAR FEATURE_ACTION_BAR}.</p>
      *
-     * @param actionBar Toolbar to set as the Activity's action bar
+     * @param toolbar Toolbar to set as the Activity's action bar
      */
-    public void setActionBar(@Nullable Toolbar actionBar) {
+    public void setActionBar(@Nullable Toolbar toolbar) {
         if (getActionBar() instanceof WindowDecorActionBar) {
             throw new IllegalStateException("This Activity already has an action bar supplied " +
                     "by the window decor. Do not request Window.FEATURE_ACTION_BAR and set " +
                     "android:windowActionBar to false in your theme to use a Toolbar instead.");
         }
-        mActionBar = new ToolbarActionBar(actionBar);
+        mActionBar = new ToolbarActionBar(toolbar);
     }
     
     /**
