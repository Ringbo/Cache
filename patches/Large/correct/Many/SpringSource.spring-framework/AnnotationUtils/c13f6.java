diff --git a/spring-core/src/main/java/org/springframework/core/annotation/AnnotationUtils.java b/spring-core/src/main/java/org/springframework/core/annotation/AnnotationUtils.java
index 3f7b85e..2dc5947 100644
--- a/spring-core/src/main/java/org/springframework/core/annotation/AnnotationUtils.java
+++ b/spring-core/src/main/java/org/springframework/core/annotation/AnnotationUtils.java
@@ -1061,7 +1061,7 @@
 			return annotation;
 		}
 
-		InvocationHandler handler = new SynthesizedAnnotationInvocationHandler(annotatedElement, annotation,
+		InvocationHandler handler = new SynthesizedAnnotationInvocationHandler(annotation, annotatedElement,
 			getAttributeAliasMap(annotationType));
 		A synthesizedAnnotation = (A) Proxy.newProxyInstance(ClassUtils.getDefaultClassLoader(), new Class<?>[] {
 			(Class<A>) annotationType, SynthesizedAnnotation.class }, handler);
