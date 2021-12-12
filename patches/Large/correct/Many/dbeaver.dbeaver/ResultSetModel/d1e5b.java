diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetModel.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetModel.java
index 523b20b..6955bdf 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetModel.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetModel.java
@@ -339,7 +339,7 @@
 
                 boolean cellWasEdited = row.changes != null && row.changes.containsKey(attr);
                 Object oldOldValue = !cellWasEdited ? null : row.changes.get(attr);
-                if (cellWasEdited && !CommonUtils.equalObjects(oldValue, oldOldValue)) {
+                if (cellWasEdited && !CommonUtils.equalObjects(oldValue, oldOldValue) && !CommonUtils.equalObjects(oldValue, value)) {
                     // Value rewrite - release previous stored old value
                     DBUtils.releaseValue(oldValue);
                 } else if (updateChanges) {
