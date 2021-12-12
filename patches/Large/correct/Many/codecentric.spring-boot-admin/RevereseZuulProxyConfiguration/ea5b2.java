diff --git a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/config/RevereseZuulProxyConfiguration.java b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/config/RevereseZuulProxyConfiguration.java
index 8388871..fbb03c0 100644
--- a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/config/RevereseZuulProxyConfiguration.java
+++ b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/config/RevereseZuulProxyConfiguration.java
@@ -69,7 +69,7 @@
 	@Bean
 	public PreDecorationFilter preDecorationFilter() {
 		return new PreDecorationFilter(routeLocator(), this.server.getServletPrefix(),
-				new ZuulProperties());
+				new ZuulProperties(), new ProxyRequestHelper());
 	}
 
 	@Bean
