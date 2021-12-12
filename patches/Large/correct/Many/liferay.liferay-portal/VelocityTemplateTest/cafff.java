diff --git a/portal-impl/test/integration/com/liferay/portal/velocity/VelocityTemplateTest.java b/portal-impl/test/integration/com/liferay/portal/velocity/VelocityTemplateTest.java
index 4d7634e..a19f5ff 100644
--- a/portal-impl/test/integration/com/liferay/portal/velocity/VelocityTemplateTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/velocity/VelocityTemplateTest.java
@@ -80,7 +80,7 @@
 	public void testGet() throws Exception {
 		Template template = new VelocityTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
-			_velocityEngine, _templateContextHelper);
+			_velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -99,7 +99,7 @@
 	public void testPrepare() throws Exception {
 		Template template = new VelocityTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
-			_velocityEngine, _templateContextHelper);
+			_velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -120,7 +120,7 @@
 	public void testProcessTemplate1() throws Exception {
 		Template template = new VelocityTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null, null,
-			_velocityEngine, _templateContextHelper);
+			_velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -137,7 +137,7 @@
 	public void testProcessTemplate2() throws Exception {
 		Template template = new VelocityTemplate(
 			new MockTemplateResource(_WRONG_TEMPLATE_ID), null, null,
-			_velocityEngine, _templateContextHelper);
+			_velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -166,7 +166,7 @@
 		Template template = new VelocityTemplate(
 			new StringTemplateResource(
 				_WRONG_TEMPLATE_ID, _TEST_TEMPLATE_CONTENT),
-			null, null, _velocityEngine, _templateContextHelper);
+			null, null, _velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -184,7 +184,7 @@
 		Template template = new VelocityTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME),
 			new MockTemplateResource(_WRONG_ERROR_TEMPLATE_ID), null,
-			_velocityEngine, _templateContextHelper);
+			_velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -202,7 +202,7 @@
 		Template template = new VelocityTemplate(
 			new MockTemplateResource(_WRONG_TEMPLATE_ID),
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null,
-			_velocityEngine, _templateContextHelper);
+			_velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -220,7 +220,7 @@
 		Template template = new VelocityTemplate(
 			new MockTemplateResource(_WRONG_TEMPLATE_ID),
 			new MockTemplateResource(_WRONG_ERROR_TEMPLATE_ID), null,
-			_velocityEngine, _templateContextHelper);
+			_velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -250,7 +250,7 @@
 			new MockTemplateResource(_WRONG_TEMPLATE_ID),
 			new StringTemplateResource(
 				_WRONG_ERROR_TEMPLATE_ID, _TEST_TEMPLATE_CONTENT),
-			null, _velocityEngine, _templateContextHelper);
+			null, _velocityEngine, _templateContextHelper, false);
 
 		template.put(_TEST_KEY, _TEST_VALUE);
 
@@ -271,7 +271,7 @@
 
 		Template template = new VelocityTemplate(
 			new MockTemplateResource(_TEMPLATE_FILE_NAME), null,
-			velocityContext, _velocityEngine, _templateContextHelper);
+			velocityContext, _velocityEngine, _templateContextHelper, false);
 
 		UnsyncStringWriter unsyncStringWriter = new UnsyncStringWriter();
 
