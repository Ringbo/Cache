diff --git a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/data/OracleTimestampValueHandler.java b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/data/OracleTimestampValueHandler.java
index 5c33fba..3361a5f 100644
--- a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/data/OracleTimestampValueHandler.java
+++ b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/data/OracleTimestampValueHandler.java
@@ -81,7 +81,7 @@
                         TIMESTAMPTZ_READ_METHOD.setAccessible(true);
                     }
                 }
-                return TIMESTAMP_READ_METHOD.invoke(object, connection);
+                return TIMESTAMPTZ_READ_METHOD.invoke(object, connection);
             case OracleConstants.TIMESTAMPLTZ_CLASS_NAME:
                 synchronized (OracleTimestampValueHandler.class) {
                     if (TIMESTAMPLTZ_READ_METHOD == null) {
