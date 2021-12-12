diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
index 8c156b1..6a2d191 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
@@ -441,7 +441,8 @@
             if (cAttr instanceof DBDAttributeBinding) {
                 DBDAttributeBinding binding = (DBDAttributeBinding) cAttr;
                 if (binding.getEntityAttribute() != null &&
-                    binding.getEntityAttribute().getName().equals(binding.getMetaAttribute().getName()))
+                    binding.getEntityAttribute().getName().equals(binding.getMetaAttribute().getName()) ||
+                    binding instanceof DBDAttributeBindingType)
                 {
                     attrName = DBUtils.getObjectFullName(dataSource, binding, DBPEvaluationContext.DML);
                 } else {
