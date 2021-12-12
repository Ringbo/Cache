diff --git a/compiler/backend/src/org/jetbrains/jet/codegen/state/JetTypeMapperWithOutDirectory.java b/compiler/backend/src/org/jetbrains/jet/codegen/state/JetTypeMapperWithOutDirectory.java
index c040a62..311e320 100644
--- a/compiler/backend/src/org/jetbrains/jet/codegen/state/JetTypeMapperWithOutDirectory.java
+++ b/compiler/backend/src/org/jetbrains/jet/codegen/state/JetTypeMapperWithOutDirectory.java
@@ -32,7 +32,7 @@
     public JetTypeMapperWithOutDirectory(
             @NotNull BindingContext bindingContext,
             @NotNull ClassBuilderMode classBuilderMode,
-            @NotNull File outDirectory
+            @Nullable File outDirectory
     ) {
         super(bindingContext, classBuilderMode);
         this.outDirectory = outDirectory;
