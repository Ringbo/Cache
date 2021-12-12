diff --git a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/jdbc/TomcatDataSourceConfigurationTests.java b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/jdbc/TomcatDataSourceConfigurationTests.java
index ebc28c6..83f962b 100644
--- a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/jdbc/TomcatDataSourceConfigurationTests.java
+++ b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/jdbc/TomcatDataSourceConfigurationTests.java
@@ -126,7 +126,7 @@
 		assertThat(ds.getTimeBetweenEvictionRunsMillis()).isEqualTo(5000);
 		assertThat(ds.getMinEvictableIdleTimeMillis()).isEqualTo(60000);
 		assertThat(ds.getMaxWait()).isEqualTo(30000);
-		assertThat(ds.getValidationInterval()).isEqualTo(30000L);
+		assertThat(ds.getValidationInterval()).isEqualTo(3000L);
 	}
 
 	@SuppressWarnings("unchecked")
