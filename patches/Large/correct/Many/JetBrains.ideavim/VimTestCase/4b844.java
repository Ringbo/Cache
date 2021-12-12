diff --git a/test/org/jetbrains/plugins/ideavim/VimTestCase.java b/test/org/jetbrains/plugins/ideavim/VimTestCase.java
index 462409c..e57b56c 100644
--- a/test/org/jetbrains/plugins/ideavim/VimTestCase.java
+++ b/test/org/jetbrains/plugins/ideavim/VimTestCase.java
@@ -30,7 +30,10 @@
   protected CodeInsightTestFixture myFixture;
 
   public VimTestCase() {
-    PlatformTestCase.initPlatformPrefix(ULTIMATE_MARKER_CLASS, "PlatformLangXml");
+    // Only in IntelliJ IDEA Ultimate Edition
+    PlatformTestCase.initPlatformLangPrefix();
+    // XXX: IntelliJ IDEA Community and Ultimate 12+
+    //PlatformTestCase.initPlatformPrefix(ULTIMATE_MARKER_CLASS, "PlatformLangXml");
   }
 
   @Override
