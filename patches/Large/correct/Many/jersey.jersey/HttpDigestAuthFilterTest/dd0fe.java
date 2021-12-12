diff --git a/tests/e2e/src/test/java/org/glassfish/jersey/tests/e2e/client/HttpDigestAuthFilterTest.java b/tests/e2e/src/test/java/org/glassfish/jersey/tests/e2e/client/HttpDigestAuthFilterTest.java
index 99b365d..870ecda 100644
--- a/tests/e2e/src/test/java/org/glassfish/jersey/tests/e2e/client/HttpDigestAuthFilterTest.java
+++ b/tests/e2e/src/test/java/org/glassfish/jersey/tests/e2e/client/HttpDigestAuthFilterTest.java
@@ -193,7 +193,7 @@
 		ClientConfig jerseyConfig = new ClientConfig();
 
 		Client client = ClientBuilder.newClient(jerseyConfig);
-		client = client.register(new HttpDigestAuthFilter(DIGEST_TEST_LOGIN, DIGEST_TEST_PASS, 1));
+		client = client.register(new HttpDigestAuthFilter(DIGEST_TEST_LOGIN, DIGEST_TEST_PASS));
 
 		WebTarget resource = client.target(getBaseUri()).path("auth-digest");
 
@@ -207,7 +207,7 @@
 		ClientConfig jerseyConfig = new ClientConfig();
 
 		Client client = ClientBuilder.newClient(jerseyConfig);
-		client = client.register(new HttpDigestAuthFilter(DIGEST_TEST_LOGIN, DIGEST_TEST_PASS, 1));
+		client = client.register(new HttpDigestAuthFilter(DIGEST_TEST_LOGIN, DIGEST_TEST_PASS));
 
 		WebTarget resource = client.target(getBaseUri()).path("auth-digest");
 
@@ -230,7 +230,7 @@
 		ClientConfig jerseyConfig = new ClientConfig();
 
 		Client client = ClientBuilder.newClient(jerseyConfig);
-		client = client.register(new HttpDigestAuthFilter(DIGEST_TEST_LOGIN, DIGEST_TEST_INVALIDPASS, 1));
+		client = client.register(new HttpDigestAuthFilter(DIGEST_TEST_LOGIN, DIGEST_TEST_INVALIDPASS));
 
 		WebTarget resource = client.target(getBaseUri()).path("auth-digest");
 
