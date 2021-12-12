diff --git a/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/QueryDatabaseAuthenticationHandlerTests.java b/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/QueryDatabaseAuthenticationHandlerTests.java
index 21310be..72d1cf9 100644
--- a/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/QueryDatabaseAuthenticationHandlerTests.java
+++ b/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/QueryDatabaseAuthenticationHandlerTests.java
@@ -65,7 +65,7 @@
         c.close();
     }
 
-    private String getSqlInsertStatementToCreateUserAccount(final int i) {
+    private static String getSqlInsertStatementToCreateUserAccount(final int i) {
         return String.format("insert into casusers (username, password) values('%s', '%s');", "user" + i, "psw" + i);
     }
 
