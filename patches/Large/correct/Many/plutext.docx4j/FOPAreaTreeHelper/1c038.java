diff --git a/src/main/java/org/docx4j/convert/out/fo/FOPAreaTreeHelper.java b/src/main/java/org/docx4j/convert/out/fo/FOPAreaTreeHelper.java
index 60a76d6..27c299f 100644
--- a/src/main/java/org/docx4j/convert/out/fo/FOPAreaTreeHelper.java
+++ b/src/main/java/org/docx4j/convert/out/fo/FOPAreaTreeHelper.java
@@ -390,7 +390,7 @@
 		    			spm.getRegionBefore().setExtent(hBpdaPts+"pt");
 		    			spm.getRegionBody().setMarginTop(hBpdaPts+"pt");
 		    			
-		    			// If the top margin in Word > what we have, then pad with margin bottom
+		    			// If the top margin in Word > what we have, then pad with margin top
 		    			float totalHeight = (page.getHeaderMargin()/20 ) // twips to points
 		    								+ hBpdaPts;
 		    			
@@ -414,7 +414,7 @@
 		    			spm.getRegionAfter().setExtent(fBpdaPts+"pt");
 		    			spm.getRegionBody().setMarginBottom(fBpdaPts+"pt");
 		    			
-		    			// If the bottom margin in Word > what we have, then pad with top bottom
+		    			// If the bottom margin in Word > what we have, then pad with margin bottom
 		    			float totalHeight = (page.getFooterMargin()/20 ) // twips to points
 		    								+ fBpdaPts;
 		    			
@@ -422,7 +422,7 @@
 		    			
 		    			if (extraMargin>0) {
 		    				float required = (page.getPgMar().getBottom().intValue()-page.getFooterMargin())/20;
-			    			spm.getRegionBody().setMarginBottom(extraMargin+"pt");	    				
+			    			spm.getRegionBody().setMarginBottom(required+"pt");	    				
 		    			} // otherwise, we've expanded to the extent of the footer already
 	    			
     				}
