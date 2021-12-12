diff --git a/plugins/structuralsearch/testSource/com/intellij/structuralsearch/StructuralSearchTest.java b/plugins/structuralsearch/testSource/com/intellij/structuralsearch/StructuralSearchTest.java
index c4dae6e..2365d52 100644
--- a/plugins/structuralsearch/testSource/com/intellij/structuralsearch/StructuralSearchTest.java
+++ b/plugins/structuralsearch/testSource/com/intellij/structuralsearch/StructuralSearchTest.java
@@ -1582,7 +1582,7 @@
       4
     );
 
-    if (IdeaTestUtil.bombExplodes(2006, Calendar.SEPTEMBER, 5, 15, 0, "maxim.mossienko", "next token after tag correctly becomes " +
+    if (IdeaTestUtil.bombExplodes(2006, Calendar.SEPTEMBER, 15, 15, 0, "maxim.mossienko", "next token after tag correctly becomes " +
                                                                                          "a tag parameter even if located on next line." +
                                                                                          "Leading asterisks should not be counted as well.")) {
       assertEquals(
