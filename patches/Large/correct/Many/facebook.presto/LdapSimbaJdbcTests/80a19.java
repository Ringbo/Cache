diff --git a/presto-product-tests/src/main/java/com/facebook/presto/tests/jdbc/LdapSimbaJdbcTests.java b/presto-product-tests/src/main/java/com/facebook/presto/tests/jdbc/LdapSimbaJdbcTests.java
index 22057c8..a520c9f 100644
--- a/presto-product-tests/src/main/java/com/facebook/presto/tests/jdbc/LdapSimbaJdbcTests.java
+++ b/presto-product-tests/src/main/java/com/facebook/presto/tests/jdbc/LdapSimbaJdbcTests.java
@@ -45,7 +45,7 @@
     private static final String MALFORMED_CREDENTIALS_ERROR =
             "[Teradata][Presto](100240) Authentication failed: Malformed decoded credentials.";
     private static final String UNAUTHORIZED_USER_ERROR =
-            "[Teradata][Presto](100240) Authentication failed: Unknown reason.";
+            "[Teradata][Presto](100240) Authentication failed: Unauthorized user.";
     private static final String INVALID_SSL_PROPERTY =
             "[Teradata][Presto](100200) Connection string is invalid: SSL value is not valid for given AuthenticationType.";
 
@@ -138,7 +138,7 @@
     @Test(groups = {LDAP, SIMBA_JDBC, PROFILE_SPECIFIC_TESTS}, timeOut = TIMEOUT)
     public void shouldFailForUserWithColon()
     {
-        expectQueryToFail("UserWith:Colon", ldapUserPassword, INVALID_CREDENTIALS_ERROR);
+        expectQueryToFail("UserWith:Colon", ldapUserPassword, MALFORMED_CREDENTIALS_ERROR);
     }
 
     private void expectQueryToFailForUserNotInGroup(String user)
