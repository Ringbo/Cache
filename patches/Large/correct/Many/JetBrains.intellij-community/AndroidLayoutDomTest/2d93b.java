diff --git a/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java b/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
index 1b027c5..52b3593 100644
--- a/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
+++ b/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
@@ -141,7 +141,7 @@
   }
 
   public void testLayoutAttributeValuesCompletion() throws Throwable {
-    doTestCompletionVariants("av10.xml", "fill_parent", "match_parent", "wrap_content", "@android:");
+    doTestCompletionVariants("av10.xml", "fill_parent", "match_parent", "wrap_content", "@android:", "@dimen/myDimen");
     doTestCompletionVariants("av11.xml", "center", "center_horizontal", "center_vertical");
   }
 
