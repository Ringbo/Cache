diff --git a/js-karma/test/com/intellij/javascript/karma/execution/filter/KarmaBrowserErrorFilterTest.java b/js-karma/test/com/intellij/javascript/karma/execution/filter/KarmaBrowserErrorFilterTest.java
index 8786d5d..8802d1b 100644
--- a/js-karma/test/com/intellij/javascript/karma/execution/filter/KarmaBrowserErrorFilterTest.java
+++ b/js-karma/test/com/intellij/javascript/karma/execution/filter/KarmaBrowserErrorFilterTest.java
@@ -13,19 +13,19 @@
 
   public void testBasePath() throws Exception {
     String s = "at http://localhost:9876/base/spec/personSpec.js?1368878723000:22";
-    doTest(s, new FileHyperlinkRawData("spec/personSpec.js", 22, -1, 3, s.length()));
+    doTest(s, new FileHyperlinkRawData("spec/personSpec.js", 21, -1, 3, s.length()));
   }
 
   public void testAbsolutePath() throws Exception {
     String s = "at http://localhost:9876/absolute/home/karma-chai-sample/test/test.js?1378466989000:1";
-    doTest(s, new FileHyperlinkRawData("/home/karma-chai-sample/test/test.js", 1, -1, 3, s.length()));
+    doTest(s, new FileHyperlinkRawData("/home/karma-chai-sample/test/test.js", 0, -1, 3, s.length()));
   }
 
   public void testAbsolutePathWithoutPath() throws Exception {
     String s = "at http://localhost:9876/absoluteC:/Users/User/AppData/Roaming/npm/node_modules/karma-commonjs/client/commonjs_bridge.js?1392838273000:21";
     FileHyperlinkRawData expected = new FileHyperlinkRawData(
       "C:/Users/User/AppData/Roaming/npm/node_modules/karma-commonjs/client/commonjs_bridge.js",
-      21, -1, 3, s.length()
+      20, -1, 3, s.length()
     );
     doTest(s, expected);
   }
