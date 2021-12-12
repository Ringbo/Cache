diff --git a/example/src/main/java/com/h6ah4i/android/example/advrecyclerview/common/utils/AdapterUtils.java b/example/src/main/java/com/h6ah4i/android/example/advrecyclerview/common/utils/AdapterUtils.java
index af0813d..de54067 100644
--- a/example/src/main/java/com/h6ah4i/android/example/advrecyclerview/common/utils/AdapterUtils.java
+++ b/example/src/main/java/com/h6ah4i/android/example/advrecyclerview/common/utils/AdapterUtils.java
@@ -26,7 +26,7 @@
         if (parent instanceof RecyclerView) {
             // returns the passed instance if the parent is RecyclerView
             return v;
-        } else if (v instanceof View) {
+        } else if (parent instanceof View) {
             // check the parent view recursively
             return findParentViewHolderItemView((View) parent);
         } else {
