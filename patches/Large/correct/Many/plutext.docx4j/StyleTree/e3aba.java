diff --git a/docx4j/src/main/java/org/docx4j/model/styles/StyleTree.java b/docx4j/src/main/java/org/docx4j/model/styles/StyleTree.java
index 8dbc021..a6379ed 100644
--- a/docx4j/src/main/java/org/docx4j/model/styles/StyleTree.java
+++ b/docx4j/src/main/java/org/docx4j/model/styles/StyleTree.java
@@ -69,7 +69,7 @@
         		
             	Style style = allStyles.get(styleId);
                 if (style == null ) {
-                	log.error("Couldn't find style: " + styleId);
+                	log.warn("Couldn't find style: " + styleId);
                 	continue;
                 } 	        		
         		// Is it a table style?
@@ -89,7 +89,7 @@
         		
             	Style style = allStyles.get(styleId);
                 if (style == null ) {
-                	log.error("Couldn't find style: " + styleId);
+                	log.warn("Couldn't find style: " + styleId);
                 	continue;
                 } 	        		
         		// Is it a paragraph style?
@@ -109,7 +109,7 @@
         		
             	Style style = allStyles.get(styleId);
                 if (style == null ) {
-                	log.error("Couldn't find style: " + styleId);
+                	log.warn("Couldn't find style: " + styleId);
                 	continue;
                 } 	        		
         		// Is it a character style?
