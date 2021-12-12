diff --git a/src-ui/org/pentaho/di/ui/spoon/Spoon.java b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
index 084241f..2e235aa 100644
--- a/src-ui/org/pentaho/di/ui/spoon/Spoon.java
+++ b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
@@ -2927,8 +2927,8 @@
         hops[i] = new TransHopMeta(hopnode, alSteps);
       }
 
-      // What's the difference between loc and min?
       // This is the offset:
+      //
       Point offset = new Point(loc.x - min.x, loc.y - min.y);
 
       // Undo/redo object positions...
@@ -7469,7 +7469,7 @@
         } else if (steps) {
           TransGraph transGraph = getActiveTransGraph();
           if (transGraph != null && transGraph.getLastMove() != null) {
-            pasteXML(transGraph.getManagedObject(), clipcontent, transGraph.getLastMove());
+            pasteXML(transGraph.getManagedObject(), clipcontent, transGraph.screen2real(transGraph.getLastMove().x, transGraph.getLastMove().y));
           }
         } else if (jobEntries) {
           JobGraph jobGraph = getActiveJobGraph();
