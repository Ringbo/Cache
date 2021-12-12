diff --git a/src/org/qii/weiciyuan/ui/userinfo/UserInfoActivity.java b/src/org/qii/weiciyuan/ui/userinfo/UserInfoActivity.java
index c2b0220..eca08eb 100644
--- a/src/org/qii/weiciyuan/ui/userinfo/UserInfoActivity.java
+++ b/src/org/qii/weiciyuan/ui/userinfo/UserInfoActivity.java
@@ -75,7 +75,7 @@
     @Override
     protected void onPause() {
         super.onPause();
-        Utility.cancelTasks(followOrUnfollowTask);
+        Utility.cancelTasks(followOrUnfollowTask, modifyGroupMemberTask);
 
     }
 
@@ -261,7 +261,7 @@
     }
 
     public void handleGroup(List<String> add, List<String> remove) {
-        if (modifyGroupMemberTask == null || modifyGroupMemberTask.getStatus() == MyAsyncTask.Status.FINISHED) {
+        if (Utility.isTaskStopped(modifyGroupMemberTask)) {
             modifyGroupMemberTask = new ModifyGroupMemberTask(add, remove);
             modifyGroupMemberTask.executeOnExecutor(MyAsyncTask.THREAD_POOL_EXECUTOR);
         }
