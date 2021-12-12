diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/MvcUriComponentsBuilder.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/MvcUriComponentsBuilder.java
index e88ece4..97fe1b0 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/MvcUriComponentsBuilder.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/MvcUriComponentsBuilder.java
@@ -379,7 +379,7 @@
 	private static String getTypeRequestMapping(Class<?> controllerType) {
 		Assert.notNull(controllerType, "'controllerType' must not be null");
 		String annotType = RequestMapping.class.getName();
-		AnnotationAttributes attrs = AnnotatedElementUtils.getAnnotationAttributes(controllerType, annotType);
+		AnnotationAttributes attrs = AnnotatedElementUtils.findAnnotationAttributes(controllerType, annotType);
 		if (attrs == null) {
 			return "/";
 		}
@@ -396,7 +396,7 @@
 
 	private static String getMethodRequestMapping(Method method) {
 		String annotType = RequestMapping.class.getName();
-		AnnotationAttributes attrs = AnnotatedElementUtils.getAnnotationAttributes(method, annotType);
+		AnnotationAttributes attrs = AnnotatedElementUtils.findAnnotationAttributes(method, annotType);
 		if (attrs == null) {
 			throw new IllegalArgumentException("No @RequestMapping on: " + method.toGenericString());
 		}
