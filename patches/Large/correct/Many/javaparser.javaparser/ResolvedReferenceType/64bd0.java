diff --git a/javaparser-core/src/main/java/com/github/javaparser/resolution/types/ResolvedReferenceType.java b/javaparser-core/src/main/java/com/github/javaparser/resolution/types/ResolvedReferenceType.java
index 6e047cd..aacba04 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/resolution/types/ResolvedReferenceType.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/resolution/types/ResolvedReferenceType.java
@@ -409,5 +409,5 @@
         return typeDeclaration.getTypeParameters().stream().map((tp) -> new ResolvedTypeVariable(tp)).collect(Collectors.toList());
     }
 
-    public abstract ReferenceType deriveTypeParameters(ResolvedTypeParametersMap typeParametersMap);
+    public abstract ResolvedReferenceType deriveTypeParameters(ResolvedTypeParametersMap typeParametersMap);
 }
