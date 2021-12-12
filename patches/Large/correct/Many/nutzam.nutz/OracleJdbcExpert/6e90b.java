diff --git a/src/org/nutz/dao/impl/jdbc/oracle/OracleJdbcExpert.java b/src/org/nutz/dao/impl/jdbc/oracle/OracleJdbcExpert.java
index b626657..8e23e10 100644
--- a/src/org/nutz/dao/impl/jdbc/oracle/OracleJdbcExpert.java
+++ b/src/org/nutz/dao/impl/jdbc/oracle/OracleJdbcExpert.java
@@ -75,7 +75,7 @@
                 if (mf.hasDefaultValue())
                     addDefaultValue(sb, mf);
                 if (mf.isUnsigned()) // 有点暴力
-                    sb.append(" Check ( ").append(mf.getColumnName()).append(" >= 0)");
+                    sb.append(" Check ( ").append(mf.getColumnNameInSql()).append(" >= 0)");
             }
             sb.append(',');
         }
