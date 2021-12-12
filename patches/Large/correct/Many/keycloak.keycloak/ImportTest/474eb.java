diff --git a/testsuite/integration/src/test/java/org/keycloak/testsuite/model/ImportTest.java b/testsuite/integration/src/test/java/org/keycloak/testsuite/model/ImportTest.java
index 86ca62e..0141166 100755
--- a/testsuite/integration/src/test/java/org/keycloak/testsuite/model/ImportTest.java
+++ b/testsuite/integration/src/test/java/org/keycloak/testsuite/model/ImportTest.java
@@ -86,7 +86,7 @@
         Assert.assertEquals(0,  session.users().getFederatedIdentities(user, realm).size());
 
         List<ClientModel> resources = realm.getClients();
-        Assert.assertEquals(7, resources.size());
+        Assert.assertEquals(8, resources.size());
 
         // Test applications imported
         ClientModel application = realm.getClientByClientId("Application");
@@ -97,7 +97,7 @@
         Assert.assertNotNull(otherApp);
         Assert.assertNull(nonExisting);
         Map<String, ClientModel> clients = realm.getClientNameMap();
-        Assert.assertEquals(7, clients.size());
+        Assert.assertEquals(8, clients.size());
         Assert.assertTrue(clients.values().contains(application));
         Assert.assertTrue(clients.values().contains(otherApp));
         Assert.assertTrue(clients.values().contains(accountApp));
