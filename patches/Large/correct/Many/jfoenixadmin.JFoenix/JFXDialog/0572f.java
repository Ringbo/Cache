diff --git a/jfoenix/src/main/java/com/jfoenix/controls/JFXDialog.java b/jfoenix/src/main/java/com/jfoenix/controls/JFXDialog.java
index d26807f..ec41efb 100644
--- a/jfoenix/src/main/java/com/jfoenix/controls/JFXDialog.java
+++ b/jfoenix/src/main/java/com/jfoenix/controls/JFXDialog.java
@@ -213,7 +213,7 @@
         if (content != null) {
             this.content = content;
             this.content.setPickOnBounds(false);
-            contentHolder.getChildren().add(content);
+            contentHolder.getChildren().setAll(content);
         }
     }
 
