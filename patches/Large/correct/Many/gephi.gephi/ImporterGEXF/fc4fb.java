diff --git a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGEXF.java b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGEXF.java
index b70f82b..40bb2df 100644
--- a/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGEXF.java
+++ b/modules/ImportPlugin/src/main/java/org/gephi/io/importer/plugin/file/ImporterGEXF.java
@@ -368,7 +368,7 @@
 
         //Parent
         if (!pid.isEmpty()) {
-            report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_pid"), Issue.Level.SEVERE));
+            report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_pid", id), Issue.Level.SEVERE));
         }
 
         if (!container.nodeExists(id)) {
@@ -760,7 +760,7 @@
             } else if (edgeType.equalsIgnoreCase("directed")) {
                 edge.setDirection(EdgeDirection.DIRECTED);
             } else {
-                report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_edgetype", edgeType, edge), Issue.Level.SEVERE));
+                report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_edgetype", edgeType, edge.getId()), Issue.Level.SEVERE));
             }
         }
 
