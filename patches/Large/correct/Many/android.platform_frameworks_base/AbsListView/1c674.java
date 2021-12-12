diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index e87455c..ae4d409 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -2773,7 +2773,7 @@
             final int lastPos = firstPos + getChildCount() - 1;
             
             int viewTravelCount = 0;
-            if (position < firstPos) {
+            if (position <= firstPos) {
                 final int boundPosFromLast = lastPos - boundPosition;
                 if (boundPosFromLast < 1) {
                     // Moving would shift our bound position off the screen. Abort.
@@ -2789,7 +2789,7 @@
                     viewTravelCount = posTravel;
                     mMode = MOVE_UP_POS;
                 }
-            } else if (position > lastPos) {
+            } else if (position >= lastPos) {
                 final int boundPosFromFirst = boundPosition - firstPos;
                 if (boundPosFromFirst < 1) {
                     // Moving would shift our bound position off the screen. Abort.
