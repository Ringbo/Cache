diff --git a/library/src/main/java/com/thefinestartist/finestwebview/FinestWebViewActivity.java b/library/src/main/java/com/thefinestartist/finestwebview/FinestWebViewActivity.java
index f31f83c..2e288e4 100644
--- a/library/src/main/java/com/thefinestartist/finestwebview/FinestWebViewActivity.java
+++ b/library/src/main/java/com/thefinestartist/finestwebview/FinestWebViewActivity.java
@@ -1099,7 +1099,7 @@
             }
 
             if (injectJavaScript != null)
-                webView.evaluateJavaScript(injectJavaScript);
+                webView.evaluateJavaScript(injectJavaScript, null);
         }
 
         @Override
