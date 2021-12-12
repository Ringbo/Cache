diff --git a/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java b/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
index f6e1376..7ffe359 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/uimanager/NativeViewHierarchyManager.java
@@ -348,7 +348,8 @@
 
         View viewToRemove = viewManager.getChildAt(viewToManage, indexToRemove);
 
-        if (mLayoutAnimator.shouldAnimateLayout(viewToRemove) &&
+        if (mLayoutAnimationEnabled &&
+            mLayoutAnimator.shouldAnimateLayout(viewToRemove) &&
             arrayContains(tagsToDelete, viewToRemove.getId())) {
           // The view will be removed and dropped by the 'delete' layout animation
           // instead, so do nothing
@@ -395,7 +396,8 @@
                       tagsToDelete));
         }
 
-        if (mLayoutAnimator.shouldAnimateLayout(viewToDestroy)) {
+        if (mLayoutAnimationEnabled &&
+            mLayoutAnimator.shouldAnimateLayout(viewToDestroy)) {
           mLayoutAnimator.deleteView(viewToDestroy, new LayoutAnimationListener() {
             @Override
             public void onAnimationEnd() {
