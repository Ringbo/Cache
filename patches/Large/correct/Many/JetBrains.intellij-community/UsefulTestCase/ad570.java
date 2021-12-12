diff --git a/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java b/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
index ed040c9..c8d0db7 100644
--- a/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
+++ b/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
@@ -490,7 +490,7 @@
   }
 
   public static void assertOrderedEquals(@NotNull byte[] actual, @NotNull byte[] expected) {
-    assertEquals(actual.length, expected.length);
+    assertEquals(expected.length, actual.length);
     for (int i = 0; i < actual.length; i++) {
       byte a = actual[i];
       byte e = expected[i];
