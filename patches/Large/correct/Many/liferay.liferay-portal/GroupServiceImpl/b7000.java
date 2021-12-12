diff --git a/portal-impl/src/com/liferay/portal/service/impl/GroupServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/GroupServiceImpl.java
index 38ea84a..a7780ea 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/GroupServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/GroupServiceImpl.java
@@ -412,7 +412,7 @@
 	public int getGroupsCount(long companyId, long parentGroupId, boolean site)
 		throws PortalException {
 
-		if (parentGroupId == 0) {
+		if (parentGroupId <= 0) {
 			GroupPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW);
 		}
 		else {
@@ -428,7 +428,7 @@
 			long companyId, long parentGroupId, String name, boolean site)
 		throws PortalException {
 
-		if (parentGroupId == 0) {
+		if (parentGroupId <= 0) {
 			GroupPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW);
 		}
 		else {
@@ -454,7 +454,7 @@
 			long companyId, String className, long parentGroupId)
 		throws PortalException {
 
-		if (parentGroupId == 0) {
+		if (parentGroupId <= 0) {
 			GroupPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW);
 		}
 		else {
