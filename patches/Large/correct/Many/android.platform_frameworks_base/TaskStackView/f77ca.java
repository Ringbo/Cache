diff --git a/packages/SystemUI/src/com/android/systemui/recents/views/TaskStackView.java b/packages/SystemUI/src/com/android/systemui/recents/views/TaskStackView.java
index 8d91b4f..ee4f261 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/views/TaskStackView.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/views/TaskStackView.java
@@ -1598,7 +1598,8 @@
 
         // If the doze trigger has already fired, then update the state for this task view
         if (mUIDozeTrigger.isAsleep() ||
-                Recents.getSystemServices().hasFreeformWorkspaceSupport()) {
+                Recents.getSystemServices().hasFreeformWorkspaceSupport() ||
+                useGridLayout()) {
             tv.setNoUserInteractionState();
         }
 
