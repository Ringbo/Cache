diff --git a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/OracleSchema.java b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/OracleSchema.java
index d8a3032..c43ec53 100644
--- a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/OracleSchema.java
+++ b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/OracleSchema.java
@@ -539,7 +539,7 @@
         {
             // Cache schema constraints if not table specified
             if (forParent == null) {
-                constraintCache.getObject(monitor, schema, null);
+                constraintCache.getAllObjects(monitor, schema);
             }
             super.loadObjects(monitor, schema, forParent);
         }
