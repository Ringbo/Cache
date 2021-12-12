diff --git a/spring-cloud-netflix-eureka-client/src/main/java/org/springframework/cloud/netflix/eureka/EurekaHealthIndicator.java b/spring-cloud-netflix-eureka-client/src/main/java/org/springframework/cloud/netflix/eureka/EurekaHealthIndicator.java
index 975cc82..d7dc499 100644
--- a/spring-cloud-netflix-eureka-client/src/main/java/org/springframework/cloud/netflix/eureka/EurekaHealthIndicator.java
+++ b/spring-cloud-netflix-eureka-client/src/main/java/org/springframework/cloud/netflix/eureka/EurekaHealthIndicator.java
@@ -77,7 +77,7 @@
 				status = new Status("UP",
 						"Eureka discovery client has not yet successfully connected to a Eureka server");
 			}
-			else if (lastFetch > clientConfig.getRegistryFetchIntervalSeconds() * 2) {
+			else if (lastFetch > clientConfig.getRegistryFetchIntervalSeconds() * 2000) {
 				status = new Status("UP",
 						"Eureka discovery client is reporting failures to connect to a Eureka server");
 				builder.withDetail("renewalPeriod",
