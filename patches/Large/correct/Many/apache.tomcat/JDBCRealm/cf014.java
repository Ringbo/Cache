diff --git a/java/org/apache/catalina/realm/JDBCRealm.java b/java/org/apache/catalina/realm/JDBCRealm.java
index df1b56d..e53bddc 100644
--- a/java/org/apache/catalina/realm/JDBCRealm.java
+++ b/java/org/apache/catalina/realm/JDBCRealm.java
@@ -39,7 +39,8 @@
 * for configuration options.
 *
 * <p><strong>TODO</strong> - Support connection pooling (including message
-* format objects) so that <code>authenticate()</code> does not have to be
+* format objects) so that <code>authenticate()</code>,
+* <code>getPassword()</code> and <code>authenticate()</code> do not have to be
 * synchronized and would fix the ugly connection logic. </p>
 *
 * @author Craig R. McClanahan
@@ -520,7 +521,7 @@
     /**
      * Return the password associated with the given principal's user name.
      */
-    protected String getPassword(String username) {
+    protected synchronized String getPassword(String username) {
 
         // Look up the user's credentials
         String dbCredentials = null;
@@ -725,7 +726,8 @@
      *
      * @exception SQLException if a database error occurs
      */
-    protected PreparedStatement roles(Connection dbConnection, String username)
+    protected synchronized PreparedStatement roles(Connection dbConnection,
+            String username)
         throws SQLException {
 
         if (preparedRoles == null) {
