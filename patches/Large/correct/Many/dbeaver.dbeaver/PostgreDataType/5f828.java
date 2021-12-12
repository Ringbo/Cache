diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDataType.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDataType.java
index b6721ea..1cfed01 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDataType.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDataType.java
@@ -497,10 +497,10 @@
     @Override
     public String getFullyQualifiedName(DBPEvaluationContext context) {
         final PostgreSchema owner = getParentObject();
-        if (owner == null) {
+        if (owner == null || owner.getName().equals(PostgreConstants.PUBLIC_SCHEMA_NAME) || owner.getName().equals(PostgreConstants.CATALOG_SCHEMA_NAME)) {
             return getName();
         } else {
-            return DBUtils.getQuotedIdentifier(owner) + "." + getName();
+            return DBUtils.getQuotedIdentifier(owner) + "." + DBUtils.getQuotedIdentifier(this);
         }
     }
 
