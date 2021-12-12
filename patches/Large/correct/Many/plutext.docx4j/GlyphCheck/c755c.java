diff --git a/src/main/java/org/docx4j/fonts/GlyphCheck.java b/src/main/java/org/docx4j/fonts/GlyphCheck.java
index 3f25924..75ffcc2 100644
--- a/src/main/java/org/docx4j/fonts/GlyphCheck.java
+++ b/src/main/java/org/docx4j/fonts/GlyphCheck.java
@@ -57,7 +57,7 @@
 		PhysicalFont pf = PhysicalFonts.get(fontName);
 		if (pf==null) {
 			if (!warnedAlready.contains(fontName)) {
-				log.error("Couldn't get font " + fontName);
+				log.warn("Couldn't get font " + fontName);
 				warnedAlready.add(fontName);
 			}
 			return false;
