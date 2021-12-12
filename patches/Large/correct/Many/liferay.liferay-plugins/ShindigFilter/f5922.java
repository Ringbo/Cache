diff --git a/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/servlet/ShindigFilter.java b/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/servlet/ShindigFilter.java
index 7d50fbe..f797818 100644
--- a/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/servlet/ShindigFilter.java
+++ b/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/servlet/ShindigFilter.java
@@ -93,7 +93,7 @@
 			String userUUIDString = CookieUtil.get(
 				(HttpServletRequest)servletRequest, CookieKeys.USER_UUID);
 
-			if (Validator.isNull(userUUID)) {
+			if (Validator.isNull(userUUIDString)) {
 				return false;
 			}
 
