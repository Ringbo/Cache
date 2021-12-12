diff --git a/modules/apps/headless-apio/structure/structure-apio-impl/src/main/java/com/liferay/structure/apio/internal/util/StructureRepresentorBuilderHelperImpl.java b/modules/apps/headless-apio/structure/structure-apio-impl/src/main/java/com/liferay/structure/apio/internal/util/StructureRepresentorBuilderHelperImpl.java
index 670c66e..f1377fc 100644
--- a/modules/apps/headless-apio/structure/structure-apio-impl/src/main/java/com/liferay/structure/apio/internal/util/StructureRepresentorBuilderHelperImpl.java
+++ b/modules/apps/headless-apio/structure/structure-apio-impl/src/main/java/com/liferay/structure/apio/internal/util/StructureRepresentorBuilderHelperImpl.java
@@ -342,7 +342,7 @@
 
 	private String _getDDMFormFieldDataType(DDMFormField ddmFormField) {
 		return _structureFieldConverter.getFieldDataType(
-			ddmFormField.getDataType());
+			ddmFormField.getDataType(), ddmFormField.getType());
 	}
 
 	private String _getDDMFormFieldInputControl(DDMFormField ddmFormField) {
