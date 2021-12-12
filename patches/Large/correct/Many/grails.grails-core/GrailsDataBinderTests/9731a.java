diff --git a/grails-test-suite-uber/src/test/groovy/org/codehaus/groovy/grails/web/binding/GrailsDataBinderTests.java b/grails-test-suite-uber/src/test/groovy/org/codehaus/groovy/grails/web/binding/GrailsDataBinderTests.java
index 8292445..5aadf43 100644
--- a/grails-test-suite-uber/src/test/groovy/org/codehaus/groovy/grails/web/binding/GrailsDataBinderTests.java
+++ b/grails-test-suite-uber/src/test/groovy/org/codehaus/groovy/grails/web/binding/GrailsDataBinderTests.java
@@ -184,7 +184,7 @@
         assertNotNull( binder.getAllowedFields());
         assertEquals(0, binder.getAllowedFields().length);
         assertNotNull( binder.getDisallowedFields());
-        assertEquals(0, binder.getDisallowedFields().length);
+        assertEquals(2, binder.getDisallowedFields().length);
     }
 
     public void testBindStructuredDateWithDayPrecision() throws Exception {
