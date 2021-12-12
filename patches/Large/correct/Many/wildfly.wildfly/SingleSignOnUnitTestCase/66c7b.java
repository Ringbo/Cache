diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/web/sso/SingleSignOnUnitTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/web/sso/SingleSignOnUnitTestCase.java
index 08ba486..72e26f8 100755
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/web/sso/SingleSignOnUnitTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/web/sso/SingleSignOnUnitTestCase.java
@@ -76,7 +76,7 @@
     @Test
     public void testFormAuthSingleSignOn(@ArquillianResource URL baseURLNoAuth) throws Exception {
         log.info("+++ testFormAuthSingleSignOn");
-        SSOBaseCase.executeFormAuthSingleSignOnTest(baseURLNoAuth, baseURLNoAuth, log);
+        SSOTestBase.executeFormAuthSingleSignOnTest(baseURLNoAuth, baseURLNoAuth, log);
     }
 
     /**
@@ -85,7 +85,7 @@
     @Test
     public void testNoAuthSingleSignOn(@ArquillianResource URL baseURLNoAuth) throws Exception {
         log.info("+++ testNoAuthSingleSignOn");
-        SSOBaseCase.executeNoAuthSingleSignOnTest(baseURLNoAuth, baseURLNoAuth, log);
+        SSOTestBase.executeNoAuthSingleSignOnTest(baseURLNoAuth, baseURLNoAuth, log);
     }
 
 }
