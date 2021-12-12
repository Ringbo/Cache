diff --git a/src/main/java/org/docx4j/fonts/RunFontSelector.java b/src/main/java/org/docx4j/fonts/RunFontSelector.java
index 04285b7..fd8cf79 100644
--- a/src/main/java/org/docx4j/fonts/RunFontSelector.java
+++ b/src/main/java/org/docx4j/fonts/RunFontSelector.java
@@ -930,7 +930,7 @@
         	    	currentRangeLower = '\uFB00';
         	    	currentRangeUpper = '\uFB4F';
         	    } else if (c>='\uFB50' && c<='\uFDFF') {
-    				vis.fontAction(eastAsia); 
+    				    vis.fontAction(ascii);
         	    	vis.addCharacterToCurrent(c);
         	    	
         	    	currentRangeLower = '\uFB50';
