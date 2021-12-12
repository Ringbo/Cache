diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/data/handlers/JDBCNumberValueHandler.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/data/handlers/JDBCNumberValueHandler.java
index 1fb9241..e759d7b 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/data/handlers/JDBCNumberValueHandler.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/data/handlers/JDBCNumberValueHandler.java
@@ -193,7 +193,7 @@
                     break;
                 case java.sql.Types.NUMERIC:
                     if (number instanceof Long) {
-                        statement.setLong(paramIndex, number.intValue());
+                        statement.setLong(paramIndex, number.longValue());
                     } else if (number instanceof Integer) {
                         statement.setInt(paramIndex, number.intValue());
                     } else if (number instanceof Short) {
