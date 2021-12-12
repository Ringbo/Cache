diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/junit/report/OverviewPageRenderer.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/junit/report/OverviewPageRenderer.java
index 69b9355..6391609 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/junit/report/OverviewPageRenderer.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/junit/report/OverviewPageRenderer.java
@@ -64,7 +64,7 @@
             htmlWriter.startElement("td").characters(Integer.toString(testPackage.getTestCount())).endElement();
             htmlWriter.startElement("td").characters(Integer.toString(testPackage.getFailureCount())).endElement();
             htmlWriter.startElement("td").characters(testPackage.getFormattedDuration()).endElement();
-            htmlWriter.startElement("td").attribute("class", testPackage.getStatusClass()).characters(testPackage.getFormattedDuration()).endElement();
+            htmlWriter.startElement("td").attribute("class", testPackage.getStatusClass()).characters(testPackage.getFormattedSuccessRate()).endElement();
             htmlWriter.endElement();
         }
         htmlWriter.endElement();
