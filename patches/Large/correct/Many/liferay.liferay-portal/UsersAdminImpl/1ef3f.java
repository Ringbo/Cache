diff --git a/portal-impl/src/com/liferay/portlet/usersadmin/util/UsersAdminImpl.java b/portal-impl/src/com/liferay/portlet/usersadmin/util/UsersAdminImpl.java
index 533a4c58..e4ea009 100644
--- a/portal-impl/src/com/liferay/portlet/usersadmin/util/UsersAdminImpl.java
+++ b/portal-impl/src/com/liferay/portlet/usersadmin/util/UsersAdminImpl.java
@@ -129,7 +129,7 @@
 				request, ancestorOrganization.getName(), portletURL.toString());
 		}
 
-		Organization unescapedOrganization = organization.toEscapedModel();
+		Organization unescapedOrganization = organization.toUnescapedModel();
 
 		portletURL.setParameter(
 			"organizationId",
