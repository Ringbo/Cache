diff --git a/modules/DesktopDataLaboratory/src/main/java/org/gephi/desktop/datalab/ConfigurationPanel.java b/modules/DesktopDataLaboratory/src/main/java/org/gephi/desktop/datalab/ConfigurationPanel.java
index f28c614..f295bd3 100644
--- a/modules/DesktopDataLaboratory/src/main/java/org/gephi/desktop/datalab/ConfigurationPanel.java
+++ b/modules/DesktopDataLaboratory/src/main/java/org/gephi/desktop/datalab/ConfigurationPanel.java
@@ -130,7 +130,7 @@
     }
 
     private boolean canChangeTimeRepresentation(GraphModel graphModel) {
-        if (graphModel.getGraph().getEdgeCount() > 0) {
+        if (graphModel.getGraph().getNodeCount() > 0) {
             return false;//Graph has to be empty
         }
 
