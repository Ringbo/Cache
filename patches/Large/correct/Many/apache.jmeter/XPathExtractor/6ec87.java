diff --git a/src/components/org/apache/jmeter/extractor/XPathExtractor.java b/src/components/org/apache/jmeter/extractor/XPathExtractor.java
index 824911e..c162e11 100644
--- a/src/components/org/apache/jmeter/extractor/XPathExtractor.java
+++ b/src/components/org/apache/jmeter/extractor/XPathExtractor.java
@@ -216,7 +216,7 @@
       byte[] utf8data = unicodeData.getBytes("UTF-8"); // $NON-NLS-1$
       ByteArrayInputStream in = new ByteArrayInputStream(utf8data);
       // this method assumes UTF-8 input data
-      return XPathUtil.makeDocument(in,false,false,useNameSpace(),isTolerant(),isQuiet(),showWarnings(),reportErrors());
+      return XPathUtil.makeDocument(in,false,false,useNameSpace(),isTolerant(),isQuiet(),showWarnings(),reportErrors(),true);
     }
 
     /**
