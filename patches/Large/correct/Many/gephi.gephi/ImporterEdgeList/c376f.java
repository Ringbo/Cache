diff --git a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/database/ImporterEdgeList.java b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/database/ImporterEdgeList.java
index 86d46de..e0f38a4 100644
--- a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/database/ImporterEdgeList.java
+++ b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/database/ImporterEdgeList.java
@@ -384,14 +384,14 @@
                 break;
             case SOURCE:
                 String source = rs.getString(column);
-                if (source != null) {
+                if (source != null && !source.isEmpty()) {
                     NodeDraft sourceNode = container.getNode(source);
                     edgeDraft.setSource(sourceNode);
                 }
                 break;
             case TARGET:
                 String target = rs.getString(column);
-                if (target != null) {
+                if (target != null && !target.isEmpty()) {
                     NodeDraft targetNode = container.getNode(target);
                     edgeDraft.setTarget(targetNode);
                 }
