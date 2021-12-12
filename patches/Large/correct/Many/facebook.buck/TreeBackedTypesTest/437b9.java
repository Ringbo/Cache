diff --git a/test/com/facebook/buck/jvm/java/abi/source/TreeBackedTypesTest.java b/test/com/facebook/buck/jvm/java/abi/source/TreeBackedTypesTest.java
index dc3e79d..fbceef5 100644
--- a/test/com/facebook/buck/jvm/java/abi/source/TreeBackedTypesTest.java
+++ b/test/com/facebook/buck/jvm/java/abi/source/TreeBackedTypesTest.java
@@ -45,10 +45,10 @@
     compile("class Foo { }");
 
     TypeElement fooElement = elements.getTypeElement("Foo");
-    TypeMirror fooTypeMirror = types.getDeclaredType(fooElement);
+    DeclaredType fooTypeMirror = types.getDeclaredType(fooElement);
 
     assertEquals(TypeKind.DECLARED, fooTypeMirror.getKind());
-    DeclaredType fooDeclaredType = (DeclaredType) fooTypeMirror;
+    DeclaredType fooDeclaredType = fooTypeMirror;
     assertNotSame(fooElement.asType(), fooDeclaredType);
     assertSame(fooElement, fooDeclaredType.asElement());
     assertEquals(0, fooDeclaredType.getTypeArguments().size());
@@ -63,10 +63,10 @@
     compile("class Foo<T> { }");
 
     TypeElement fooElement = elements.getTypeElement("Foo");
-    TypeMirror fooTypeMirror = types.getDeclaredType(fooElement);
+    DeclaredType fooTypeMirror = types.getDeclaredType(fooElement);
 
     assertEquals(TypeKind.DECLARED, fooTypeMirror.getKind());
-    DeclaredType fooDeclaredType = (DeclaredType) fooTypeMirror;
+    DeclaredType fooDeclaredType = fooTypeMirror;
     assertNotSame(fooElement.asType(), fooDeclaredType);
     assertSame(fooElement, fooDeclaredType.asElement());
     assertEquals(0, fooDeclaredType.getTypeArguments().size());
