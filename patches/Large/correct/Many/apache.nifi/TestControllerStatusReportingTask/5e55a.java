diff --git a/nifi-nar-bundles/nifi-standard-bundle/nifi-standard-reporting-tasks/src/test/java/org/apache/nifi/controller/TestControllerStatusReportingTask.java b/nifi-nar-bundles/nifi-standard-bundle/nifi-standard-reporting-tasks/src/test/java/org/apache/nifi/controller/TestControllerStatusReportingTask.java
index 30092a1..9aca0ed 100644
--- a/nifi-nar-bundles/nifi-standard-bundle/nifi-standard-reporting-tasks/src/test/java/org/apache/nifi/controller/TestControllerStatusReportingTask.java
+++ b/nifi-nar-bundles/nifi-standard-bundle/nifi-standard-reporting-tasks/src/test/java/org/apache/nifi/controller/TestControllerStatusReportingTask.java
@@ -39,7 +39,7 @@
     }
 
     private static Logger getLogger(String fieldName) throws Exception {
-        Field f = ControllerStatusReportingTask.class.getField(fieldName);
+        Field f = ControllerStatusReportingTask.class.getDeclaredField(fieldName);
         f.setAccessible(true);
         return (Logger) f.get(null);
     }
