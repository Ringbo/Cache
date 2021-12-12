diff --git a/docx4j/src/pptx4j/java/org/pptx4j/convert/out/svginhtml/SvgExporter.java b/docx4j/src/pptx4j/java/org/pptx4j/convert/out/svginhtml/SvgExporter.java
index d079236..b13ef6e 100644
--- a/docx4j/src/pptx4j/java/org/pptx4j/convert/out/svginhtml/SvgExporter.java
+++ b/docx4j/src/pptx4j/java/org/pptx4j/convert/out/svginhtml/SvgExporter.java
@@ -461,7 +461,7 @@
     	// Geometrical transforms
     	CTTransform2D xfrm = cxnSp.getSpPr().getXfrm();
     	Box b = new Box(xfrm.getOff().getX(), xfrm.getOff().getY(),
-    			xfrm.getExt().getCx(), xfrm.getExt().getCx() );
+    			xfrm.getExt().getCx(), xfrm.getExt().getCy() );
     	
     	if (xfrm.getRot()!=0) {
     		b.rotate(xfrm.getRot());
