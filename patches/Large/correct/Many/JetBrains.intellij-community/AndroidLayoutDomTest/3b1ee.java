diff --git a/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java b/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
index 9571a98..16a3a6e 100644
--- a/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
+++ b/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
@@ -312,7 +312,7 @@
   }
 
   public void testRelativeIdsCompletion() throws Throwable {
-    doTestCompletionVariants(getTestName(true) + ".xml", "@+id/", "@android:", "@id/idd1", "@id/idd2");
+    doTestCompletionVariants(getTestName(false) + ".xml", "@+id/", "@android:", "@id/idd1", "@id/idd2");
   }
 
   private void copyOnClickClasses() throws IOException {
