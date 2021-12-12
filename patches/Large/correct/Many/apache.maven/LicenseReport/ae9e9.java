diff --git a/maven-plugins/maven-project-info-reports-plugin/src/main/java/org/apache/maven/report/projectinfo/LicenseReport.java b/maven-plugins/maven-project-info-reports-plugin/src/main/java/org/apache/maven/report/projectinfo/LicenseReport.java
index 0a7f7ef..8a8a690 100644
--- a/maven-plugins/maven-project-info-reports-plugin/src/main/java/org/apache/maven/report/projectinfo/LicenseReport.java
+++ b/maven-plugins/maven-project-info-reports-plugin/src/main/java/org/apache/maven/report/projectinfo/LicenseReport.java
@@ -335,7 +335,7 @@
     {
         Pattern anchor = Pattern
             .compile( "(<\\s*" + tagPattern + "\\s+[^>]*" + attributePattern + "\\s*=\\s*\")([^\"]*)\"([^>]*>)" );
-        StringBuilder sb = new StringBuilder( html );
+        StringBuffer sb = new StringBuffer( html );
 
         int indx = 0;
         do
