diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationChildrenContainer.java b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationChildrenContainer.java
index 9ad5dd7..5069b91 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationChildrenContainer.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationChildrenContainer.java
@@ -550,8 +550,8 @@
             firstOverflowIndex = getMaxAllowedVisibleChildren(true /* likeCollapsed */);
         }
 
-        boolean childrenExpanded = !mContainingNotification.isGroupExpansionChanging()
-                && mChildrenExpanded;
+        boolean childrenExpandedAndNotAnimating = mChildrenExpanded
+                && !mContainingNotification.isGroupExpansionChanging();
         for (int i = 0; i < childCount; i++) {
             ExpandableNotificationRow child = mChildren.get(i);
             if (!firstChild) {
@@ -559,7 +559,7 @@
                     yPosition += NotificationUtils.interpolate(mChildPadding, mDividerHeight,
                             expandFactor);
                 } else {
-                    yPosition += childrenExpanded ? mDividerHeight : mChildPadding;
+                    yPosition += mChildrenExpanded ? mDividerHeight : mChildPadding;
                 }
             } else {
                 if (expandingToExpandedGroup) {
@@ -568,7 +568,7 @@
                             mNotificatonTopPadding + mDividerHeight,
                             expandFactor);
                 } else {
-                    yPosition += childrenExpanded ? mNotificatonTopPadding + mDividerHeight : 0;
+                    yPosition += mChildrenExpanded ? mNotificatonTopPadding + mDividerHeight : 0;
                 }
                 firstChild = false;
             }
@@ -580,7 +580,8 @@
             childState.hidden = false;
             // When the group is expanded, the children cast the shadows rather than the parent
             // so use the parent's elevation here.
-            childState.zTranslation = childrenExpanded && mEnableShadowOnChildNotifications
+            childState.zTranslation =
+                    (childrenExpandedAndNotAnimating && mEnableShadowOnChildNotifications)
                     ? mContainingNotification.getTranslationZ()
                     : 0;
             childState.dimmed = parentState.dimmed;
@@ -634,7 +635,7 @@
                 mHeaderViewState = new ViewState();
             }
             mHeaderViewState.initFrom(mNotificationHeader);
-            mHeaderViewState.zTranslation = childrenExpanded
+            mHeaderViewState.zTranslation = childrenExpandedAndNotAnimating
                     ? mContainingNotification.getTranslationZ()
                     : 0;
         }
