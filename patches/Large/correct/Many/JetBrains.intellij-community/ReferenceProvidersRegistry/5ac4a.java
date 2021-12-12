diff --git a/source/com/intellij/psi/impl/source/resolve/reference/ReferenceProvidersRegistry.java b/source/com/intellij/psi/impl/source/resolve/reference/ReferenceProvidersRegistry.java
index 0b2170a..65e0a4c 100644
--- a/source/com/intellij/psi/impl/source/resolve/reference/ReferenceProvidersRegistry.java
+++ b/source/com/intellij/psi/impl/source/resolve/reference/ReferenceProvidersRegistry.java
@@ -348,7 +348,7 @@
     registerXmlAttributeValueReferenceProvider(attributeNames, elementFilter, true, provider);
   }
 
-  public @NotNull PsiReferenceProvider getProviderByType(@NotNull ReferenceProviderType type) {
+  public @Nullable PsiReferenceProvider getProviderByType(@NotNull ReferenceProviderType type) {
     return myReferenceTypeToProviderMap.get(type);
   }
 
