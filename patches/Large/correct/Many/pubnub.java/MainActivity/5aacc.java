diff --git a/android/examples/PubnubExample/src/com/pubnub/examples/pubnubExample10/MainActivity.java b/android/examples/PubnubExample/src/com/pubnub/examples/pubnubExample10/MainActivity.java
index 0d82dcd..1890e8d 100644
--- a/android/examples/PubnubExample/src/com/pubnub/examples/pubnubExample10/MainActivity.java
+++ b/android/examples/PubnubExample/src/com/pubnub/examples/pubnubExample10/MainActivity.java
@@ -550,7 +550,7 @@
         		      return ;
         		}
                 String channel = edChannelName.getText().toString();
-				pubnub.disablePushNotificationsOnChannel(channel, REG_ID, new Callback() {
+				pubnub.enablePushNotificationsOnChannel(channel, REG_ID, new Callback() {
 				    @Override
 				    public void successCallback(String channel,
 				    Object message) {
