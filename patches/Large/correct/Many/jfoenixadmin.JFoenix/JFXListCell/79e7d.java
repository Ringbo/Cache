diff --git a/src/com/jfoenix/controls/JFXListCell.java b/src/com/jfoenix/controls/JFXListCell.java
index 6c376d1..659d42d 100644
--- a/src/com/jfoenix/controls/JFXListCell.java
+++ b/src/com/jfoenix/controls/JFXListCell.java
@@ -259,7 +259,7 @@
 //								borderWidth += listview.getPadding().getTop();
 //								borderWidth += listview.getPadding().getBottom();
 //							}
-							double newHeight = (this.getHeight() + listview.currentVerticalGapProperty().get()) * listview.getItems().size() + this.snappedTopInset() + this.snappedBottomInset() - listview.currentVerticalGapProperty().get();
+							double newHeight = (this.getHeight() + listview.currentVerticalGapProperty().get()) * listview.getItems().size() + listview.snappedTopInset() + listview.snappedBottomInset() - listview.currentVerticalGapProperty().get();
 							/*
 							 *  expanding list will ignore its maxheight property. 
 							 *  the maxHeight property shouldn't be set by the user, otherwise
