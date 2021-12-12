diff --git a/src/test/java/com/google/devtools/build/lib/syntax/TypeTest.java b/src/test/java/com/google/devtools/build/lib/syntax/TypeTest.java
index 276c6dc..a5a850e 100644
--- a/src/test/java/com/google/devtools/build/lib/syntax/TypeTest.java
+++ b/src/test/java/com/google/devtools/build/lib/syntax/TypeTest.java
@@ -489,7 +489,7 @@
 
   private static ImmutableList<Label> collectLabels(Type<?> type, Object value)
       throws InterruptedException {
-    ImmutableList.Builder<Label> result = ImmutableList.builder();
+    final ImmutableList.Builder<Label> result = ImmutableList.builder();
     type.visitLabels(new Type.LabelVisitor() {
       @SuppressWarnings("unchecked")
       @Override
