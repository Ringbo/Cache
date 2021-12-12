diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/messages/PhotoHolder.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/messages/PhotoHolder.java
index 1be162f..eb2bc0b 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/messages/PhotoHolder.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/messages/PhotoHolder.java
@@ -116,7 +116,7 @@
 
         progressContainer = itemView.findViewById(R.id.progressBg);
         progressValue = (TextView) itemView.findViewById(R.id.progressValue);
-        progressValue.setTextColor(ActorSDK.sharedActor().style.getTextPrimaryColor());
+        progressValue.setTextColor(ActorSDK.sharedActor().style.getTextPrimaryInvColor());
         progressView = (CircularView) itemView.findViewById(R.id.progressView);
         progressView.setColor(Color.WHITE);
         progressIcon = (ImageView) itemView.findViewById(R.id.contentIcon);
