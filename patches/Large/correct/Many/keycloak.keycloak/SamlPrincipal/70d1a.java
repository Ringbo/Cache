diff --git a/adapters/saml/core-public/src/main/java/org/keycloak/adapters/saml/SamlPrincipal.java b/adapters/saml/core-public/src/main/java/org/keycloak/adapters/saml/SamlPrincipal.java
index e516e34..f9a1e77 100755
--- a/adapters/saml/core-public/src/main/java/org/keycloak/adapters/saml/SamlPrincipal.java
+++ b/adapters/saml/core-public/src/main/java/org/keycloak/adapters/saml/SamlPrincipal.java
@@ -105,7 +105,7 @@
      * @return
      */
     public List<String> getFriendlyAttributes(String friendlyName) {
-        List<String> list = friendlyAttributes.get(name);
+        List<String> list = friendlyAttributes.get(friendlyName);
         if (list != null) {
             return Collections.unmodifiableList(list);
         } else {
