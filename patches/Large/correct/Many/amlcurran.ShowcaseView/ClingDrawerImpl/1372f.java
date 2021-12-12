diff --git a/library/src/com/espian/showcaseview/drawing/ClingDrawerImpl.java b/library/src/com/espian/showcaseview/drawing/ClingDrawerImpl.java
index e5172bd..2068192 100644
--- a/library/src/com/espian/showcaseview/drawing/ClingDrawerImpl.java
+++ b/library/src/com/espian/showcaseview/drawing/ClingDrawerImpl.java
@@ -76,7 +76,7 @@
         int dw = getShowcaseWidth();
         int dh = getShowcaseHeight();
 
-        if (mShowcaseRect.left == cx - dw / 2) {
+        if (mShowcaseRect.left == cx - dw / 2 && mShowcaseRect.top == cy - dh / 2) {
             return false;
         }
 
