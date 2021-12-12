diff --git a/modules/addons/layout-type-controller/layout-type-controller-shared-portlet/src/main/java/com/liferay/layout/type/controller/shared/portlet/controller/SharedPortletLayoutTypeController.java b/modules/addons/layout-type-controller/layout-type-controller-shared-portlet/src/main/java/com/liferay/layout/type/controller/shared/portlet/controller/SharedPortletLayoutTypeController.java
index 640a7d8..f411cf7 100644
--- a/modules/addons/layout-type-controller/layout-type-controller-shared-portlet/src/main/java/com/liferay/layout/type/controller/shared/portlet/controller/SharedPortletLayoutTypeController.java
+++ b/modules/addons/layout-type-controller/layout-type-controller-shared-portlet/src/main/java/com/liferay/layout/type/controller/shared/portlet/controller/SharedPortletLayoutTypeController.java
@@ -57,7 +57,7 @@
 
 	@Override
 	public boolean isFirstPageable() {
-		return true;
+		return false;
 	}
 
 	@Override
