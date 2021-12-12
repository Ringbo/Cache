diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index edffb5e9..a84ece6 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -1334,12 +1334,12 @@
             switch(direction) {
                 case ACCESSIBILITY_FOCUS_BACKWARD: {
                     View focusable = (getChildCount() > 0) ? getChildAt(getChildCount() - 1) : this;
-                    if (focusable.canTakeAccessibilityFocusFromHover()) {
+                    if (focusable.isAccessibilityFocusable()) {
                         views.add(focusable);
                     }
                 } return;
                 case ACCESSIBILITY_FOCUS_FORWARD: {
-                    if (canTakeAccessibilityFocusFromHover()) {
+                    if (isAccessibilityFocusable()) {
                         views.add(this);
                     }
                 } return;
