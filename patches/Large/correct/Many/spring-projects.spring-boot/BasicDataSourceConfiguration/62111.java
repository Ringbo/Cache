diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/BasicDataSourceConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/BasicDataSourceConfiguration.java
index 53398e3..98f8ab4 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/BasicDataSourceConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/BasicDataSourceConfiguration.java
@@ -54,7 +54,7 @@
 		this.pool.setMaxIdle(getMaxIdle());
 		this.pool.setMinIdle(getMinIdle());
 		this.pool.setTestOnBorrow(isTestOnBorrow());
-		this.pool.setTestOnReturn(isTestOnBorrow());
+		this.pool.setTestOnReturn(isTestOnReturn());
 		this.pool.setValidationQuery(getValidationQuery());
 		return this.pool;
 	}
