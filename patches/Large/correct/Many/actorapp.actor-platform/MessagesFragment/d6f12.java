diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/MessagesFragment.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/MessagesFragment.java
index 82115fe..090e5b5 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/MessagesFragment.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/MessagesFragment.java
@@ -131,13 +131,13 @@
             }
         } else if (messenger().getSelectedWallpaper().equals("local:bg_2")) {
             if (ActorSDK.sharedActor().style.getDefaultBackgrouds().length > 2) {
-                background = getResources().getDrawable(ActorSDK.sharedActor().style.getDefaultBackgrouds()[1]);
+                background = getResources().getDrawable(ActorSDK.sharedActor().style.getDefaultBackgrouds()[2]);
             } else {
                 background = getResources().getDrawable(ActorSDK.sharedActor().style.getDefaultBackgrouds()[0]);
             }
         } else if (messenger().getSelectedWallpaper().equals("local:bg_3")) {
             if (ActorSDK.sharedActor().style.getDefaultBackgrouds().length > 3) {
-                background = getResources().getDrawable(ActorSDK.sharedActor().style.getDefaultBackgrouds()[1]);
+                background = getResources().getDrawable(ActorSDK.sharedActor().style.getDefaultBackgrouds()[3]);
             } else {
                 background = getResources().getDrawable(ActorSDK.sharedActor().style.getDefaultBackgrouds()[0]);
             }
