diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java
index 1187a84..734970e 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/jdbc/DataSourceAutoConfiguration.java
@@ -197,7 +197,7 @@
 				return Outcome.match("found database driver " + driverClassName);
 			}
 
-			return Outcome.match("missing database driver " + driverClassName);
+			return Outcome.noMatch("missing database driver " + driverClassName);
 		}
 
 		private String getDriverClassName(Environment environment, ClassLoader classLoader) {
