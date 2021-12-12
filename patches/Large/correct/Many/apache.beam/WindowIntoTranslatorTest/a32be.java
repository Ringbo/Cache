diff --git a/runners/core-construction-java/src/test/java/org/apache/beam/runners/core/construction/WindowIntoTranslatorTest.java b/runners/core-construction-java/src/test/java/org/apache/beam/runners/core/construction/WindowIntoTranslatorTest.java
index fbac565..eaefe2e 100644
--- a/runners/core-construction-java/src/test/java/org/apache/beam/runners/core/construction/WindowIntoTranslatorTest.java
+++ b/runners/core-construction-java/src/test/java/org/apache/beam/runners/core/construction/WindowIntoTranslatorTest.java
@@ -84,7 +84,8 @@
           public void visitPrimitiveTransform(Node node) {
             if (node.getTransform() instanceof Window.Assign) {
               checkState(assign.get() == null);
-              assign.set((AppliedPTransform<?, ?, Assign<?>>) node.toAppliedPTransform());
+              assign.set(
+                  (AppliedPTransform<?, ?, Assign<?>>) node.toAppliedPTransform(getPipeline()));
             }
           }
         });
