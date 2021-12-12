diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java
index 30c9f60..a917306 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java
@@ -177,7 +177,7 @@
 
 		@Bean
 		@ConditionalOnMissingBean(NamedParameterJdbcOperations.class)
-		public NamedParameterJdbcOperations namedParameterJdbcTemplate() {
+		public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
 			return new NamedParameterJdbcTemplate(this.dataSource);
 		}
 
