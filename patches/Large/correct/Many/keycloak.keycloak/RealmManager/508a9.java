diff --git a/services/src/main/java/org/keycloak/services/managers/RealmManager.java b/services/src/main/java/org/keycloak/services/managers/RealmManager.java
index d0f3e95..1387f12 100755
--- a/services/src/main/java/org/keycloak/services/managers/RealmManager.java
+++ b/services/src/main/java/org/keycloak/services/managers/RealmManager.java
@@ -253,7 +253,7 @@
             }
         }
 
-        if (rep.isAccountManagement() != null && rep.isAccountManagement()) {
+        if (rep.getAccountManagement() != null && rep.getAccountManagement()) {
             enableAccountManagement(newRealm);
         }
 
