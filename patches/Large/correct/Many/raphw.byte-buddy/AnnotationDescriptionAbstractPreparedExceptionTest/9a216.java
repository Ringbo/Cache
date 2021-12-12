diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/instrumentation/attribute/annotation/AnnotationDescriptionAbstractPreparedExceptionTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/instrumentation/attribute/annotation/AnnotationDescriptionAbstractPreparedExceptionTest.java
index 9adbb71..390c2f2 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/instrumentation/attribute/annotation/AnnotationDescriptionAbstractPreparedExceptionTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/instrumentation/attribute/annotation/AnnotationDescriptionAbstractPreparedExceptionTest.java
@@ -10,12 +10,12 @@
 
     @Test(expected = ClassNotFoundException.class)
     public void testThrowWithoutClassLoader() throws Exception {
-        new PseudoDescription().load();
+        new PseudoDescription().loadSilent();
     }
 
     @Test(expected = ClassNotFoundException.class)
     public void testThrowWithClassLoader() throws Exception {
-        new PseudoDescription().load(getClass().getClassLoader());
+        new PseudoDescription().loadSilent(getClass().getClassLoader());
     }
 
     private static class PseudoDescription extends AnnotationDescription.AbstractAnnotationDescription.ForPrepared<Annotation> {
