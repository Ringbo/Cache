diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index 6722bc6..d8ec19a 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -1898,7 +1898,7 @@
     // Expects x in view coordinates
     private int pinLocX(int x) {
         if (mInOverScrollMode) return x;
-        return pinLoc(x, getViewWidth(), computeHorizontalScrollRange());
+        return pinLoc(x, getViewWidth(), computeRealHorizontalScrollRange());
     }
 
     // Expects y in view coordinates
@@ -4318,7 +4318,7 @@
                       " up/down= " + mMinDY + " " + mMaxDY);
             }
 
-            int docRight = computeHorizontalScrollRange();
+            int docRight = computeRealHorizontalScrollRange();
             int viewLeft = getScrollX();
             int viewRight = viewLeft + getWidth();
             mStartX = x;
