diff --git a/api/cas-server-core-api-services/src/main/java/org/apereo/cas/services/RegisteredService.java b/api/cas-server-core-api-services/src/main/java/org/apereo/cas/services/RegisteredService.java
index 01da70b..351d061 100644
--- a/api/cas-server-core-api-services/src/main/java/org/apereo/cas/services/RegisteredService.java
+++ b/api/cas-server-core-api-services/src/main/java/org/apereo/cas/services/RegisteredService.java
@@ -241,7 +241,7 @@
      * @since 4.2
      */
     default Map<String, RegisteredServiceProperty> getProperties() {
-        return new LinkedHashMap<>();
+        return new LinkedHashMap<>(0);
     }
 
     /**
