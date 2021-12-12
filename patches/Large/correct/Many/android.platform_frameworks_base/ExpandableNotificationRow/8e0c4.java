diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java b/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
index 939cacb..f446593 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
@@ -412,7 +412,8 @@
     }
 
     public ExpandableNotificationRow getViewAtPosition(float y) {
-        if (!mIsSummaryWithChildren || !mChildrenExpanded) {
+        if (!mIsSummaryWithChildren || !mChildrenExpanded
+                || (getNotificationChildren().size() == 1 && isClearable())) {
             return this;
         } else {
             ExpandableNotificationRow view = mChildrenContainer.getViewAtPosition(y);
