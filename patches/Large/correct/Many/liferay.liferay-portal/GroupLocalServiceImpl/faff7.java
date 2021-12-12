diff --git a/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
index a39a832..d235266 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
@@ -571,8 +571,8 @@
 				RequiredGroupException.SYSTEM_GROUP);
 		}
 
-		if (groupPersistence.countByChildrenSites(
-				group.getCompanyId(), group.getGroupId()) > 0) {
+		if (groupPersistence.countByC_P_S(
+				group.getCompanyId(), group.getGroupId(), true) > 0) {
 
 			throw new RequiredGroupException(
 				String.valueOf(group.getGroupId()),
