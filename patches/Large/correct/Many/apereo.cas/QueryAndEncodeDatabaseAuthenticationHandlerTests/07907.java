diff --git a/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/QueryAndEncodeDatabaseAuthenticationHandlerTests.java b/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/QueryAndEncodeDatabaseAuthenticationHandlerTests.java
index 434b75d..fb071e0 100644
--- a/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/QueryAndEncodeDatabaseAuthenticationHandlerTests.java
+++ b/cas-server-support-jdbc/src/test/java/org/jasig/cas/adaptors/jdbc/QueryAndEncodeDatabaseAuthenticationHandlerTests.java
@@ -145,11 +145,11 @@
         assertEquals(r.getPrincipal().getId(), "user1");
     }
 
-    private String buildSql(final String where) {
+    private static String buildSql(final String where) {
         return String.format(SQL, where);
     }
 
-    private String buildSql() {
+    private static String buildSql() {
         return String.format(SQL, "username=?;");
     }
 
