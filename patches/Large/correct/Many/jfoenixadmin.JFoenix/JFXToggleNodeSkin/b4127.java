diff --git a/src/com/jfoenix/skins/JFXToggleNodeSkin.java b/src/com/jfoenix/skins/JFXToggleNodeSkin.java
index 945d6c1..331132a 100644
--- a/src/com/jfoenix/skins/JFXToggleNodeSkin.java
+++ b/src/com/jfoenix/skins/JFXToggleNodeSkin.java
@@ -93,7 +93,7 @@
 			// show animation only on user action
 			if(!toggleNode.isDisableAnimation()){
 				if(ft==null){
-					ft = new JFXFillTransition(Duration.millis(320), main);
+					ft = new JFXFillTransition(Duration.millis(120), main);
 					ft.toValueProperty().bind(toggleNode.selectedColorProperty());
 					ft.fromValueProperty().bind(toggleNode.unSelectedColorProperty());
 				}
