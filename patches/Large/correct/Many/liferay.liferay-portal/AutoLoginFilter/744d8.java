diff --git a/portal-impl/src/com/liferay/portal/servlet/filters/autologin/AutoLoginFilter.java b/portal-impl/src/com/liferay/portal/servlet/filters/autologin/AutoLoginFilter.java
index 03d6aad..1f8ad62 100644
--- a/portal-impl/src/com/liferay/portal/servlet/filters/autologin/AutoLoginFilter.java
+++ b/portal-impl/src/com/liferay/portal/servlet/filters/autologin/AutoLoginFilter.java
@@ -111,7 +111,8 @@
 		}
 		else {
 			session.setAttribute(
-				"j_password", PasswordEncryptorUtil.encrypt(jPassword));
+				"j_password",
+				PasswordEncryptorUtil.encrypt(jPassword, user.getPassword()));
 
 			if (PropsValues.SESSION_STORE_PASSWORD) {
 				session.setAttribute(WebKeys.USER_PASSWORD, jPassword);
