diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationChildrenContainer.java b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationChildrenContainer.java
index cb1f44e..3f211e3 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationChildrenContainer.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationChildrenContainer.java
@@ -535,8 +535,8 @@
             firstOverflowIndex = getMaxAllowedVisibleChildren(true /* likeCollapsed */);
         }
 
-        boolean childrenExpanded = !mContainingNotification.isGroupExpansionChanging()
-                && mChildrenExpanded;
+        boolean childrenExpandedAndNotAnimating = mChildrenExpanded
+                && !mContainingNotification.isGroupExpansionChanging();
         for (int i = 0; i < childCount; i++) {
             ExpandableNotificationRow child = mChildren.get(i);
             if (!firstChild) {
@@ -544,7 +544,7 @@
                     yPosition += NotificationUtils.interpolate(mChildPadding, mDividerHeight,
                             expandFactor);
                 } else {
-                    yPosition += childrenExpanded ? mDividerHeight : mChildPadding;
+                    yPosition += mChildrenExpanded ? mDividerHeight : mChildPadding;
                 }
             } else {
                 if (expandingToExpandedGroup) {
@@ -553,7 +553,7 @@
                             mNotificatonTopPadding + mDividerHeight,
                             expandFactor);
                 } else {
-                    yPosition += childrenExpanded ? mNotificatonTopPadding + mDividerHeight : 0;
+                    yPosition += mChildrenExpanded ? mNotificatonTopPadding + mDividerHeight : 0;
                 }
                 firstChild = false;
             }
@@ -565,7 +565,7 @@
             childState.hidden = false;
             // When the group is expanded, the children cast the shadows rather than the parent
             // so use the parent's elevation here.
-            childState.zTranslation = childrenExpanded
+            childState.zTranslation = childrenExpandedAndNotAnimating
                     ? mContainingNotification.getTranslationZ()
                     : 0;
             childState.dimmed = parentState.dimmed;
@@ -619,7 +619,7 @@
                 mHeaderViewState = new ViewState();
             }
             mHeaderViewState.initFrom(mNotificationHeader);
-            mHeaderViewState.zTranslation = childrenExpanded
+            mHeaderViewState.zTranslation = childrenExpandedAndNotAnimating
                     ? mContainingNotification.getTranslationZ()
                     : 0;
         }
