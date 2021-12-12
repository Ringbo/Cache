diff --git a/webapp/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasFiltersConfiguration.java b/webapp/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasFiltersConfiguration.java
index 860b110..879f9e5 100644
--- a/webapp/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasFiltersConfiguration.java
+++ b/webapp/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasFiltersConfiguration.java
@@ -90,7 +90,7 @@
         val cors = casProperties.getHttpWebRequest().getCors();
         val source = new UrlBasedCorsConfigurationSource();
         val config = new CorsConfiguration();
-        config.setAllowCredentials(cors.isEnabled());
+        config.setAllowCredentials(cors.isAllowCredentials());
         config.setAllowedOrigins(cors.getAllowOrigins());
         config.setAllowedMethods(cors.getAllowMethods());
         config.setAllowedHeaders(cors.getAllowHeaders());
