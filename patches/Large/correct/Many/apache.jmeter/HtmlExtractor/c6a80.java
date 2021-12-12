diff --git a/src/components/org/apache/jmeter/extractor/HtmlExtractor.java b/src/components/org/apache/jmeter/extractor/HtmlExtractor.java
index 66685ec..d2cd8e8 100644
--- a/src/components/org/apache/jmeter/extractor/HtmlExtractor.java
+++ b/src/components/org/apache/jmeter/extractor/HtmlExtractor.java
@@ -206,7 +206,7 @@
             if (useDefaultExtractor || EXTRACTOR_JSOUP.equals(getExtractor())) {
                 extractor = new JSoupExtractor();
             } else if (EXTRACTOR_JODD.equals(getExtractor())) {
-                extractor = new JSoupExtractor();
+                extractor = new JoddExtractor();
             } else {
                 throw new IllegalArgumentException("Extractor implementation:"+ getExtractor()+" is unknown");
             }
