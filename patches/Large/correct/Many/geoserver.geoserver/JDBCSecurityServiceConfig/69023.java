diff --git a/src/security/jdbc/src/main/java/org/geoserver/security/jdbc/config/JDBCSecurityServiceConfig.java b/src/security/jdbc/src/main/java/org/geoserver/security/jdbc/config/JDBCSecurityServiceConfig.java
index e6af2e3..53ef820 100644
--- a/src/security/jdbc/src/main/java/org/geoserver/security/jdbc/config/JDBCSecurityServiceConfig.java
+++ b/src/security/jdbc/src/main/java/org/geoserver/security/jdbc/config/JDBCSecurityServiceConfig.java
@@ -210,7 +210,7 @@
         }
 
         if (propertyFileNameDML == null) {
-            propertyFileNameDML = isMySQL() ? defaultDMLFilenameMySQL() : defaultDDLFilename();
+            propertyFileNameDML = isMySQL() ? defaultDMLFilenameMySQL() : defaultDMLFilename();
         }
     }
 
