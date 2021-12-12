diff --git a/core/test/src/com/google/zxing/oned/rss/expanded/RSSExpandedBlackBox2TestCase.java b/core/test/src/com/google/zxing/oned/rss/expanded/RSSExpandedBlackBox2TestCase.java
index b40fe46..1903b96 100644
--- a/core/test/src/com/google/zxing/oned/rss/expanded/RSSExpandedBlackBox2TestCase.java
+++ b/core/test/src/com/google/zxing/oned/rss/expanded/RSSExpandedBlackBox2TestCase.java
@@ -35,6 +35,6 @@
   public RSSExpandedBlackBox2TestCase() {
     super("test/data/blackbox/rssexpanded-2", new MultiFormatReader(), BarcodeFormat.RSS_EXPANDED);
     addTest(21, 23, 0.0f);
-    addTest(19, 23, 180.0f);
+    addTest(21, 23, 180.0f);
   }
 }
