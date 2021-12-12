diff --git a/WordPressEditor/src/main/java/org/wordpress/android/editor/EditorFragment.java b/WordPressEditor/src/main/java/org/wordpress/android/editor/EditorFragment.java
index 0e7e0e7..82fea77 100644
--- a/WordPressEditor/src/main/java/org/wordpress/android/editor/EditorFragment.java
+++ b/WordPressEditor/src/main/java/org/wordpress/android/editor/EditorFragment.java
@@ -83,19 +83,19 @@
         });
         mWebView.setWebChromeClient(new WebChromeClient() {
             public boolean onConsoleMessage(ConsoleMessage cm) {
-                AppLog.e(T.EDITOR, cm.message() + " -- From line " + cm.lineNumber() + " of " + cm.sourceId());
+                AppLog.d(T.EDITOR, cm.message() + " -- From line " + cm.lineNumber() + " of " + cm.sourceId());
                 return true;
             }
 
             @Override
             public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
-                AppLog.e(T.EDITOR, message);
+                AppLog.d(T.EDITOR, message);
                 return true;
             }
 
             @Override
             public void onConsoleMessage(String message, int lineNumber, String sourceId) {
-                AppLog.e(T.EDITOR, message + " -- from line " + lineNumber + " of " + sourceId);
+                AppLog.d(T.EDITOR, message + " -- from line " + lineNumber + " of " + sourceId);
             }
         });
         String htmlEditor = getHtmlEditor();
