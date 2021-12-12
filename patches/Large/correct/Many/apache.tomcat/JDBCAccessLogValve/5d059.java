diff --git a/java/org/apache/catalina/valves/JDBCAccessLogValve.java b/java/org/apache/catalina/valves/JDBCAccessLogValve.java
index 2ba0069..767c30f 100644
--- a/java/org/apache/catalina/valves/JDBCAccessLogValve.java
+++ b/java/org/apache/catalina/valves/JDBCAccessLogValve.java
@@ -573,7 +573,7 @@
                 driver = (Driver) clazz.newInstance();
             } catch (Throwable e) {
                 ExceptionUtils.handleThrowable(e);
-                throw new SQLException(e.getMessage());
+                throw new SQLException(e.getMessage(), e);
             }
         }
 
