diff --git a/portal-impl/src/com/liferay/portlet/flags/messaging/FlagsRequestMessageListener.java b/portal-impl/src/com/liferay/portlet/flags/messaging/FlagsRequestMessageListener.java
index 0e84664..686d9f8 100644
--- a/portal-impl/src/com/liferay/portlet/flags/messaging/FlagsRequestMessageListener.java
+++ b/portal-impl/src/com/liferay/portlet/flags/messaging/FlagsRequestMessageListener.java
@@ -234,9 +234,9 @@
 			reportedUserURL, "[$REPORTER_USER_ADDRESS$]", reporterEmailAddress,
 			"[$REPORTER_USER_NAME$]", reporterUserName, "[$SITE_NAME$]",
 			groupName);
-		subscriptionSender.setContextAttributes(
+		subscriptionSender.setContextAttribute(
 			"[$CONTENT_TITLE$]", contentTitle, false);
-		subscriptionSender.setContextAttributes(
+		subscriptionSender.setContextAttribute(
 			"[$CONTENT_URL$]", contentURL, false);
 		subscriptionSender.setFrom(fromAddress, fromName);
 		subscriptionSender.setHtmlFormat(true);
