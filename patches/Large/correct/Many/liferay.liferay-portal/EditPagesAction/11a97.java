diff --git a/portal-impl/src/com/liferay/portlet/communities/action/EditPagesAction.java b/portal-impl/src/com/liferay/portlet/communities/action/EditPagesAction.java
index 7c069ff..5a1f2b7 100644
--- a/portal-impl/src/com/liferay/portlet/communities/action/EditPagesAction.java
+++ b/portal-impl/src/com/liferay/portlet/communities/action/EditPagesAction.java
@@ -353,7 +353,7 @@
 				throw new PrincipalException();
 			}
 		}
-		if (group.isCommunity()) {
+		if (group.isCompany()) {
 			if (!permissionChecker.isCompanyAdmin()) {
 				throw new PrincipalException();
 			}
