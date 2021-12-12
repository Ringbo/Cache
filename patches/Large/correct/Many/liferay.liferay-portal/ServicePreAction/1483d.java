diff --git a/portal-impl/src/com/liferay/portal/events/ServicePreAction.java b/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
index c1b48ca..d244b91 100644
--- a/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
+++ b/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
@@ -355,7 +355,7 @@
 				Group sourceGroup = GroupLocalServiceUtil.getGroup(
 					sourceGroupId);
 
-				if (layout.isPublicLayout() ||
+				if (layout.isTypeControlPanel() || layout.isPublicLayout() ||
 					SitesUtil.isUserGroupLayoutSetViewable(
 						permissionChecker, layout.getGroup())) {
 
