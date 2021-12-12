diff --git a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGraphML.java b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGraphML.java
index 17bdde1..234830e 100644
--- a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGraphML.java
+++ b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGraphML.java
@@ -406,15 +406,15 @@
         //Type
         if (!directed.isEmpty()) {
             if (directed.equalsIgnoreCase("true")) {
-                edge.setType(EdgeDirection.DIRECTED);
+                edge.setDirection(EdgeDirection.DIRECTED);
             } else if (directed.equalsIgnoreCase("false")) {
-                edge.setType(EdgeDirection.UNDIRECTED);
+                edge.setDirection(EdgeDirection.UNDIRECTED);
             } else {
                 report.logIssue(new Issue(NbBundle.getMessage(ImporterGraphML.class, "importerGraphML_error_edgetype", directed, edge), Issue.Level.SEVERE));
-                edge.setType(edgeDefault);
+                edge.setDirection(edgeDefault);
             }
         } else {
-            edge.setType(edgeDefault);
+            edge.setDirection(edgeDefault);
         }
 
         boolean end = false;
