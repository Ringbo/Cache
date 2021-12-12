diff --git a/flexbox/src/main/java/com/google/android/flexbox/FlexboxHelper.java b/flexbox/src/main/java/com/google/android/flexbox/FlexboxHelper.java
index a05a243..65e0731 100644
--- a/flexbox/src/main/java/com/google/android/flexbox/FlexboxHelper.java
+++ b/flexbox/src/main/java/com/google/android/flexbox/FlexboxHelper.java
@@ -738,6 +738,11 @@
 
     /**
      * Returns the flexItem's start margin in the main axis. Either start or top.
+     * For the backward compatibility for API level < 17, the horizontal margin is returned using
+     * {@link FlexItem#getMarginLeft} (ViewGroup.MarginLayoutParams#getMarginStart isn't available
+     * in API level < 17). Thus this method needs to be used with {@link #getFlexItemMarginEndMain}
+     * not to misuse the margin in RTL.
+     *
      *
      * @param flexItem         the flexItem
      * @param isMainHorizontal is the main axis horizontal
@@ -745,7 +750,7 @@
      */
     private int getFlexItemMarginStartMain(FlexItem flexItem, boolean isMainHorizontal) {
         if (isMainHorizontal) {
-            return flexItem.getMarginStart();
+            return flexItem.getMarginLeft();
         }
 
         return flexItem.getMarginTop();
@@ -753,6 +758,10 @@
 
     /**
      * Returns the flexItem's end margin in the main axis. Either end or bottom.
+     * For the backward compatibility for API level < 17, the horizontal margin is returned using
+     * {@link FlexItem#getMarginRight} (ViewGroup.MarginLayoutParams#getMarginEnd isn't available
+     * in API level < 17). Thus this method needs to be used with
+     * {@link #getFlexItemMarginStartMain} not to misuse the margin in RTL.
      *
      * @param flexItem         the flexItem
      * @param isMainHorizontal is the main axis horizontal
@@ -760,7 +769,7 @@
      */
     private int getFlexItemMarginEndMain(FlexItem flexItem, boolean isMainHorizontal) {
         if (isMainHorizontal) {
-            return flexItem.getMarginEnd();
+            return flexItem.getMarginRight();
         }
 
         return flexItem.getMarginBottom();
@@ -768,6 +777,10 @@
 
     /**
      * Returns the flexItem's start margin in the cross axis. Either start or top.
+     * For the backward compatibility for API level < 17, the horizontal margin is returned using
+     * {@link FlexItem#getMarginLeft} (ViewGroup.MarginLayoutParams#getMarginStart isn't available
+     * in API level < 17). Thus this method needs to be used with
+     * {@link #getFlexItemMarginEndCross} to not to misuse the margin in RTL.
      *
      * @param flexItem         the flexItem
      * @param isMainHorizontal is the main axis horizontal
@@ -778,11 +791,15 @@
             return flexItem.getMarginTop();
         }
 
-        return flexItem.getMarginStart();
+        return flexItem.getMarginLeft();
     }
 
     /**
      * Returns the flexItem's end margin in the cross axis. Either end or bottom.
+     * For the backward compatibility for API level < 17, the horizontal margin is returned using
+     * {@link FlexItem#getMarginRight} (ViewGroup.MarginLayoutParams#getMarginEnd isn't available
+     * in API level < 17). Thus this method needs to be used with
+     * {@link #getFlexItemMarginStartCross} to not to misuse the margin in RTL.
      *
      * @param flexItem         the flexItem
      * @param isMainHorizontal is the main axis horizontal
@@ -793,7 +810,7 @@
             return flexItem.getMarginBottom();
         }
 
-        return flexItem.getMarginEnd();
+        return flexItem.getMarginRight();
     }
 
     /**
