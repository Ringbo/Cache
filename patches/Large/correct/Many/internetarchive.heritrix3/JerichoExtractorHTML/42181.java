diff --git a/modules/src/main/java/org/archive/modules/extractor/JerichoExtractorHTML.java b/modules/src/main/java/org/archive/modules/extractor/JerichoExtractorHTML.java
index 53770b3..30b0baa 100644
--- a/modules/src/main/java/org/archive/modules/extractor/JerichoExtractorHTML.java
+++ b/modules/src/main/java/org/archive/modules/extractor/JerichoExtractorHTML.java
@@ -144,7 +144,7 @@
             }
             if ("base".equals(elementName)) {
                 try {
-                    UURI base = UURIFactory.getInstance(attrValue);
+                    UURI base = UURIFactory.getInstance(curi.getUURI(),attrValue);
                     curi.setBaseURI(base);
                 } catch (URIException e) {
                     logUriError(e, curi.getUURI(), attrValue);
