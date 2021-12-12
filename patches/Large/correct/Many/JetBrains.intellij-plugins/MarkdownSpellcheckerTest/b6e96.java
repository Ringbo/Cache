diff --git a/markdown/test/src/org/intellij/plugins/markdown/spellchecking/MarkdownSpellcheckerTest.java b/markdown/test/src/org/intellij/plugins/markdown/spellchecking/MarkdownSpellcheckerTest.java
index 0fa778c..1bbf464 100644
--- a/markdown/test/src/org/intellij/plugins/markdown/spellchecking/MarkdownSpellcheckerTest.java
+++ b/markdown/test/src/org/intellij/plugins/markdown/spellchecking/MarkdownSpellcheckerTest.java
@@ -13,7 +13,7 @@
   }
 
   public void testAll() {
-    myFixture.testHighlighting(false, false, true, getTestName(false) + ".md");
+    myFixture.testHighlighting(false, false, true, getTestName(true) + ".md");
   }
 
   @Override
