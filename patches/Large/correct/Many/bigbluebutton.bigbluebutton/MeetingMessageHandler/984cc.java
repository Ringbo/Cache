diff --git a/bigbluebutton-apps/src/main/java/org/bigbluebutton/conference/meeting/messaging/redis/MeetingMessageHandler.java b/bigbluebutton-apps/src/main/java/org/bigbluebutton/conference/meeting/messaging/redis/MeetingMessageHandler.java
index 631b2d3..a5c3841 100755
--- a/bigbluebutton-apps/src/main/java/org/bigbluebutton/conference/meeting/messaging/redis/MeetingMessageHandler.java
+++ b/bigbluebutton-apps/src/main/java/org/bigbluebutton/conference/meeting/messaging/redis/MeetingMessageHandler.java
@@ -59,7 +59,7 @@
 				} else if (msg instanceof UserDisconnectedFromGlobalAudio) {
 					UserDisconnectedFromGlobalAudio emm = (UserDisconnectedFromGlobalAudio) msg;
 					log.debug("Received UserDisconnectedFromGlobalAudio toekn request. Meeting id [{}]", emm.name);
-					bbbGW.userConnectedToGlobalAudio(emm.voiceConf, emm.userid, emm.name);
+					bbbGW.userDisconnectedFromGlobalAudio(emm.voiceConf, emm.userid, emm.name);
 				}
 			}
 		} else if (channel.equalsIgnoreCase(MessagingConstants.TO_SYSTEM_CHANNEL)) {
