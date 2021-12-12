diff --git a/java/org/apache/catalina/authenticator/jaspic/provider/modules/TomcatAuthModule.java b/java/org/apache/catalina/authenticator/jaspic/provider/modules/TomcatAuthModule.java
index 83621e7..6b157ac 100644
--- a/java/org/apache/catalina/authenticator/jaspic/provider/modules/TomcatAuthModule.java
+++ b/java/org/apache/catalina/authenticator/jaspic/provider/modules/TomcatAuthModule.java
@@ -66,7 +66,7 @@
 
 
     public String getRealmName() {
-        return Optional.of(realmName).orElse(DEFAULT_REALM_NAME);
+        return Optional.ofNullable(realmName).orElse(DEFAULT_REALM_NAME);
     }
 
 
