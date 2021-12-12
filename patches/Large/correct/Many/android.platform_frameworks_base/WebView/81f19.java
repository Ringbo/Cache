diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index c967989..050141f 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -6742,7 +6742,7 @@
                         mSentAutoScrollMessage = false;
                         break;
                     }
-                    scrollBy(mAutoScrollX, mAutoScrollY);
+                    pinScrollBy(mAutoScrollX, mAutoScrollY, true, 0);
                     sendEmptyMessageDelayed(
                             SCROLL_SELECT_TEXT, SELECT_SCROLL_INTERVAL);
                     break;
