diff --git a/model/api/src/main/java/org/keycloak/models/Config.java b/model/api/src/main/java/org/keycloak/models/Config.java
index d1ed6af..2655eb3 100644
--- a/model/api/src/main/java/org/keycloak/models/Config.java
+++ b/model/api/src/main/java/org/keycloak/models/Config.java
@@ -46,7 +46,7 @@
     }
 
     public static void setAuditProvider(String provider) {
-        System.setProperty(MODEL_PROVIDER_KEY, provider);
+        System.setProperty(AUDIT_PROVIDER_KEY, provider);
     }
 
     public static String getAuditExpirationSchedule() {
