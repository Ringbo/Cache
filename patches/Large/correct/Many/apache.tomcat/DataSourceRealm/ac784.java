diff --git a/java/org/apache/catalina/realm/DataSourceRealm.java b/java/org/apache/catalina/realm/DataSourceRealm.java
index edc8818..3d2acf0 100644
--- a/java/org/apache/catalina/realm/DataSourceRealm.java
+++ b/java/org/apache/catalina/realm/DataSourceRealm.java
@@ -431,7 +431,7 @@
         } catch(SQLException e) {
             containerLog.error(
                     sm.getString("dataSourceRealm.getPassword.exception",
-                                 username));
+                                 username), e);
         } finally {
             try {
                 if (rs != null) {
@@ -443,7 +443,7 @@
             } catch (SQLException e) {
                     containerLog.error(
                         sm.getString("dataSourceRealm.getPassword.exception",
-                             username));
+                             username), e);
 
             }
         }
@@ -524,7 +524,7 @@
             return list;
         } catch(SQLException e) {
             containerLog.error(
-                sm.getString("dataSourceRealm.getRoles.exception", username));
+                sm.getString("dataSourceRealm.getRoles.exception", username), e);
         }
         finally {
             try {
@@ -537,7 +537,7 @@
             } catch (SQLException e) {
                     containerLog.error(
                         sm.getString("dataSourceRealm.getRoles.exception",
-                                     username));
+                                     username), e);
             }
         }
 
