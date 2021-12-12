diff --git a/java/org/apache/catalina/realm/JDBCRealm.java b/java/org/apache/catalina/realm/JDBCRealm.java
index 1b7e1a2..1b4dc7f 100644
--- a/java/org/apache/catalina/realm/JDBCRealm.java
+++ b/java/org/apache/catalina/realm/JDBCRealm.java
@@ -38,10 +38,11 @@
 * See the JDBCRealm.howto for more details on how to set up the database and
 * for configuration options.
 *
-* <p><strong>TODO</strong> - Support connection pooling (including message
-* format objects) so that <code>authenticate()</code>,
-* <code>getPassword()</code> and <code>authenticate()</code> do not have to be
-* synchronized and would fix the ugly connection logic. </p>
+* <p>For a <b>Realm</b> implementation that supports connection pooling and
+* doesn't require synchronisation of <code>authenticate()</code>,
+* <code>getPassword()</code>, <code>roles()</code> and
+* <code>getPrincipal()</code> or the ugly connection logic use the
+* <code>DataSourceRealm</code>.</p>
 *
 * @author Craig R. McClanahan
 * @author Carson McDonald
@@ -591,7 +592,7 @@
     /**
      * Return the Principal associated with the given user name.
      */
-    protected Principal getPrincipal(String username) {
+    protected synchronized Principal getPrincipal(String username) {
 
         return (new GenericPrincipal(this,
                                      username,
