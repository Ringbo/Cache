diff --git a/services/src/main/java/org/keycloak/services/resources/admin/RealmAdminResource.java b/services/src/main/java/org/keycloak/services/resources/admin/RealmAdminResource.java
index 146ef86..6797344 100644
--- a/services/src/main/java/org/keycloak/services/resources/admin/RealmAdminResource.java
+++ b/services/src/main/java/org/keycloak/services/resources/admin/RealmAdminResource.java
@@ -541,7 +541,7 @@
             query.client(client);
         }
 
-        if (types != null & !types.isEmpty()) {
+        if (types != null && !types.isEmpty()) {
             EventType[] t = new EventType[types.size()];
             for (int i = 0; i < t.length; i++) {
                 t[i] = EventType.valueOf(types.get(i));
