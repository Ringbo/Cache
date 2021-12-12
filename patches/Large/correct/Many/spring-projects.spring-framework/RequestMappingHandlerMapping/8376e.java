diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerMapping.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerMapping.java
index 3b318ac..3e66d60 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerMapping.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerMapping.java
@@ -246,13 +246,13 @@
 		if (annotatedElement instanceof Class<?>) {
 			Class<?> type = (Class<?>) annotatedElement;
 			annotation = AnnotationUtils.findAnnotation(type, RequestMapping.class);
-			attributes = AnnotatedElementUtils.getAnnotationAttributes(type, annotationType);
+			attributes = AnnotatedElementUtils.findAnnotationAttributes(type, annotationType);
 			customCondition = getCustomTypeCondition(type);
 		}
 		else {
 			Method method = (Method) annotatedElement;
 			annotation = AnnotationUtils.findAnnotation(method, RequestMapping.class);
-			attributes = AnnotatedElementUtils.getAnnotationAttributes(method, annotationType);
+			attributes = AnnotatedElementUtils.findAnnotationAttributes(method, annotationType);
 			customCondition = getCustomMethodCondition(method);
 		}
 		RequestMappingInfo info = null;
