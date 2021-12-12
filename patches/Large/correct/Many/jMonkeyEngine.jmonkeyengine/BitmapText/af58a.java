diff --git a/jme3-core/src/main/java/com/jme3/font/BitmapText.java b/jme3-core/src/main/java/com/jme3/font/BitmapText.java
index 5d2ca16..913bfe1 100644
--- a/jme3-core/src/main/java/com/jme3/font/BitmapText.java
+++ b/jme3-core/src/main/java/com/jme3/font/BitmapText.java
@@ -352,7 +352,7 @@
     public void setTabPosition(float... tabs) {
         block.setTabPosition(tabs);
         letters.invalidate();
-        needRefresh = false;
+        needRefresh = true;
     }
 
     /**
@@ -362,7 +362,7 @@
     public void setTabWidth(float width) {
         block.setTabWidth(width);
         letters.invalidate();
-        needRefresh = false;
+        needRefresh = true;
     }
 
     /**
@@ -373,7 +373,7 @@
     public void setEllipsisChar(char c) {
         block.setEllipsisChar(c);
         letters.invalidate();
-        needRefresh = false;
+        needRefresh = true;
     }
 
     /**
