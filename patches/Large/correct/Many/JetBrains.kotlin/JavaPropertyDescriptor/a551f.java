diff --git a/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaPropertyDescriptor.java b/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaPropertyDescriptor.java
index 1b15a7b..5bcfa77 100644
--- a/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaPropertyDescriptor.java
+++ b/core/descriptor.loader.java/src/org/jetbrains/kotlin/load/java/descriptors/JavaPropertyDescriptor.java
@@ -33,9 +33,10 @@
             @NotNull Visibility visibility,
             boolean isVar,
             @NotNull Name name,
-            @NotNull SourceElement source
+            @NotNull SourceElement source,
+            @Nullable PropertyDescriptor original
     ) {
-        super(containingDeclaration, null, annotations, Modality.FINAL, visibility, isVar, name, Kind.DECLARATION, source);
+        super(containingDeclaration, original, annotations, Modality.FINAL, visibility, isVar, name, Kind.DECLARATION, source);
     }
 
     @Override
@@ -56,7 +57,8 @@
                 getVisibility(),
                 isVar(),
                 getName(),
-                getSource()
+                getSource(),
+                getOriginal()
         );
         assert getGetter() == null : "Field must not have a getter: " + this;
         assert getSetter() == null : "Field must not have a setter: " + this;
