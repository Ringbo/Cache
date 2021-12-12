diff --git a/src/main/java/org/jsoup/helper/DataUtil.java b/src/main/java/org/jsoup/helper/DataUtil.java
index a4d4f51..94d3ab1 100644
--- a/src/main/java/org/jsoup/helper/DataUtil.java
+++ b/src/main/java/org/jsoup/helper/DataUtil.java
@@ -96,7 +96,7 @@
             // there are times where there is a spurious byte-order-mark at the start of the text. Shouldn't be present
             // in utf-8. If after decoding, there is a BOM, strip it; otherwise will cause the parser to go straight
             // into head mode
-            if (docData.charAt(0) == 65279)
+            if (docData.length() > 0 && docData.charAt(0) == 65279)
                 docData = docData.substring(1);
 
             doc = parser.parseInput(docData, baseUri);
