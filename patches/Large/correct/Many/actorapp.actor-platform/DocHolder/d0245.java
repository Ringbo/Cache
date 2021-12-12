diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/messages/DocHolder.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/messages/DocHolder.java
index 31d70a9..f4301ba 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/messages/DocHolder.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/messages/DocHolder.java
@@ -122,7 +122,7 @@
         progressView = (CircularView) itemView.findViewById(R.id.progressView);
         progressView.setColor(ActorSDK.sharedActor().style.getMainColor());
         progressValue = (TextView) itemView.findViewById(R.id.progressValue);
-        progressValue.setTextColor(ActorSDK.sharedActor().style.getTextPrimaryColor());
+        progressValue.setTextColor(ActorSDK.sharedActor().style.getTextPrimaryInvColor());
     }
 
     @Override
