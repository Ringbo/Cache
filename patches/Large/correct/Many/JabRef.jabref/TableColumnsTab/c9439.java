diff --git a/src/main/java/org/jabref/gui/preferences/TableColumnsTab.java b/src/main/java/org/jabref/gui/preferences/TableColumnsTab.java
index 40ae744..a441ec7 100644
--- a/src/main/java/org/jabref/gui/preferences/TableColumnsTab.java
+++ b/src/main/java/org/jabref/gui/preferences/TableColumnsTab.java
@@ -314,10 +314,10 @@
         builder.add(tabPanel, 1, 5);
 
         Button buttonWidth = new Button("Update to current column widths");
-        buttonWidth.setPrefSize(200, 30);
+        buttonWidth.setPrefSize(300, 30);
         buttonWidth.setOnAction(e->new UpdateWidthsAction());
         Button buttonOrder = new Button("Update to current column order");
-        buttonOrder.setPrefSize(200, 30);
+        buttonOrder.setPrefSize(300, 30);
         buttonOrder.setOnAction(e->new UpdateOrderAction());
         builder.add(buttonWidth, 1, 6);
         builder.add(buttonOrder, 1, 7);
