diff --git a/core/java/android/app/Dialog.java b/core/java/android/app/Dialog.java
index 2b648ea..eb26026 100644
--- a/core/java/android/app/Dialog.java
+++ b/core/java/android/app/Dialog.java
@@ -609,18 +609,19 @@
 
     /**
      * A key was pressed down.
-     * 
-     * <p>If the focused view didn't want this event, this method is called.
-     *
-     * <p>The default implementation consumed the KEYCODE_BACK to later
-     * handle it in {@link #onKeyUp}.
+     * <p>
+     * If the focused view didn't want this event, this method is called.
+     * <p>
+     * Default implementation consumes {@link KeyEvent#KEYCODE_BACK KEYCODE_BACK}
+     * and, as of {@link android.os.Build.VERSION_CODES#P P}, {@link KeyEvent#KEYCODE_ESCAPE
+     * KEYCODE_ESCAPE} to later handle them in {@link #onKeyUp}.
      *
      * @see #onKeyUp
      * @see android.view.KeyEvent
      */
     @Override
     public boolean onKeyDown(int keyCode, @NonNull KeyEvent event) {
-        if (keyCode == KeyEvent.KEYCODE_BACK) {
+        if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_ESCAPE) {
             event.startTracking();
             return true;
         }
@@ -640,16 +641,18 @@
 
     /**
      * A key was released.
-     * 
-     * <p>The default implementation handles KEYCODE_BACK to close the
-     * dialog.
+     * <p>
+     * Default implementation consumes {@link KeyEvent#KEYCODE_BACK KEYCODE_BACK}
+     * and, as of {@link android.os.Build.VERSION_CODES#P P}, {@link KeyEvent#KEYCODE_ESCAPE
+     * KEYCODE_ESCAPE} to close the dialog.
      *
      * @see #onKeyDown
-     * @see KeyEvent
+     * @see android.view.KeyEvent
      */
     @Override
     public boolean onKeyUp(int keyCode, @NonNull KeyEvent event) {
-        if (keyCode == KeyEvent.KEYCODE_BACK && event.isTracking()
+        if ((keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_ESCAPE)
+                && event.isTracking()
                 && !event.isCanceled()) {
             onBackPressed();
             return true;
