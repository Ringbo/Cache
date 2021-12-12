diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/reference/RefClassImpl.java b/java/java-analysis-impl/src/com/intellij/codeInspection/reference/RefClassImpl.java
index a4815c6..e0da208 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/reference/RefClassImpl.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/reference/RefClassImpl.java
@@ -73,7 +73,7 @@
       if (parent instanceof UMethod || parent instanceof UClass || parent instanceof UField) {
         break;
       }
-      parent = UDeclarationKt.getContainingDeclaration(uClass);
+      parent = UDeclarationKt.getContainingDeclaration(parent);
     }
     if (parent != null) {
       RefElement refParent = getRefManager().getReference(parent.getSourcePsi());
@@ -108,7 +108,7 @@
     setAbstract(javaPsi.hasModifier(JvmModifier.ABSTRACT));
     setAnonymous(uClass.getName() == null);
 
-    setIsLocal(!(isAnonymous() || parent instanceof UClass || parent instanceof UFile));
+    setIsLocal(!isAnonymous() && parent != null && !(parent instanceof UClass));
 
     setInterface(uClass.isInterface());
 
