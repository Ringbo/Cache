diff --git a/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/service/impl/UserThreadLocalServiceImpl.java b/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/service/impl/UserThreadLocalServiceImpl.java
index 5269b63..fef852d 100644
--- a/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/service/impl/UserThreadLocalServiceImpl.java
+++ b/portlets/private-messaging-portlet/docroot/WEB-INF/src/com/liferay/privatemessaging/service/impl/UserThreadLocalServiceImpl.java
@@ -467,7 +467,7 @@
 					"MMMMM d 'at' h:mm a", recipient.getLocale(),
 					recipient.getTimeZone());
 
-			body = StringUtil.replace(
+			String userThreadBody = StringUtil.replace(
 				body,
 				new String[] {
 					"[$SENT_DATE$]", "[$THREAD_URL$]"
@@ -479,7 +479,7 @@
 			);
 
 			MailMessage mailMessage = new MailMessage(
-				from, to, subject, body, true);
+				from, to, subject, userThreadBody, true);
 
 			MailServiceUtil.sendEmail(mailMessage);
 		}
