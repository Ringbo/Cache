diff --git a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/test/java/com/liferay/dynamic/data/lists/form/web/internal/converter/DDLFormRuleToDDMFormRuleConverterTest.java b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/test/java/com/liferay/dynamic/data/lists/form/web/internal/converter/DDLFormRuleToDDMFormRuleConverterTest.java
index 9a3ac3c..74ab9a4 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/test/java/com/liferay/dynamic/data/lists/form/web/internal/converter/DDLFormRuleToDDMFormRuleConverterTest.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/test/java/com/liferay/dynamic/data/lists/form/web/internal/converter/DDLFormRuleToDDMFormRuleConverterTest.java
@@ -301,7 +301,7 @@
 		PowerMockito.mockStatic(ServiceContextThreadLocal.class);
 
 		PowerMockito.when(
-			ServiceContextThreadLocal.popServiceContext()
+			ServiceContextThreadLocal.getServiceContext()
 		).thenReturn(
 			_serviceContext
 		);
