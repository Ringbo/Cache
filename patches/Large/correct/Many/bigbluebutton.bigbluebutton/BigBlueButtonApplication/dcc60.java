diff --git a/bigbluebutton-apps/src/main/java/org/bigbluebutton/red5/BigBlueButtonApplication.java b/bigbluebutton-apps/src/main/java/org/bigbluebutton/red5/BigBlueButtonApplication.java
index 7c716f7..60b9a71 100755
--- a/bigbluebutton-apps/src/main/java/org/bigbluebutton/red5/BigBlueButtonApplication.java
+++ b/bigbluebutton-apps/src/main/java/org/bigbluebutton/red5/BigBlueButtonApplication.java
@@ -155,11 +155,11 @@
 		}
 
 		Boolean guest  = false;
-		if (params.length >= 9 && ((Boolean) params[9])) {
+		if (params.length >= 8 && ((Boolean) params[8])) {
 			guest = true;
 		}
 
-		String authToken = ((String) params[10]).toString();
+		String authToken = ((String) params[9]).toString();
 
 		String userId = internalUserID;
 		String sessionId = Red5.getConnectionLocal().getSessionId();
