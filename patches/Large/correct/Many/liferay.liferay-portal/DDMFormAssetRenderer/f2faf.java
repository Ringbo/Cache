diff --git a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/asset/DDMFormAssetRenderer.java b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/asset/DDMFormAssetRenderer.java
index db794ca..8799694 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/asset/DDMFormAssetRenderer.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-form-web/src/main/java/com/liferay/dynamic/data/mapping/form/web/internal/asset/DDMFormAssetRenderer.java
@@ -59,7 +59,7 @@
 
 		_formInstanceRecord = formInstanceRecord;
 		_formInstanceRecordVersion = formInstanceRecordVersion;
-		_ddlRecordLocalService = ddmFormInstanceRecordLocalService;
+		_ddmFormInstanceRecordLocalService = ddmFormInstanceRecordLocalService;
 		_ddmFormRenderer = ddmFormRenderer;
 		_ddmFormValuesFactory = ddmFormValuesFactory;
 		_ddmFormValuesMerger = ddmFormValuesMerger;
@@ -183,8 +183,9 @@
 		DDMFormViewFormInstanceRecordDisplayContext
 			ddmFormViewFormInstanceRecordDisplayContext =
 				new DDMFormViewFormInstanceRecordDisplayContext(
-					request, response, _ddlRecordLocalService, _ddmFormRenderer,
-					_ddmFormValuesFactory, _ddmFormValuesMerger);
+					request, response, _ddmFormInstanceRecordLocalService,
+					_ddmFormRenderer, _ddmFormValuesFactory,
+					_ddmFormValuesMerger);
 
 		request.setAttribute(
 			WebKeys.PORTLET_DISPLAY_CONTEXT,
@@ -196,7 +197,8 @@
 	private static final Log _log = LogFactoryUtil.getLog(
 		DDMFormAssetRenderer.class);
 
-	private final DDMFormInstanceRecordLocalService _ddlRecordLocalService;
+	private final DDMFormInstanceRecordLocalService
+		_ddmFormInstanceRecordLocalService;
 	private final DDMFormRenderer _ddmFormRenderer;
 	private final DDMFormValuesFactory _ddmFormValuesFactory;
 	private final DDMFormValuesMerger _ddmFormValuesMerger;
