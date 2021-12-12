diff --git a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/route/SimpleHostRoutingFilter.java b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/route/SimpleHostRoutingFilter.java
index db068f5..a6b3a7e 100644
--- a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/route/SimpleHostRoutingFilter.java
+++ b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/route/SimpleHostRoutingFilter.java
@@ -142,7 +142,7 @@
 	private void initialize() {
 		if(!customHttpClient) {
 			this.connectionManager = connectionManagerFactory.newConnectionManager(
-					this.sslHostnameValidationEnabled,
+					!this.sslHostnameValidationEnabled,
 					this.hostProperties.getMaxTotalConnections(),
 					this.hostProperties.getMaxPerRouteConnections(),
 					this.hostProperties.getTimeToLive(), this.hostProperties.getTimeUnit(),
