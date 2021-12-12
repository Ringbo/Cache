diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceProperties.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceProperties.java
index 9d8959d..60ad720 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceProperties.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceProperties.java
@@ -347,7 +347,7 @@
 
 	private static class DataSourceBeanCreationException extends BeanCreationException {
 
-		public DataSourceBeanCreationException(EmbeddedDatabaseConnection connection,
+		DataSourceBeanCreationException(EmbeddedDatabaseConnection connection,
 				Environment environment, String property) {
 			super(getMessage(connection, environment, property));
 		}
