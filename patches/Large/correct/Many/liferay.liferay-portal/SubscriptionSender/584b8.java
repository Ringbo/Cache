diff --git a/portal-service/src/com/liferay/portal/util/SubscriptionSender.java b/portal-service/src/com/liferay/portal/util/SubscriptionSender.java
index b3da83e..3602483 100644
--- a/portal-service/src/com/liferay/portal/util/SubscriptionSender.java
+++ b/portal-service/src/com/liferay/portal/util/SubscriptionSender.java
@@ -533,7 +533,7 @@
 			if (_log.isInfoEnabled()) {
 				_log.info(
 					"User with email address " + emailAddress +
-						" does not exist for company " + company);
+						" does not exist for company " + companyId);
 			}
 
 			sendEmail(to, locale);
