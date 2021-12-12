diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/data/JDBCNumberValueHandler.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/data/JDBCNumberValueHandler.java
index 6950613..bfa7c46 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/data/JDBCNumberValueHandler.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/data/JDBCNumberValueHandler.java
@@ -108,9 +108,11 @@
                 }
                 break;
             case java.sql.Types.SMALLINT:
-                value = resultSet.getShort(index);
+                // Read int in case of unsigned shorts
+                value = resultSet.getInt(index);
                 break;
             case java.sql.Types.TINYINT:
+                // Read short in case of unsigned byte
                 value = resultSet.getShort(index);
                 break;
             case java.sql.Types.BIT:
