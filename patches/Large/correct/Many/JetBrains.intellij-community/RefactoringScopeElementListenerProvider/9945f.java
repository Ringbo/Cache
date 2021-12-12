diff --git a/platform/lang-impl/src/com/intellij/packageDependencies/ui/RefactoringScopeElementListenerProvider.java b/platform/lang-impl/src/com/intellij/packageDependencies/ui/RefactoringScopeElementListenerProvider.java
index 20ca1fd..2b8a45d 100644
--- a/platform/lang-impl/src/com/intellij/packageDependencies/ui/RefactoringScopeElementListenerProvider.java
+++ b/platform/lang-impl/src/com/intellij/packageDependencies/ui/RefactoringScopeElementListenerProvider.java
@@ -146,7 +146,7 @@
           LOG.assertTrue(newElement instanceof PsiQualifiedNamedElement || newElement instanceof PsiDirectory);
           try {
             final NamedScope[] currentScopes = descriptor.getHolder().getEditableScopes();
-            final PatternBasedPackageSet packageSet = (PatternBasedPackageSet)currentScopes[descriptor.getIdx()].getValue();
+            final PackageSet packageSet = currentScopes[descriptor.getIdx()].getValue();
             if (packageSet == null) return;
             NamedScope newScope = new NamedScope(descriptor.getScope().getName(), PackageSetFactory.getInstance().compile(text));
             currentScopes[descriptor.getIdx()] = newScope;
