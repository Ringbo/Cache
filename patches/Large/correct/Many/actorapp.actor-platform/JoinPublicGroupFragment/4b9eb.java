diff --git a/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupFragment.java b/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupFragment.java
index eaa00d7..3d188dc 100644
--- a/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupFragment.java
+++ b/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/JoinPublicGroupFragment.java
@@ -134,7 +134,7 @@
                             }
                         });
                         PublicGroupSetView topFriendsGroupSetView = new PublicGroupSetView(getActivity(), new PublicGroupSet(topByFriendsGroupsSet, getString(R.string.join_public_group_top_by_friends_title), getString(R.string.join_public_group_top_by_friends_subtitle)), PublicGroupCardView.COUNTER_TYPE_FRIENDS);
-                        topMembersGroupSetView.setOnGroupClickListener(new PublicGroupSetView.GroupClickListener() {
+                        topFriendsGroupSetView.setOnGroupClickListener(new PublicGroupSetView.GroupClickListener() {
                             @Override
                             public void onClick(PublicGroup group) {
                                 openGroup(group);
