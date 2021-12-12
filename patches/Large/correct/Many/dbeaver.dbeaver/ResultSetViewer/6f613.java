diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
index aff42a0..8c2a49d 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
@@ -1695,7 +1695,7 @@
         if ((force || isServerSideFiltering()) && supportsDataFilter()) {
             if (resultSetProvider != null && resultSetProvider.isReadyToRun() && getDataContainer() != null && dataPumpJob == null) {
                 int segmentSize = getSegmentMaxRows();
-                if (curRowNum >= segmentSize) {
+                if (curRowNum >= segmentSize && segmentSize > 0) {
                     segmentSize = (curRowNum / segmentSize + 1) * segmentSize;
                 }
                 runDataPump(0, segmentSize, new GridPos(curColNum, curRowNum), onSuccess);
