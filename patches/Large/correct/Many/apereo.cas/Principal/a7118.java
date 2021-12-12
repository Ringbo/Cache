diff --git a/api/cas-server-core-api-authentication/src/main/java/org/apereo/cas/authentication/principal/Principal.java b/api/cas-server-core-api-authentication/src/main/java/org/apereo/cas/authentication/principal/Principal.java
index 6feda95..7bfe1b7 100644
--- a/api/cas-server-core-api-authentication/src/main/java/org/apereo/cas/authentication/principal/Principal.java
+++ b/api/cas-server-core-api-authentication/src/main/java/org/apereo/cas/authentication/principal/Principal.java
@@ -32,6 +32,6 @@
      * @return the map of configured attributes for this principal
      */
     default Map<String, Object> getAttributes() {
-        return new LinkedHashMap<>();
+        return new LinkedHashMap<>(0);
     }
 }
