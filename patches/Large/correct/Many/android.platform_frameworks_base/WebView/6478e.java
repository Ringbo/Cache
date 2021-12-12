diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index f0a3a0f..32880aa 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -3016,7 +3016,8 @@
     }
 
     /**
-     * Start an ActionMode for finding text in this WebView.
+     * Start an ActionMode for finding text in this WebView.  Only works if this
+     *              WebView is attached to the view system.
      * @param text If non-null, will be the initial text to search for.
      *             Otherwise, the last String searched for in this WebView will
      *             be used to start.
@@ -3026,7 +3027,7 @@
      */
     public boolean showFindDialog(String text, boolean showIme) {
         FindActionModeCallback callback = new FindActionModeCallback(mContext);
-        if (startActionMode(callback) == null) {
+        if (getParent() == null || startActionMode(callback) == null) {
             // Could not start the action mode, so end Find on page
             return false;
         }
