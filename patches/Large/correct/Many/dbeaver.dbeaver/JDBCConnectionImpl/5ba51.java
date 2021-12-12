diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCConnectionImpl.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCConnectionImpl.java
index 74727ef..15b0998 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCConnectionImpl.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCConnectionImpl.java
@@ -132,7 +132,7 @@
                         scrollable ? ResultSet.TYPE_SCROLL_INSENSITIVE : ResultSet.TYPE_FORWARD_ONLY,
                         updatable ? ResultSet.CONCUR_UPDATABLE : ResultSet.CONCUR_READ_ONLY);
                 }
-                catch (AbstractMethodError e) {
+                catch (LinkageError e) {
                     return prepareCall(sqlQuery);
                 }
                 catch (UnsupportedOperationException e) {
@@ -156,7 +156,7 @@
                         sqlQuery,
                         Statement.RETURN_GENERATED_KEYS);
                 }
-                catch (AbstractMethodError e) {
+                catch (LinkageError e) {
                     return prepareStatement(sqlQuery);
                 }
                 catch (UnsupportedOperationException e) {
@@ -507,7 +507,7 @@
     {
         try {
             return getConnection().getSchema();
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
@@ -517,7 +517,7 @@
     {
         try {
             getConnection().setSchema(schema);
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
@@ -526,7 +526,7 @@
     public void abort(Executor executor) throws SQLException {
         try {
             getConnection().abort(executor);
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
@@ -535,7 +535,7 @@
     public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
         try {
             getConnection().setNetworkTimeout(executor, milliseconds);
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
@@ -544,7 +544,7 @@
     public int getNetworkTimeout() throws SQLException {
         try {
             return getConnection().getNetworkTimeout();
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
