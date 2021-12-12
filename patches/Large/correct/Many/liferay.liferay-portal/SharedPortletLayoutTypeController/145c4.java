diff --git a/modules/addons/layout-type-controller/layout-type-controller-shared-portlet/src/main/java/com/liferay/layout/type/controller/shared/portlet/controller/SharedPortletLayoutTypeController.java b/modules/addons/layout-type-controller/layout-type-controller-shared-portlet/src/main/java/com/liferay/layout/type/controller/shared/portlet/controller/SharedPortletLayoutTypeController.java
index f411cf7..e84dd3f 100644
--- a/modules/addons/layout-type-controller/layout-type-controller-shared-portlet/src/main/java/com/liferay/layout/type/controller/shared/portlet/controller/SharedPortletLayoutTypeController.java
+++ b/modules/addons/layout-type-controller/layout-type-controller-shared-portlet/src/main/java/com/liferay/layout/type/controller/shared/portlet/controller/SharedPortletLayoutTypeController.java
@@ -52,7 +52,7 @@
 
 	@Override
 	public boolean isBrowsable() {
-		return true;
+		return false;
 	}
 
 	@Override
@@ -62,7 +62,7 @@
 
 	@Override
 	public boolean isFullPageDisplayable() {
-		return true;
+		return false;
 	}
 
 	@Override
