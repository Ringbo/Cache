diff --git a/model/jpa/src/main/java/org/keycloak/models/jpa/JpaUserCredentialStore.java b/model/jpa/src/main/java/org/keycloak/models/jpa/JpaUserCredentialStore.java
index d3539fe..a1a0cdb 100644
--- a/model/jpa/src/main/java/org/keycloak/models/jpa/JpaUserCredentialStore.java
+++ b/model/jpa/src/main/java/org/keycloak/models/jpa/JpaUserCredentialStore.java
@@ -119,7 +119,7 @@
         entity.setUser(userRef);
         em.persist(entity);
         MultivaluedHashMap<String, String> config = cred.getConfig();
-        if (config != null || !config.isEmpty()) {
+        if (config != null && !config.isEmpty()) {
 
             for (String key : config.keySet()) {
                 List<String> values = config.getList(key);
