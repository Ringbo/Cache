diff --git a/portal-impl/src/com/liferay/portlet/enterpriseadmin/action/EditUserAction.java b/portal-impl/src/com/liferay/portlet/enterpriseadmin/action/EditUserAction.java
index fc0d54a..8e2fde9 100644
--- a/portal-impl/src/com/liferay/portlet/enterpriseadmin/action/EditUserAction.java
+++ b/portal-impl/src/com/liferay/portlet/enterpriseadmin/action/EditUserAction.java
@@ -517,9 +517,9 @@
 		String lastName = BeanParamUtil.getString(
 			user, actionRequest, "lastName");
 		int prefixId = BeanParamUtil.getInteger(
-			user, actionRequest, "prefixId");
+			contact, actionRequest, "prefixId");
 		int suffixId = BeanParamUtil.getInteger(
-			user, actionRequest, "suffixId");
+			contact, actionRequest, "suffixId");
 		boolean male = BeanParamUtil.getBoolean(
 			user, actionRequest, "male", true);
 
