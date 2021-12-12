diff --git a/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetModel.java b/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetModel.java
index be8b8fc..9913597 100644
--- a/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetModel.java
+++ b/plugins/org.jkiss.dbeaver.ui.editors.data/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetModel.java
@@ -656,7 +656,7 @@
 //        if (!isSingleSource()) {
 //            return true;
 //        }
-        if (attribute.getMetaAttribute().isReadOnly()) {
+        if (attribute == null || attribute.getMetaAttribute().isReadOnly()) {
             return true;
         }
         DBDRowIdentifier rowIdentifier = attribute.getRowIdentifier();
