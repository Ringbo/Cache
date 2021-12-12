diff --git a/modules/portal/portal-template-freemarker/test/integration/com/liferay/portal/template/freemarker/FreeMarkerTemplateTest.java b/modules/portal/portal-template-freemarker/test/integration/com/liferay/portal/template/freemarker/FreeMarkerTemplateTest.java
index c54d800..b7505a1 100644
--- a/modules/portal/portal-template-freemarker/test/integration/com/liferay/portal/template/freemarker/FreeMarkerTemplateTest.java
+++ b/modules/portal/portal-template-freemarker/test/integration/com/liferay/portal/template/freemarker/FreeMarkerTemplateTest.java
@@ -87,7 +87,7 @@
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
 			_configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -107,7 +107,7 @@
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
 			_configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -129,7 +129,7 @@
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
 			_configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -147,7 +147,7 @@
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_WRONG_TEMPLATE_ID), null, null,
 			_configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -177,7 +177,7 @@
 			new StringTemplateResource(
 				_WRONG_TEMPLATE_ID, _TEST_TEMPLATE_CONTENT), null, null,
 			_configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -196,7 +196,7 @@
 			new MockTemplateResource(_TEMPLATE_FILE_NAME),
 			new MockTemplateResource(_WRONG_ERROR_TEMPLATE_ID), null,
 			_configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -215,7 +215,7 @@
 			new MockTemplateResource(_WRONG_TEMPLATE_ID),
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, _configuration,
 			_templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -234,7 +234,7 @@
 			new MockTemplateResource(_WRONG_TEMPLATE_ID),
 			new MockTemplateResource(_WRONG_ERROR_TEMPLATE_ID), null,
 			_configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -265,7 +265,7 @@
 			new StringTemplateResource(
 				_WRONG_ERROR_TEMPLATE_ID, _TEST_TEMPLATE_CONTENT),
 			null, _configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -287,7 +287,7 @@
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, context,
 			_configuration, _templateContextHelper, false,
-			_freemarkerEngineConfiguration.getResourceModificationCheck());
+			_freemarkerEngineConfiguration.resourceModificationCheck());
 
 		UnsyncStringWriter unsyncStringWriter = new UnsyncStringWriter();
 
