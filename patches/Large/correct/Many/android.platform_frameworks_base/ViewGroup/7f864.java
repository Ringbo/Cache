diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index 11df9a3..488063b 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -5631,7 +5631,7 @@
         final int matchAxisFilter = ((lp.width == MATCH_PARENT ? FLAG_LAYOUT_AXIS_HORIZONTAL : 0)
                 | (lp.height == MATCH_PARENT ? FLAG_LAYOUT_AXIS_VERTICAL : 0)) & axisFilter;
 
-        if (matchAxisFilter != 0) {
+        if (matchAxisFilter != 0 || wrapAxisFilter != 0) {
             final ViewParent parent = getParent();
             if (parent != null) {
                 // If our parent depends on us for an axis, then our layout can also be affected
