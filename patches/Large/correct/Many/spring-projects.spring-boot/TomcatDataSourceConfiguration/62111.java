diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/TomcatDataSourceConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/TomcatDataSourceConfiguration.java
index 54fbf7e..de24c31 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/TomcatDataSourceConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/TomcatDataSourceConfiguration.java
@@ -44,7 +44,7 @@
 		this.pool.setMaxIdle(getMaxIdle());
 		this.pool.setMinIdle(getMinIdle());
 		this.pool.setTestOnBorrow(isTestOnBorrow());
-		this.pool.setTestOnReturn(isTestOnBorrow());
+		this.pool.setTestOnReturn(isTestOnReturn());
 		this.pool.setValidationQuery(getValidationQuery());
 		return this.pool;
 	}
