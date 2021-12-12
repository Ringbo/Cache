diff --git a/java/java-tests/testSrc/com/intellij/projectView/NavigateFromSourceTest.java b/java/java-tests/testSrc/com/intellij/projectView/NavigateFromSourceTest.java
index 6e836aa..14d321d 100644
--- a/java/java-tests/testSrc/com/intellij/projectView/NavigateFromSourceTest.java
+++ b/java/java-tests/testSrc/com/intellij/projectView/NavigateFromSourceTest.java
@@ -101,7 +101,7 @@
 
     pane.select(psiClass, psiClass.getContainingFile().getVirtualFile(), true);
 
-    assertEquals(1, tree.getSelectionCount());
+    assertEquals(10, tree.getSelectionCount());
   }
 
   private static void changeClassTextAndTryToNavigate(final String newClassString,
