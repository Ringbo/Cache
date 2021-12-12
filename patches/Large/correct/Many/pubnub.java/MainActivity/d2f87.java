diff --git a/android/3.4/examples/PubnubExample/src/com/pubnub/examples/MainActivity.java b/android/3.4/examples/PubnubExample/src/com/pubnub/examples/MainActivity.java
index 895f455..66a7ccc 100644
--- a/android/3.4/examples/PubnubExample/src/com/pubnub/examples/MainActivity.java
+++ b/android/3.4/examples/PubnubExample/src/com/pubnub/examples/MainActivity.java
@@ -463,7 +463,7 @@
 		alert.show();
 	}
 
-	private void presenceUnsubscribe() {
+	private void unsubscribe() {
 
 		AlertDialog.Builder builder = new AlertDialog.Builder(this);
 		builder.setTitle("Unsubscribe");
@@ -475,14 +475,14 @@
 					@Override
 					public void onClick(DialogInterface dialog, int which) {
 						String channel = input.getText().toString();
-						pubnub.unsubscribePresence(channel);
+						pubnub.unsubscribe(channel);
 					}
 				});
 		AlertDialog alert = builder.create();
 		alert.show();
 	}
 
-	private void unsubscribe() {
+	private void presenceUnsubscribe() {
 
 		AlertDialog.Builder builder = new AlertDialog.Builder(this);
 		builder.setTitle("Unsubscribe Presence");
@@ -494,7 +494,7 @@
 					@Override
 					public void onClick(DialogInterface dialog, int which) {
 						String channel = input.getText().toString();
-						pubnub.unsubscribe(channel);
+						pubnub.unsubscribePresence(channel);
 					}
 				});
 		AlertDialog alert = builder.create();
