diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index 4b62c2d..c7914f3 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -2433,7 +2433,7 @@
                     mFirstPosition;
         } else {
             final int lastPos = mFirstPosition + getChildCount() - 1;
-            nextSelected = selectedPos != INVALID_POSITION && selectedPos < lastPos?
+            nextSelected = selectedPos != INVALID_POSITION && selectedPos <= lastPos ?
                     selectedPos - 1 :
                     lastPos;
         }
