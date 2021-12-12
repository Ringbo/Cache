diff --git a/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/util/PrivateMessagingUtil.java b/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/util/PrivateMessagingUtil.java
index d18d293..5834391 100644
--- a/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/util/PrivateMessagingUtil.java
+++ b/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/util/PrivateMessagingUtil.java
@@ -65,7 +65,7 @@
 		List<MBMessage> filteredMBMessages = new ArrayList<MBMessage>();
 
 		for (MBMessage mbMessage : mbMessages) {
-			if (mbMessage.getMessageId() >= topMbMessage.getMessageId()) {
+			if (mbMessage.getMessageId() >= topMBMessage.getMessageId()) {
 				filteredMBMessages.add(mbMessage);
 			}
 		}
