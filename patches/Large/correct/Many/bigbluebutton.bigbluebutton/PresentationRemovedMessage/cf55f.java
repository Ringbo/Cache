diff --git a/bbb-common-message/src/main/java/org/bigbluebutton/common/messages/PresentationRemovedMessage.java b/bbb-common-message/src/main/java/org/bigbluebutton/common/messages/PresentationRemovedMessage.java
index d2e2821..c2cb5ca 100755
--- a/bbb-common-message/src/main/java/org/bigbluebutton/common/messages/PresentationRemovedMessage.java
+++ b/bbb-common-message/src/main/java/org/bigbluebutton/common/messages/PresentationRemovedMessage.java
@@ -44,7 +44,7 @@
 					if (payload.has(MEETING_ID)
 						&& payload.has(PRESENTATION_ID)) {
 						String meetingId = payload.get(MEETING_ID).getAsString();
-						String presentationId = payload.get(MEETING_ID).getAsString();
+						String presentationId = payload.get(PRESENTATION_ID).getAsString();
 						return new 	PresentationRemovedMessage(meetingId, presentationId);					
 					}
 				}
