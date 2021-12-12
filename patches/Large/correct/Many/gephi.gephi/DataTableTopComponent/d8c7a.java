diff --git a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/DataTableTopComponent.java b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/DataTableTopComponent.java
index 86c623d..d83a146 100644
--- a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/DataTableTopComponent.java
+++ b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/DataTableTopComponent.java
@@ -121,7 +121,7 @@
     private static final String DATA_LABORATORY_EDGES_NODES_LABELS = "DataLaboratory_showEdgesNodesLabels";
     private static final Color invalidFilterColor = new Color(254, 150, 150);
     private final boolean dynamicFiltering;
-    private boolean visibleOnly = false;
+    private boolean visibleOnly = true;
     private boolean useSparklines = false;
     private boolean timeIntervalGraphics = false;
     private boolean showEdgesNodesLabels = false;
@@ -150,7 +150,7 @@
 
         //Get saved preferences if existing:
         dynamicFiltering = NbPreferences.forModule(DataTableTopComponent.class).getBoolean(DATA_LABORATORY_DYNAMIC_FILTERING, true);
-        visibleOnly = NbPreferences.forModule(DataTableTopComponent.class).getBoolean(DATA_LABORATORY_ONLY_VISIBLE, false);
+        visibleOnly = NbPreferences.forModule(DataTableTopComponent.class).getBoolean(DATA_LABORATORY_ONLY_VISIBLE, true);
         useSparklines = NbPreferences.forModule(DataTableTopComponent.class).getBoolean(DATA_LABORATORY_SPARKLINES, false);
         timeIntervalGraphics = NbPreferences.forModule(DataTableTopComponent.class).getBoolean(DATA_LABORATORY_TIME_INTERVAL_GRAPHICS, false);
         showEdgesNodesLabels = NbPreferences.forModule(DataTableTopComponent.class).getBoolean(DATA_LABORATORY_EDGES_NODES_LABELS, false);
