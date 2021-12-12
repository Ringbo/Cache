diff --git a/portal-impl/src/com/liferay/portal/service/impl/RoleLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/RoleLocalServiceImpl.java
index 9d06a75..3f55de9 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/RoleLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/RoleLocalServiceImpl.java
@@ -614,7 +614,7 @@
 			types = RoleConstants.TYPES_ORGANIZATION_AND_REGULAR;
 		}
 		else if (group.isLayout() || group.isLayoutSetPrototype() ||
-				 group.isSite()) {
+				 group.isSite() || group.isUser()) {
 
 			types = RoleConstants.TYPES_REGULAR_AND_SITE;
 		}
