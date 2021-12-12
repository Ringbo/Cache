diff --git a/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceServiceImpl.java b/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceServiceImpl.java
index 6775740..e23f8d0 100644
--- a/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceServiceImpl.java
+++ b/java/compiler/impl/src/com/intellij/compiler/backwardRefs/CompilerReferenceServiceImpl.java
@@ -292,7 +292,7 @@
     LanguageLightRefAdapter adapter = null;
     if (isConstructorSuggestion) {
       adapter = ReadAction.compute(() -> LanguageLightRefAdapter.findAdapter(element));
-      if (!adapter.isClass(element)) {
+      if (adapter == null || !adapter.isClass(element)) {
         return null;
       }
     }
