diff --git a/src/main/java/com/tagtraum/perf/gcviewer/GCDocument.java b/src/main/java/com/tagtraum/perf/gcviewer/GCDocument.java
index f707340..a6af68e 100644
--- a/src/main/java/com/tagtraum/perf/gcviewer/GCDocument.java
+++ b/src/main/java/com/tagtraum/perf/gcviewer/GCDocument.java
@@ -270,7 +270,7 @@
             getContentPane().add(new JPanel(), constraints);
         }
         scaleModelChart();
-        revalidate();
+        invalidate();
     }
 
     private void lockChartsToOneScrollbar(final JViewport viewport, final boolean lastMaximizedChartPanelView, final ModelChartImpl modelChart, MasterViewPortChangeListener masterViewPortChangeListener) {
