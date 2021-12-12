diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/data/redis/RedisAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/data/redis/RedisAutoConfiguration.java
index ddc765a..73f3025 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/data/redis/RedisAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/data/redis/RedisAutoConfiguration.java
@@ -125,7 +125,7 @@
 					clusterProperties.getNodes());
 
 			if (clusterProperties.getMaxRedirects() != null) {
-				config.setMaxRedirects(config.getMaxRedirects());
+				config.setMaxRedirects(clusterProperties.getMaxRedirects());
 			}
 			return config;
 		}
