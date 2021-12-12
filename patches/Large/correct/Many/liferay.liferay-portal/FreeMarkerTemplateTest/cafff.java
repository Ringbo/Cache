diff --git a/portal-impl/test/integration/com/liferay/portal/freemarker/FreeMarkerTemplateTest.java b/portal-impl/test/integration/com/liferay/portal/freemarker/FreeMarkerTemplateTest.java
index 925ddaf..09807f9 100755
--- a/portal-impl/test/integration/com/liferay/portal/freemarker/FreeMarkerTemplateTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/freemarker/FreeMarkerTemplateTest.java
@@ -82,7 +82,7 @@
 	public void testGet() throws Exception {
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
-			_configuration, _templateContextHelper);
+			_configuration, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -101,7 +101,7 @@
 	public void testPrepare() throws Exception {
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
-			_configuration, _templateContextHelper);
+			_configuration, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -122,7 +122,7 @@
 	public void testProcessTemplate1() throws Exception {
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
-			_configuration, _templateContextHelper);
+			_configuration, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -139,7 +139,7 @@
 	public void testProcessTemplate2() throws Exception {
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_WRONG_TEMPLATE_ID), null, null,
-			_configuration, _templateContextHelper);
+			_configuration, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -168,7 +168,7 @@
 		Template template = new FreeMarkerTemplate(
 			new StringTemplateResource(
 				_WRONG_TEMPLATE_ID, _TEST_TEMPLATE_CONTENT), null, null,
-			_configuration, _templateContextHelper);
+			_configuration, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -186,7 +186,7 @@
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME),
 			new MockTemplateResource(_WRONG_ERROR_TEMPLATE_ID), null,
-			_configuration, _templateContextHelper);
+			_configuration, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -204,7 +204,7 @@
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_WRONG_TEMPLATE_ID),
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, _configuration,
-			_templateContextHelper);
+			_templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -222,7 +222,7 @@
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_WRONG_TEMPLATE_ID),
 			new MockTemplateResource(_WRONG_ERROR_TEMPLATE_ID), null,
-			_configuration, _templateContextHelper);
+			_configuration, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -252,7 +252,7 @@
 			new MockTemplateResource(_WRONG_TEMPLATE_ID),
 			new StringTemplateResource(
 				_WRONG_ERROR_TEMPLATE_ID, _TEST_TEMPLATE_CONTENT),
-			null, _configuration, _templateContextHelper);
+			null, _configuration, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -273,7 +273,7 @@
 
 		Template template = new FreeMarkerTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, context,
-			_configuration, _templateContextHelper);
+			_configuration, _templateContextHelper, false);
 
 		UnsyncStringWriter unsyncStringWriter = new UnsyncStringWriter();
 
