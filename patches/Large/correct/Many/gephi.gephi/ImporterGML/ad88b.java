diff --git a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGML.java b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGML.java
index 9902d80..fe45926 100644
--- a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGML.java
+++ b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGML.java
@@ -291,7 +291,7 @@
             } else if ("directed".equalsIgnoreCase(key)) {
                 if (value instanceof Double) {
                     EdgeDirection type = ((Double) value) == 1 ? EdgeDirection.DIRECTED : EdgeDirection.UNDIRECTED;
-                    edge.setType(type);
+                    edge.setDirection(type);
                 } else {
                     report.logIssue(new Issue(NbBundle.getMessage(ImporterGML.class, "importerGML_error_directedparse", edge.toString()), Issue.Level.WARNING));
                 }
