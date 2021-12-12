diff --git a/core/tests/coretests/src/android/util/ScrollViewScenario.java b/core/tests/coretests/src/android/util/ScrollViewScenario.java
index b5140e3..e9eb978 100644
--- a/core/tests/coretests/src/android/util/ScrollViewScenario.java
+++ b/core/tests/coretests/src/android/util/ScrollViewScenario.java
@@ -269,6 +269,6 @@
         mScrollView.setSmoothScrollingEnabled(false);
 
         setContentView(mScrollView);
-        mScrollView.restoreDefaultFocus();
+        mScrollView.post(() -> mScrollView.restoreDefaultFocus());
     }
 }
