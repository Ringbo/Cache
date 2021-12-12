diff --git a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/asset/DDMFormAssetRendererFactory.java b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/asset/DDMFormAssetRendererFactory.java
index 93cc994..b1097cc 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/asset/DDMFormAssetRendererFactory.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/asset/DDMFormAssetRendererFactory.java
@@ -63,14 +63,15 @@
 		throws PortalException {
 
 		DDMFormInstanceRecord formInstanceRecord =
-			_ddlRecordLocalService.fetchDDMFormInstanceRecord(classPK);
+			_ddmFormInstanceRecordLocalService.fetchDDMFormInstanceRecord(
+				classPK);
 
 		DDMFormInstanceRecordVersion formInstanceRecordVersion = null;
 
 		if (formInstanceRecord == null) {
 			formInstanceRecordVersion =
-				_ddlRecordVersionLocalService.getFormInstanceRecordVersion(
-					classPK);
+				_ddmFormInstanceRecordVersionLocalService.
+					getFormInstanceRecordVersion(classPK);
 
 			formInstanceRecord =
 				formInstanceRecordVersion.getFormInstanceRecord();
@@ -132,8 +133,8 @@
 
 		DDMFormAssetRenderer ddmFormAssetRenderer = new DDMFormAssetRenderer(
 			formInstanceRecord, formInstanceRecordVersion,
-			_ddlRecordLocalService, _ddmFormRenderer, _ddmFormValuesFactory,
-			_ddmFormValuesMerger);
+			_ddmFormInstanceRecordLocalService, _ddmFormRenderer,
+			_ddmFormValuesFactory, _ddmFormValuesMerger);
 
 		ddmFormAssetRenderer.setAssetRendererType(type);
 		ddmFormAssetRenderer.setServletContext(_servletContext);
@@ -142,11 +143,12 @@
 	}
 
 	@Reference
-	private DDMFormInstanceRecordLocalService _ddlRecordLocalService;
+	private DDMFormInstanceRecordLocalService
+		_ddmFormInstanceRecordLocalService;
 
 	@Reference
 	private DDMFormInstanceRecordVersionLocalService
-		_ddlRecordVersionLocalService;
+		_ddmFormInstanceRecordVersionLocalService;
 
 	@Reference
 	private DDMFormRenderer _ddmFormRenderer;
