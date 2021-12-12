diff --git a/plugins/android/testSrc/org/jetbrains/android/dom/AndroidManifestDomTest.java b/plugins/android/testSrc/org/jetbrains/android/dom/AndroidManifestDomTest.java
index b70290f..0175d09 100644
--- a/plugins/android/testSrc/org/jetbrains/android/dom/AndroidManifestDomTest.java
+++ b/plugins/android/testSrc/org/jetbrains/android/dom/AndroidManifestDomTest.java
@@ -156,7 +156,7 @@
   }
 
   public void testInstrumentationRunner() throws Throwable {
-    doTestHighlighting();
+    doTestHighlighting(getTestName(false) + ".xml");
   }
 
   public void testIntentsCompletion1() throws Throwable {
