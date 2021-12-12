diff --git a/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/service/MBStatsUserMBThreadLocalServiceWrapper.java b/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/service/MBStatsUserMBThreadLocalServiceWrapper.java
index 8155e98..1997f80 100644
--- a/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/service/MBStatsUserMBThreadLocalServiceWrapper.java
+++ b/modules/apps/collaboration/message-boards/message-boards-service/src/main/java/com/liferay/message/boards/internal/service/MBStatsUserMBThreadLocalServiceWrapper.java
@@ -75,7 +75,7 @@
 		Stream<MBMessage> stream = messages.stream();
 
 		stream.filter(
-			message -> message.isDiscussion()
+			message -> !message.isDiscussion()
 		).mapToLong(
 			message -> message.getUserId()
 		).distinct(
@@ -96,7 +96,7 @@
 		Stream<MBMessage> stream = messages.stream();
 
 		stream.filter(
-			mbMessage -> mbMessage.isDiscussion()
+			mbMessage -> !mbMessage.isDiscussion()
 		).mapToLong(
 			message -> message.getUserId()
 		).distinct(
