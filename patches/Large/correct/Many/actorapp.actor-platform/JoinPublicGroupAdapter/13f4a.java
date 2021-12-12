diff --git a/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupAdapter.java b/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupAdapter.java
index 8a6bacb..45adae0 100644
--- a/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupAdapter.java
+++ b/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupAdapter.java
@@ -152,7 +152,7 @@
             this.membersCount.setText(Integer.toString(data.getMembers()));
             this.friendsCount.setText(Integer.toString(data.getFriends()));
 
-            if (data.getAvatar() != null) {
+            if (data.getAvatar() != null && data.getAvatar().getFullImage()!=null) {
                 messenger().bindFile(data.getAvatar().getFullImage().getFileReference(), true, new FileVMCallback() {
                     @Override
                     public void onNotDownloaded() {
