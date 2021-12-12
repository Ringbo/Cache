diff --git a/java/org/apache/catalina/realm/JDBCRealm.java b/java/org/apache/catalina/realm/JDBCRealm.java
index 639596d..332ff6b 100644
--- a/java/org/apache/catalina/realm/JDBCRealm.java
+++ b/java/org/apache/catalina/realm/JDBCRealm.java
@@ -698,7 +698,7 @@
                 driver = (Driver) clazz.newInstance();
             } catch (Throwable e) {
                 ExceptionUtils.handleThrowable(e);
-                throw new SQLException(e.getMessage());
+                throw new SQLException(e.getMessage(), e);
             }
         }
 
