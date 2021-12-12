diff --git a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/test/java/com/liferay/dynamic/data/lists/form/web/internal/converter/serializer/CalculateDDLFormRuleActionSerializerTest.java b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/test/java/com/liferay/dynamic/data/lists/form/web/internal/converter/serializer/CalculateDDLFormRuleActionSerializerTest.java
index 9191a96..645f4ed 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/test/java/com/liferay/dynamic/data/lists/form/web/internal/converter/serializer/CalculateDDLFormRuleActionSerializerTest.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-form-web/src/test/java/com/liferay/dynamic/data/lists/form/web/internal/converter/serializer/CalculateDDLFormRuleActionSerializerTest.java
@@ -88,7 +88,7 @@
 		mockStatic(ServiceContextThreadLocal.class);
 
 		when(
-			ServiceContextThreadLocal.popServiceContext()
+			ServiceContextThreadLocal.getServiceContext()
 		).thenReturn(
 			_serviceContext
 		);
