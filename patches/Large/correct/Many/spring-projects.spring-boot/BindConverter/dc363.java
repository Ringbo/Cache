diff --git a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/context/properties/bind/BindConverter.java b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/context/properties/bind/BindConverter.java
index 8d1333a..c8de87f 100644
--- a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/context/properties/bind/BindConverter.java
+++ b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/context/properties/bind/BindConverter.java
@@ -110,7 +110,7 @@
 	}
 
 	/**
-	 * Composite {@link ConversionService} used to call multiple services
+	 * Composite {@link ConversionService} used to call multiple services.
 	 */
 	static class CompositeConversionService implements ConversionService {
 
@@ -205,7 +205,7 @@
 
 		private final SimpleTypeConverter typeConverter;
 
-		public TypeConverterConverter(SimpleTypeConverter typeConverter) {
+		TypeConverterConverter(SimpleTypeConverter typeConverter) {
 			this.typeConverter = typeConverter;
 		}
 
