diff --git a/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideFragmentBuilder.java b/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideFragmentBuilder.java
index ed7b194..a6ed08b 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideFragmentBuilder.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideFragmentBuilder.java
@@ -69,7 +69,7 @@
       processEquals(fragment.getStartLine1() - 1, fragment.getStartLine2() - 1);
       processChanged(fragment);
     }
-    processEquals(getLineCount(myDocument1) - 1, getLineCount(myDocument1) - 2);
+    processEquals(getLineCount(myDocument1) - 1, getLineCount(myDocument2) - 1);
   }
 
   private void processEquals(int endLine1, int endLine2) {
