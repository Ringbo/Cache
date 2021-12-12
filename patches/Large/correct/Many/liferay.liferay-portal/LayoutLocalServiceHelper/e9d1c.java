diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceHelper.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceHelper.java
index 90b5e39..1abf662 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceHelper.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceHelper.java
@@ -270,7 +270,7 @@
 
 		Group group = layout.getGroup();
 
-		if (group.isGuest() && !_hasGuestViewPermission(layout)) {
+		if (group.isGuest() && !hasGuestViewPermission(layout)) {
 			LayoutTypeException lte = new LayoutTypeException(
 				LayoutTypeException.FIRST_LAYOUT_PERMISSION);
 
@@ -462,7 +462,7 @@
 	@BeanReference(type = ResourcePermissionLocalService.class)
 	protected ResourcePermissionLocalService resourcePermissionLocalService;
 
-	private boolean _hasGuestViewPermission(Layout layout)
+	protected boolean hasGuestViewPermission(Layout layout)
 		throws PortalException, SystemException {
 
 		Role role = RoleLocalServiceUtil.getRole(
