diff --git a/src/gwt/src/org/rstudio/core/client/theme/DocTabLayoutPanel.java b/src/gwt/src/org/rstudio/core/client/theme/DocTabLayoutPanel.java
index e3bdcad..2ad6976 100644
--- a/src/gwt/src/org/rstudio/core/client/theme/DocTabLayoutPanel.java
+++ b/src/gwt/src/org/rstudio/core/client/theme/DocTabLayoutPanel.java
@@ -184,7 +184,7 @@
 
       // When tabs are closed, the overall width shrinks, and this can lead
       // to cases where there's too much empty space on the screen
-      Node lastTab = getLastChildElement(tabBarParent);
+      Node lastTab = getLastChildElement(tabBar);
       if (lastTab == null || lastTab.getNodeType() != Node.ELEMENT_NODE)
          return;
       int edge = DomUtils.getRelativePosition(tabBarParent, Element.as(lastTab)).x 
