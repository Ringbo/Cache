diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
index fd607e4..f322319 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/DescriptorResolver.java
@@ -725,7 +725,7 @@
                     ErrorUtils.createErrorType(name.asString()));
         }
         else if (!languageFeatureSettings.supportsFeature(LanguageFeature.TypeAliases)) {
-            typeResolver.resolveAbbreviatedType(scopeWithTypeParameters, typeReference, trace, true);
+            typeResolver.resolveAbbreviatedType(scopeWithTypeParameters, typeReference, trace);
             PsiElement typeAliasKeyword = typeAlias.getTypeAliasKeyword();
             trace.report(UNSUPPORTED_TYPEALIAS.on(typeAliasKeyword != null ? typeAliasKeyword : typeAlias));
             typeAliasDescriptor.initialize(
@@ -739,14 +739,13 @@
                     storageManager.createLazyValue(new Function0<SimpleType>() {
                         @Override
                         public SimpleType invoke() {
-                            return typeResolver.resolveAbbreviatedType(scopeWithTypeParameters, typeReference, trace, true);
+                            return typeResolver.resolveAbbreviatedType(scopeWithTypeParameters, typeReference, trace);
                         }
                     }),
                     storageManager.createLazyValue(new Function0<SimpleType>() {
                         @Override
                         public SimpleType invoke() {
-                            // TODO do not reparse
-                            return typeResolver.resolveAbbreviatedType(scopeWithTypeParameters, typeReference, trace, false);
+                            return typeResolver.resolveExpandedTypeForTypeAlias(typeAliasDescriptor);
                         }
                     }));
         }
