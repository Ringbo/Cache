diff --git a/app/src/main/java/com/hippo/widget/recyclerview/EasyRecyclerView.java b/app/src/main/java/com/hippo/widget/recyclerview/EasyRecyclerView.java
index 766fd65..643b261 100644
--- a/app/src/main/java/com/hippo/widget/recyclerview/EasyRecyclerView.java
+++ b/app/src/main/java/com/hippo/widget/recyclerview/EasyRecyclerView.java
@@ -843,7 +843,7 @@
             mCheckedIdStates = ss.checkIdState;
         }
 
-        if (mChoiceMode == CHOICE_MODE_MULTIPLE_MODAL) {
+        if (mChoiceMode == CHOICE_MODE_MULTIPLE_MODAL && mCheckedItemCount > 0) {
             mChoiceActionMode = mActionBarActivity.startSupportActionMode(mMultiChoiceModeCallback);
         }
         updateOnScreenCheckedViews();
