diff --git a/org.springframework.context/src/main/java/org/springframework/ui/format/jodatime/AbstractDateTimeAnnotationFormatterFactory.java b/org.springframework.context/src/main/java/org/springframework/ui/format/jodatime/AbstractDateTimeAnnotationFormatterFactory.java
index 9d705b7..65c2bca 100644
--- a/org.springframework.context/src/main/java/org/springframework/ui/format/jodatime/AbstractDateTimeAnnotationFormatterFactory.java
+++ b/org.springframework.context/src/main/java/org/springframework/ui/format/jodatime/AbstractDateTimeAnnotationFormatterFactory.java
@@ -77,7 +77,7 @@
 	// internal helpers
 	
 	private Set<Class<?>> createPropertyTypes() {
-		Set<Class<?>> propertyTypes = new HashSet<Class<?>>();
+		Set<Class<?>> propertyTypes = new HashSet<Class<?>>(5);
 		propertyTypes.add(ReadableInstant.class);
 		propertyTypes.add(ReadablePartial.class);
 		propertyTypes.add(Date.class);
