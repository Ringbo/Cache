diff --git a/docx4j/src/pptx4j/java/org/docx4j/openpackaging/parts/PresentationML/JaxbPmlPart.java b/docx4j/src/pptx4j/java/org/docx4j/openpackaging/parts/PresentationML/JaxbPmlPart.java
index 8226725..5b1079f 100644
--- a/docx4j/src/pptx4j/java/org/docx4j/openpackaging/parts/PresentationML/JaxbPmlPart.java
+++ b/docx4j/src/pptx4j/java/org/docx4j/openpackaging/parts/PresentationML/JaxbPmlPart.java
@@ -84,7 +84,8 @@
 	public static Part newPartForContentType(String contentType, String partName)
 	throws InvalidFormatException, PartUnrecognisedException {
 		
-		if (contentType.equals(ContentTypes.PRESENTATIONML_MAIN)) {
+		if (contentType.equals(ContentTypes.PRESENTATIONML_MAIN)
+				|| contentType.equals(ContentTypes.PRESENTATIONML_TEMPLATE) ) {
 			return new MainPresentationPart(new PartName(partName));
 		} else if (contentType.equals(ContentTypes.PRESENTATIONML_SLIDE)) {
 			return new SlidePart(new PartName(partName));
