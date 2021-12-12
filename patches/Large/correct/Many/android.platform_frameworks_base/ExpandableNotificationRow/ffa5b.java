diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java b/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
index bd143ac..ed4c774 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/ExpandableNotificationRow.java
@@ -991,7 +991,7 @@
             mNotificationHeader.setOnClickListener(mExpandClickListener);
             mNotificationHeaderWrapper = NotificationViewWrapper.wrap(getContext(),
                     mNotificationHeader);
-            addView(mNotificationHeader);
+            addView(mNotificationHeader, indexOfChild(mChildrenContainer) + 1);
         } else {
             header.reapply(getContext(), mNotificationHeader);
             mNotificationHeaderWrapper.notifyContentUpdated();
