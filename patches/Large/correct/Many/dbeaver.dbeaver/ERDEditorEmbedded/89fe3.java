diff --git a/plugins/org.jkiss.dbeaver.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorEmbedded.java b/plugins/org.jkiss.dbeaver.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorEmbedded.java
index 4e83222..c133edf 100644
--- a/plugins/org.jkiss.dbeaver.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorEmbedded.java
+++ b/plugins/org.jkiss.dbeaver.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorEmbedded.java
@@ -215,7 +215,7 @@
                 Collection<? extends DBSEntityAssociation> refs = rootTable.getReferences(monitor);
                 if (refs != null) {
                     for (DBSEntityAssociation ref : refs) {
-                        result.add(ref.getParentObject());
+                        result.add(ref.getAssociatedEntity());
                     }
                 }
                 monitor.worked(1);
