diff --git a/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupFragment.java b/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupFragment.java
index 059f64d..e4e72a8 100644
--- a/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupFragment.java
+++ b/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupFragment.java
@@ -90,7 +90,7 @@
                         for (int i = 0; i < MAX_GROUPS_IN_SET; i++) {
                             PublicGroup group = sortedByMembersGroups.get(i);
                             topByMembersGroupsSet.add(group);
-                            if (group.getAvatar() != null) {
+                            if (group.getAvatar() != null && group.getAvatar().getFullImage()!=null) {
                                 messenger().bindFile(group.getAvatar().getFullImage().getFileReference(), true, new FileVMCallback() {
                                     @Override
                                     public void onNotDownloaded() {
