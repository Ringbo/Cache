diff --git a/src/test/java/com/google/devtools/build/lib/packages/BuildTypeTest.java b/src/test/java/com/google/devtools/build/lib/packages/BuildTypeTest.java
index e9f1c19..6f5012f 100644
--- a/src/test/java/com/google/devtools/build/lib/packages/BuildTypeTest.java
+++ b/src/test/java/com/google/devtools/build/lib/packages/BuildTypeTest.java
@@ -417,7 +417,7 @@
 
   private static ImmutableList<Label> collectLabels(Type<?> type, Object value)
       throws InterruptedException {
-    ImmutableList.Builder<Label> result = ImmutableList.builder();
+    final ImmutableList.Builder<Label> result = ImmutableList.builder();
     type.visitLabels(new Type.LabelVisitor() {
       @SuppressWarnings("unchecked")
       @Override
