diff --git a/src/test/org/codehaus/groovy/grails/web/binding/GrailsDataBinderTests.java b/src/test/org/codehaus/groovy/grails/web/binding/GrailsDataBinderTests.java
index 1952064..f326a0e 100644
--- a/src/test/org/codehaus/groovy/grails/web/binding/GrailsDataBinderTests.java
+++ b/src/test/org/codehaus/groovy/grails/web/binding/GrailsDataBinderTests.java
@@ -125,7 +125,7 @@
         SimpleDateFormat dateFormat;
 
         public TestDateTimePropertyEditor(String format) {
-            this.dateFormat = new SimpleDateFormat(format);
+            this.dateFormat = new SimpleDateFormat(format, Locale.US);
         }
 
         public List getRequiredFields() {
@@ -206,7 +206,7 @@
     public void testBindStructuredDateTimeWithValidData() {
         TestBean bean = bindDateTimeWithCustomEditor("01/01/2009",  "01:00 PM");
         assertNotNull(bean.getMyDateTime());
-        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT);
+        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT, Locale.US);
         assertEquals("01/01/2009 01:00 PM", dateFormat.format(bean.getMyDateTime().getDateTime()));
 
         bean = bindDateTimeWithCustomEditor("01/01/2009",  "");
