diff --git a/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java b/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
index 02bf685..1fa08c5 100644
--- a/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
+++ b/plugins/android/testSrc/org/jetbrains/android/dom/AndroidLayoutDomTest.java
@@ -145,7 +145,7 @@
   }
 
   public void testLayoutAttributeValuesCompletion() throws Throwable {
-    doTestCompletionVariants("av10.xml", "fill_parent", "wrap_content", "@android:");
+    doTestCompletionVariants("av10.xml", "fill_parent", "match_parent", "wrap_content", "@android:");
     doTestCompletionVariants("av11.xml", "center", "center_horizontal", "center_vertical");
   }
 
