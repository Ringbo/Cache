diff --git a/portal-impl/src/com/liferay/portlet/login/action/ForgotPasswordAction.java b/portal-impl/src/com/liferay/portlet/login/action/ForgotPasswordAction.java
index 62e0dac..9865e1a 100644
--- a/portal-impl/src/com/liferay/portlet/login/action/ForgotPasswordAction.java
+++ b/portal-impl/src/com/liferay/portlet/login/action/ForgotPasswordAction.java
@@ -85,16 +85,17 @@
 		}
 		catch (Exception e) {
 			if (e instanceof CaptchaTextException ||
-				e instanceof RequiredReminderQueryException ||
-				e instanceof SendPasswordException ||
-				e instanceof UserActiveException ||
-				e instanceof UserEmailAddressException ||
-				e instanceof UserLockoutException ||
-				e instanceof UserReminderQueryException) {
+				e instanceof UserEmailAddressException) {
 
 				SessionErrors.add(actionRequest, e.getClass());
 			}
-			else if (e instanceof NoSuchUserException) {
+			else if (e instanceof NoSuchUserException ||
+					 e instanceof RequiredReminderQueryException ||
+					 e instanceof SendPasswordException ||
+					 e instanceof UserActiveException ||
+					 e instanceof UserLockoutException ||
+					 e instanceof UserReminderQueryException) {
+
 				if (PropsValues.LOGIN_SECURE_FORGOT_PASSWORD) {
 					sendRedirect(actionRequest, actionResponse);
 				}
