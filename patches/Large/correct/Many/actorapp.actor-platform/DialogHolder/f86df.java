diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogHolder.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogHolder.java
index 1564f6f..e862b6a 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogHolder.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogHolder.java
@@ -81,7 +81,7 @@
         background.setBackgroundResource(R.drawable.selector_fill);
         fl.addView(background, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
         avatar = new AvatarView(context);
-        avatar.init(Screen.dp(56), 24);
+        avatar.init(Screen.dp(56), 22);
         {
             FrameLayout.LayoutParams avatarLayoutParams = new FrameLayout.LayoutParams(Screen.dp(56), Screen.dp(56));
             avatarLayoutParams.gravity = Gravity.CENTER_VERTICAL | Gravity.LEFT;
