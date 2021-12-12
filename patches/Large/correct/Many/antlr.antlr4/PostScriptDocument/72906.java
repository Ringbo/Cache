diff --git a/runtime/Java/src/org/antlr/v4/runtime/tree/gui/PostScriptDocument.java b/runtime/Java/src/org/antlr/v4/runtime/tree/gui/PostScriptDocument.java
index 2d930a9..7ab69a8 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/tree/gui/PostScriptDocument.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/tree/gui/PostScriptDocument.java
@@ -33,7 +33,7 @@
 	protected int boundingBoxWidth;
 	protected int boundingBoxHeight;
 
-	protected FontMetrics fontMetrics;
+	protected BasicFontMetrics fontMetrics;
 	protected String fontName;
 	protected int fontSize = 12;
 	protected double lineWidth = 0.3;
@@ -98,7 +98,7 @@
 		this.fontSize = fontSize;
 		try {
 			Class c = Class.forName("org.antlr.v4.runtime.tree.gui." + fontName);
-			this.fontMetrics = (FontMetrics)c.newInstance();
+			this.fontMetrics = (BasicFontMetrics)c.newInstance();
 		}
 		catch (Exception e) {
 			throw new UnsupportedOperationException("No font metrics for "+fontName);
