diff --git a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-form-renderer/test/unit/com/liferay/dynamic/data/mapping/form/renderer/internal/DDMFormRendererHelperTest.java b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-form-renderer/test/unit/com/liferay/dynamic/data/mapping/form/renderer/internal/DDMFormRendererHelperTest.java
index 9909744..63cb54c 100644
--- a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-form-renderer/test/unit/com/liferay/dynamic/data/mapping/form/renderer/internal/DDMFormRendererHelperTest.java
+++ b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-form-renderer/test/unit/com/liferay/dynamic/data/mapping/form/renderer/internal/DDMFormRendererHelperTest.java
@@ -223,7 +223,7 @@
 		Map<String, String> renderedDDMFormFieldsMap =
 			ddmFormFieldRendererHelper.getRenderedDDMFormFieldsMap();
 
-		Assert.assertEquals(2, renderedDDMFormFieldsMap.size());
+		Assert.assertEquals(7, renderedDDMFormFieldsMap.size());
 
 		Assert.assertEquals(
 			renderedNameDDMFormField, renderedDDMFormFieldsMap.get("Name"));
