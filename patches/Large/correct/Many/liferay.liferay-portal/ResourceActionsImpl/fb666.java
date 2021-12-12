diff --git a/portal-impl/src/com/liferay/portal/security/permission/ResourceActionsImpl.java b/portal-impl/src/com/liferay/portal/security/permission/ResourceActionsImpl.java
index 4c0490a..e79a1a5 100644
--- a/portal-impl/src/com/liferay/portal/security/permission/ResourceActionsImpl.java
+++ b/portal-impl/src/com/liferay/portal/security/permission/ResourceActionsImpl.java
@@ -991,7 +991,9 @@
 					types =
 						RoleConstants.TYPES_ORGANIZATION_AND_REGULAR_AND_SITE;
 				}
-				else if (group.isUser()) {
+				else if (group.isUser() || group.isCompany() ||
+						 group.isUserGroup()) {
+
 					types = RoleConstants.TYPES_REGULAR;
 				}
 			}
