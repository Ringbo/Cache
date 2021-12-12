diff --git a/testsuite/integration/src/test/java/org/keycloak/testsuite/admin/ClientTest.java b/testsuite/integration/src/test/java/org/keycloak/testsuite/admin/ClientTest.java
index c30ee36..01a8ed9 100755
--- a/testsuite/integration/src/test/java/org/keycloak/testsuite/admin/ClientTest.java
+++ b/testsuite/integration/src/test/java/org/keycloak/testsuite/admin/ClientTest.java
@@ -42,7 +42,7 @@
 
     @Test
     public void getClients() {
-        assertNames(realm.clients().findAll(), "account", "realm-management", "security-admin-console", "broker");
+        assertNames(realm.clients().findAll(), "account", "realm-management", "security-admin-console", "broker", "impersonation");
     }
 
     private String createClient() {
@@ -59,7 +59,7 @@
         String id = createClient();
 
         assertNotNull(realm.clients().get(id));
-        assertNames(realm.clients().findAll(), "account", "realm-management", "security-admin-console", "broker", "my-app");
+        assertNames(realm.clients().findAll(), "account", "realm-management", "security-admin-console", "broker", "my-app", "impersonation");
     }
 
     @Test
