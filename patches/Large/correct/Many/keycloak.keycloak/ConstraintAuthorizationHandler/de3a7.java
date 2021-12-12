diff --git a/proxy/proxy-server/src/main/java/org/keycloak/proxy/ConstraintAuthorizationHandler.java b/proxy/proxy-server/src/main/java/org/keycloak/proxy/ConstraintAuthorizationHandler.java
index 5740563..daed728 100755
--- a/proxy/proxy-server/src/main/java/org/keycloak/proxy/ConstraintAuthorizationHandler.java
+++ b/proxy/proxy-server/src/main/java/org/keycloak/proxy/ConstraintAuthorizationHandler.java
@@ -33,7 +33,7 @@
 
         this.httpHeaderNames = new HashMap<>();
         this.httpHeaderNames.put(KEYCLOAK_SUBJECT, new HttpString(getOrDefault(headerNames, "keycloak-subject", KEYCLOAK_SUBJECT)));
-        this.httpHeaderNames.put(KEYCLOAK_SUBJECT, new HttpString(getOrDefault(headerNames, "keycloak-username", KEYCLOAK_USERNAME)));
+        this.httpHeaderNames.put(KEYCLOAK_USERNAME, new HttpString(getOrDefault(headerNames, "keycloak-username", KEYCLOAK_USERNAME)));
         this.httpHeaderNames.put(KEYCLOAK_EMAIL, new HttpString(getOrDefault(headerNames, "keycloak-email", KEYCLOAK_EMAIL)));
         this.httpHeaderNames.put(KEYCLOAK_NAME, new HttpString(getOrDefault(headerNames, "keycloak-name", KEYCLOAK_NAME)));
         this.httpHeaderNames.put(KEYCLOAK_ACCESS_TOKEN, new HttpString(getOrDefault(headerNames, "keycloak-access-token", KEYCLOAK_ACCESS_TOKEN)));
