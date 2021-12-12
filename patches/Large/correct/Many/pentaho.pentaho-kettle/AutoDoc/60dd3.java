diff --git a/src/org/pentaho/di/trans/steps/autodoc/AutoDoc.java b/src/org/pentaho/di/trans/steps/autodoc/AutoDoc.java
index 4ed5c58..e763cd8 100644
--- a/src/org/pentaho/di/trans/steps/autodoc/AutoDoc.java
+++ b/src/org/pentaho/di/trans/steps/autodoc/AutoDoc.java
@@ -165,7 +165,7 @@
     } else if ("Job".equalsIgnoreCase(fileType)) {
       objectType = RepositoryObjectType.JOB;
     } else {
-      throw new KettleException(BaseMessages.getString(PKG, "AutoDoc.Exception.UnknownFileTypeValue"));
+      throw new KettleException(BaseMessages.getString(PKG, "AutoDoc.Exception.UnknownFileTypeValue", fileType));
     }
 		
 		ReportSubjectLocation location = null;
