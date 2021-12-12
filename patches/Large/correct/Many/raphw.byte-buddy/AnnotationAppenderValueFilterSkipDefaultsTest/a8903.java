diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/attribute/AnnotationAppenderValueFilterSkipDefaultsTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/attribute/AnnotationAppenderValueFilterSkipDefaultsTest.java
index cc66acf..f734c48 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/attribute/AnnotationAppenderValueFilterSkipDefaultsTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/attribute/AnnotationAppenderValueFilterSkipDefaultsTest.java
@@ -26,7 +26,7 @@
 
     @Test
     public void testFilteringNoDefault() throws Exception {
-        assertThat(AnnotationAppender.ValueFilter.SkipDefaults.INSTANCE.isRelevant(annotationDescription, methodDescription), is(false));
+        assertThat(AnnotationAppender.ValueFilter.SkipDefaults.INSTANCE.isRelevant(annotationDescription, methodDescription), is(true));
         verifyZeroInteractions(annotationDescription);
         verify(methodDescription).getDefaultValue();
         verifyNoMoreInteractions(methodDescription);
@@ -36,7 +36,7 @@
     public void testFilteringNoEquality() throws Exception {
         when(methodDescription.getDefaultValue()).thenReturn(new Object());
         when(annotationDescription.getValue(methodDescription)).thenReturn(new Object());
-        assertThat(AnnotationAppender.ValueFilter.SkipDefaults.INSTANCE.isRelevant(annotationDescription, methodDescription), is(false));
+        assertThat(AnnotationAppender.ValueFilter.SkipDefaults.INSTANCE.isRelevant(annotationDescription, methodDescription), is(true));
         verify(annotationDescription).getValue(methodDescription);
         verifyNoMoreInteractions(annotationDescription);
         verify(methodDescription).getDefaultValue();
@@ -48,7 +48,7 @@
         Object value = new Object();
         when(methodDescription.getDefaultValue()).thenReturn(value);
         when(annotationDescription.getValue(methodDescription)).thenReturn(value);
-        assertThat(AnnotationAppender.ValueFilter.SkipDefaults.INSTANCE.isRelevant(annotationDescription, methodDescription), is(true));
+        assertThat(AnnotationAppender.ValueFilter.SkipDefaults.INSTANCE.isRelevant(annotationDescription, methodDescription), is(false));
         verify(annotationDescription).getValue(methodDescription);
         verifyNoMoreInteractions(annotationDescription);
         verify(methodDescription).getDefaultValue();
