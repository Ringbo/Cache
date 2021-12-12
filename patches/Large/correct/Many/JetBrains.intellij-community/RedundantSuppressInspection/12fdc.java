diff --git a/inspections/impl/com/intellij/codeInspection/RedundantSuppressInspection.java b/inspections/impl/com/intellij/codeInspection/RedundantSuppressInspection.java
index 41f7c3c..49390ee 100644
--- a/inspections/impl/com/intellij/codeInspection/RedundantSuppressInspection.java
+++ b/inspections/impl/com/intellij/codeInspection/RedundantSuppressInspection.java
@@ -133,7 +133,7 @@
       for (String id : ids) {
         String shortName = id.trim();
         for (InspectionTool tool : tools) {
-          if (tool.getShortName().equals(shortName)) {
+          if (tool instanceof LocalInspectionToolWrapper && ((LocalInspectionToolWrapper)tool).getTool().getID().equals(shortName) || tool.getShortName().equals(shortName)) {
             suppressedTools.add(tool);
           }
         }
@@ -150,7 +150,7 @@
     try {
       result = new ArrayList<ProblemDescriptor>();
       for (InspectionTool tool : suppressedTools) {
-        String toolId = tool.getShortName();
+        String toolId = tool instanceof LocalInspectionToolWrapper ? ((LocalInspectionToolWrapper)tool).getTool().getID() : tool.getShortName();
         tool.initialize(globalContext);
         Collection<CommonProblemDescriptor> descriptors;
         if (tool instanceof LocalInspectionToolWrapper) {
