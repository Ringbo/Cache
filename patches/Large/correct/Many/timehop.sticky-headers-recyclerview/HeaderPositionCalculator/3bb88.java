diff --git a/library/src/main/java/com/timehop/stickyheadersrecyclerview/HeaderPositionCalculator.java b/library/src/main/java/com/timehop/stickyheadersrecyclerview/HeaderPositionCalculator.java
index 5e21ff5..3b26de6 100644
--- a/library/src/main/java/com/timehop/stickyheadersrecyclerview/HeaderPositionCalculator.java
+++ b/library/src/main/java/com/timehop/stickyheadersrecyclerview/HeaderPositionCalculator.java
@@ -229,13 +229,13 @@
     if (orientation == LinearLayoutManager.VERTICAL) {
       int itemTop = item.getTop() - layoutParams.topMargin;
       int headerBottom = getListTop(parent) + header.getBottom() + mTempRect1.bottom + mTempRect1.top;
-      if (itemTop > headerBottom) {
+      if (itemTop >= headerBottom) {
         return false;
       }
     } else {
       int itemLeft = item.getLeft() - layoutParams.leftMargin;
       int headerRight = getListLeft(parent) + header.getRight() + mTempRect1.right + mTempRect1.left;
-      if (itemLeft > headerRight) {
+      if (itemLeft >= headerRight) {
         return false;
       }
     }
