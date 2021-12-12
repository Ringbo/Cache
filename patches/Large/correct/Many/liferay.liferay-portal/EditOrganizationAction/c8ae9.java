diff --git a/portal-impl/src/com/liferay/portlet/enterpriseadmin/action/EditOrganizationAction.java b/portal-impl/src/com/liferay/portlet/enterpriseadmin/action/EditOrganizationAction.java
index 3c04b4f..61d7f3b 100644
--- a/portal-impl/src/com/liferay/portlet/enterpriseadmin/action/EditOrganizationAction.java
+++ b/portal-impl/src/com/liferay/portlet/enterpriseadmin/action/EditOrganizationAction.java
@@ -103,7 +103,7 @@
 					 e instanceof RequiredOrganizationException ||
 					 e instanceof WebsiteURLException) {
 
-				SessionErrors.add(actionRequest, e.getClass().getName());
+				SessionErrors.add(actionRequest, e.getClass().getName(), e);
 
 				if (e instanceof RequiredOrganizationException) {
 					actionResponse.sendRedirect(
