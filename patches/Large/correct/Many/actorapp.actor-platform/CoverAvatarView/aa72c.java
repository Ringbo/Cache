diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/view/avatar/CoverAvatarView.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/view/avatar/CoverAvatarView.java
index 931e571..ad80440 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/view/avatar/CoverAvatarView.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/view/avatar/CoverAvatarView.java
@@ -72,7 +72,7 @@
 
         if (ActorSDK.sharedActor().style.getAvatarBackgroundResourse() != 0) {
             builder.setPlaceholderImage(getResources()
-                    .getDrawable(ActorSDK.sharedActor().style.getAvatarBackgroundResourse()));
+                    .getDrawable(ActorSDK.sharedActor().style.getAvatarBackgroundResourse()), ScalingUtils.ScaleType.CENTER_CROP);
         } else {
             builder.setPlaceholderImage(new ColorDrawable(
                     ActorSDK.sharedActor().style.getAvatarBackgroundColor()));
