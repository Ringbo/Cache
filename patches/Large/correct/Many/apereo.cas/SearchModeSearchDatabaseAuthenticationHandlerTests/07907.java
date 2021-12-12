diff --git a/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/SearchModeSearchDatabaseAuthenticationHandlerTests.java b/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/SearchModeSearchDatabaseAuthenticationHandlerTests.java
index bdfc1e6..d401986 100644
--- a/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/SearchModeSearchDatabaseAuthenticationHandlerTests.java
+++ b/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/SearchModeSearchDatabaseAuthenticationHandlerTests.java
@@ -72,7 +72,7 @@
         c.close();
     }
 
-    private String getSqlInsertStatementToCreateUserAccount(final int i) {
+    private static String getSqlInsertStatementToCreateUserAccount(final int i) {
         return String.format("insert into cassearchusers (username, password) values('%s', '%s');", "user" + i, "psw" + i);
     }
 
