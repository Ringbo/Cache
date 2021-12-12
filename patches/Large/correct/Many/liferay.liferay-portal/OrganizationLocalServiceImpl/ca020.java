diff --git a/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
index 1af97e1..94ca6bf 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
@@ -1866,7 +1866,8 @@
 				if ((organizationId <= 0) ||
 					(organization.getOrganizationId() != organizationId)) {
 
-					throw new DuplicateOrganizationException();
+					throw new DuplicateOrganizationException(
+						"There is another organization named " + name);
 				}
 			}
 		}
