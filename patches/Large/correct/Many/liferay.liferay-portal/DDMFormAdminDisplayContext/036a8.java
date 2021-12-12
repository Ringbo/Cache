diff --git a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/display/context/DDMFormAdminDisplayContext.java b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/display/context/DDMFormAdminDisplayContext.java
index 4783502..b6828c0 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/display/context/DDMFormAdminDisplayContext.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/display/context/DDMFormAdminDisplayContext.java
@@ -801,7 +801,7 @@
 	}
 
 	protected String getFormLayoutURL(boolean privateLayout) {
-		StringBundler sb = new StringBundler(4);
+		StringBundler sb = new StringBundler(3);
 
 		ThemeDisplay themeDisplay = formAdminRequestHelper.getThemeDisplay();
 
