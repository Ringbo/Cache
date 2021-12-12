diff --git a/spring-boot/src/main/java/org/springframework/boot/context/properties/ConfigurationPropertiesBindingPostProcessor.java b/spring-boot/src/main/java/org/springframework/boot/context/properties/ConfigurationPropertiesBindingPostProcessor.java
index 0ac9ce4..2d22769 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/properties/ConfigurationPropertiesBindingPostProcessor.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/properties/ConfigurationPropertiesBindingPostProcessor.java
@@ -417,7 +417,7 @@
 			if (!super.supports(type)) {
 				return false;
 			}
-			if (AnnotatedElementUtils.isAnnotated(type, Validated.class)) {
+			if (AnnotatedElementUtils.hasAnnotation(type, Validated.class)) {
 				return true;
 			}
 			if (type.getPackage().getName().startsWith("org.springframework.boot")) {
