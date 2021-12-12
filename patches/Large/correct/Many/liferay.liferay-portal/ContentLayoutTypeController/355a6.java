diff --git a/modules/apps/layout/layout-type-controller/layout-type-controller-content/src/main/java/com/liferay/layout/type/controller/content/internal/controller/ContentLayoutTypeController.java b/modules/apps/layout/layout-type-controller/layout-type-controller-content/src/main/java/com/liferay/layout/type/controller/content/internal/controller/ContentLayoutTypeController.java
index b712c5c..5ec6717 100644
--- a/modules/apps/layout/layout-type-controller/layout-type-controller-content/src/main/java/com/liferay/layout/type/controller/content/internal/controller/ContentLayoutTypeController.java
+++ b/modules/apps/layout/layout-type-controller/layout-type-controller-content/src/main/java/com/liferay/layout/type/controller/content/internal/controller/ContentLayoutTypeController.java
@@ -90,7 +90,7 @@
 
 	@Override
 	public boolean isFullPageDisplayable() {
-		return true;
+		return false;
 	}
 
 	@Override
