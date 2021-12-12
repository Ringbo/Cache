diff --git a/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
index 8a16cf4..c55f764 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
@@ -932,7 +932,7 @@
 		Organization organization = organizationPersistence.findByPrimaryKey(
 			organizationId);
 
-		if (!includeSpecifiedOrganization) {
+		if (includeSpecifiedOrganization) {
 			organizationsTree.add(organization);
 		}
 		else {
