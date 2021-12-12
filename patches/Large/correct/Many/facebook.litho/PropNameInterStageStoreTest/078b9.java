diff --git a/litho-it/src/test/java/com/facebook/litho/specmodels/processor/PropNameInterStageStoreTest.java b/litho-it/src/test/java/com/facebook/litho/specmodels/processor/PropNameInterStageStoreTest.java
index e9deb91..d3ba593 100644
--- a/litho-it/src/test/java/com/facebook/litho/specmodels/processor/PropNameInterStageStoreTest.java
+++ b/litho-it/src/test/java/com/facebook/litho/specmodels/processor/PropNameInterStageStoreTest.java
@@ -68,7 +68,7 @@
 
     final MockSpecModel specModel =
         MockSpecModel.newBuilder()
-            .props(ImmutableList.of(makePropModel("param0"), makePropModel("param1")))
+            .rawProps(ImmutableList.of(makePropModel("param0"), makePropModel("param1")))
             .specTypeName(ClassName.get(MyTestSpec.class))
             .build();
     store.saveNames(specModel);
