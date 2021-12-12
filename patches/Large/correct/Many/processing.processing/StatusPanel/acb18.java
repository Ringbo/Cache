diff --git a/app/src/processing/app/contrib/StatusPanel.java b/app/src/processing/app/contrib/StatusPanel.java
index a38d139..56ec3e0 100644
--- a/app/src/processing/app/contrib/StatusPanel.java
+++ b/app/src/processing/app/contrib/StatusPanel.java
@@ -181,7 +181,7 @@
                                 BUTTON_WIDTH, BUTTON_WIDTH, BUTTON_WIDTH)
                   .addComponent(updateButton)
                   .addComponent(removeButton))
-      .addGap(16));  // make buttons line up relative to the scrollbar
+      .addGap(12));  // make buttons line up relative to the scrollbar
 
     layout.setVerticalGroup(layout
       .createParallelGroup(GroupLayout.Alignment.LEADING)
