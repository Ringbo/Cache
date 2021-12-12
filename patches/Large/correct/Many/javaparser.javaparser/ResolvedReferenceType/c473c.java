diff --git a/javaparser-core/src/main/java/com/github/javaparser/resolution/types/ResolvedReferenceType.java b/javaparser-core/src/main/java/com/github/javaparser/resolution/types/ResolvedReferenceType.java
index f7698c9..6e047cd 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/resolution/types/ResolvedReferenceType.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/resolution/types/ResolvedReferenceType.java
@@ -325,15 +325,15 @@
     // Protected methods
     //
 
-    protected abstract ReferenceType create(ResolvedReferenceTypeDeclaration typeDeclaration, List<ResolvedType> typeParameters);
+    protected abstract ResolvedReferenceType create(ResolvedReferenceTypeDeclaration typeDeclaration, List<ResolvedType> typeParameters);
 
-    protected ReferenceType create(ResolvedReferenceTypeDeclaration typeDeclaration, ResolvedTypeParametersMap typeParametersMap) {
+    protected ResolvedReferenceType create(ResolvedReferenceTypeDeclaration typeDeclaration, ResolvedTypeParametersMap typeParametersMap) {
         return create(typeDeclaration, typeDeclaration.getTypeParameters().stream()
                 .map(typeParametersMap::getValue)
                 .collect(Collectors.toList()));
     }
 
-    protected abstract ReferenceType create(ResolvedReferenceTypeDeclaration typeDeclaration);
+    protected abstract ResolvedReferenceType create(ResolvedReferenceTypeDeclaration typeDeclaration);
 
     protected boolean isCorrespondingBoxingType(String typeName) {
         switch (typeName) {
