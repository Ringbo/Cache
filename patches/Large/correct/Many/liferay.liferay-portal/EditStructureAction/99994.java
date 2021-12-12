diff --git a/portal-impl/src/com/liferay/portlet/journal/action/EditStructureAction.java b/portal-impl/src/com/liferay/portlet/journal/action/EditStructureAction.java
index c464d40..bdd8b13 100644
--- a/portal-impl/src/com/liferay/portlet/journal/action/EditStructureAction.java
+++ b/portal-impl/src/com/liferay/portlet/journal/action/EditStructureAction.java
@@ -112,7 +112,7 @@
 					 e instanceof StructureNameException ||
 					 e instanceof StructureXsdException) {
 
-				SessionErrors.add(actionRequest, e.getClass().getName());
+				SessionErrors.add(actionRequest, e.getClass().getName(), e);
 
 				if (e instanceof RequiredStructureException) {
 					String redirect = PortalUtil.escapeRedirect(
