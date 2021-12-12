diff --git a/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorEmbedded.java b/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorEmbedded.java
index 66793f0..7dec28a 100644
--- a/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorEmbedded.java
+++ b/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorEmbedded.java
@@ -213,7 +213,7 @@
                 Collection<? extends DBSEntityAssociation> refs = rootTable.getReferences(monitor);
                 if (refs != null) {
                     for (DBSEntityAssociation ref : refs) {
-                        result.add(ref.getAssociatedEntity());
+                        result.add(ref.getParentObject());
                     }
                 }
                 monitor.worked(1);
