diff --git a/tools/src/main/java/com/graphhopper/ui/GraphicsWrapper.java b/tools/src/main/java/com/graphhopper/ui/GraphicsWrapper.java
index 02aa88a..5435269 100644
--- a/tools/src/main/java/com/graphhopper/ui/GraphicsWrapper.java
+++ b/tools/src/main/java/com/graphhopper/ui/GraphicsWrapper.java
@@ -125,11 +125,11 @@
 
 
     public void plotNode(Graphics2D g2, int loc, Color c, int size) {
-        plotNode(g2, loc, c, size);
+        plotNode(g2, loc, c, size, "");
     }
 
     public void plotNode(Graphics2D g2, int loc, Color c, int size, String text) {
-        plotNode(g2, na, loc, c, 4, "");
+        plotNode(g2, na, loc, c, size, "");
     }
 
     public void plotNode(Graphics2D g2, NodeAccess na, int loc, Color c, int size, String text) {
