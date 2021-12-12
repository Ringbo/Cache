diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/MutableClassDescriptor.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/MutableClassDescriptor.java
index c090824..67d6e21 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/MutableClassDescriptor.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/MutableClassDescriptor.java
@@ -154,7 +154,7 @@
         this.typeConstructor = TypeConstructorImpl.createForClass(
                 this,
                 Annotations.Companion.getEMPTY(),
-                ModalityKt.isFinal(this),
+                ModalityKt.isFinalClass(this),
                 getName().asString(),
                 typeParameters,
                 supertypes
