diff --git a/AndroidProjects/SimpleSMSApp/src/com/rakesh/simpleSms/SimpleSMSAppActivity.java b/AndroidProjects/SimpleSMSApp/src/com/rakesh/simpleSms/SimpleSMSAppActivity.java
index b9051ab..6e242a4 100644
--- a/AndroidProjects/SimpleSMSApp/src/com/rakesh/simpleSms/SimpleSMSAppActivity.java
+++ b/AndroidProjects/SimpleSMSApp/src/com/rakesh/simpleSms/SimpleSMSAppActivity.java
@@ -34,7 +34,7 @@
     	String message = etMessage.getText().toString();
     	Log.d("RK","number : "+number+", message : " + message  );
     	
-    	if(isNullOrEmpty(number) && isNullOrEmpty(message)){
+    	if(!isNullOrEmpty(number) && !isNullOrEmpty(message)){
     		if(message.length() > MAX_MESSAGE_SIZE){
     			
     			Toast.makeText(this,"Message is longer then allowed in SMS",Toast.LENGTH_LONG).show();
