diff --git a/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/GroupInfoFragment.java b/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/GroupInfoFragment.java
index 0728439..3d045da 100644
--- a/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/GroupInfoFragment.java
+++ b/actor-apps/app-android/src/main/java/im/actor/messenger/app/fragment/group/GroupInfoFragment.java
@@ -99,7 +99,7 @@
 
         // Avatar
         avatarView = (CoverAvatarView) header.findViewById(R.id.avatar);
-        avatarView.setBkgrnd((ImageView) res.findViewById(R.id.avatar_bgrnd));
+        avatarView.setBkgrnd((ImageView) header.findViewById(R.id.avatar_bgrnd));
         bind(avatarView, groupInfo.getAvatar());
         avatarView.setOnClickListener(new View.OnClickListener() {
             @Override
