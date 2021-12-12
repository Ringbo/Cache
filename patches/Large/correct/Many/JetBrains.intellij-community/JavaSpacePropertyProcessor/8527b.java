diff --git a/source/com/intellij/psi/formatter/java/JavaSpacePropertyProcessor.java b/source/com/intellij/psi/formatter/java/JavaSpacePropertyProcessor.java
index edd90e0..cea6bc9 100644
--- a/source/com/intellij/psi/formatter/java/JavaSpacePropertyProcessor.java
+++ b/source/com/intellij/psi/formatter/java/JavaSpacePropertyProcessor.java
@@ -543,7 +543,7 @@
       int space = spaceBeforeLbrace ? 1 : 0;
       return createNonLFSpace(space, false, dependantRange);
     }
-    else if (braceStyle == CodeStyleSettings.END_OF_LINE) {
+    else if (braceStyle == CodeStyleSettings.END_OF_LINE || braceStyle == CodeStyleSettings.NEXT_LINE_IF_WRAPPED) {
       int space = spaceBeforeLbrace ? 1 : 0;
       return createNonLFSpace(space, false, null);
     }
