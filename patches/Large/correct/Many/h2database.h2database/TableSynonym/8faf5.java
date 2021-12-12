diff --git a/h2/src/main/org/h2/table/TableSynonym.java b/h2/src/main/org/h2/table/TableSynonym.java
index d58d19f..fb67005 100644
--- a/h2/src/main/org/h2/table/TableSynonym.java
+++ b/h2/src/main/org/h2/table/TableSynonym.java
@@ -67,12 +67,12 @@
 
     @Override
     public String getCreateSQL() {
-        return "CREATE SYNONYM " + getName() + " FOR " + data.synonymForSchema.getName() + "." + data.synonymFor;
+        return "CREATE SYNONYM " + getSQL() + " FOR " + data.synonymForSchema.getName() + "." + data.synonymFor;
     }
 
     @Override
     public String getDropSQL() {
-        return "DROP SYNONYM " + getName();
+        return "DROP SYNONYM " + getSQL();
     }
 
     @Override
