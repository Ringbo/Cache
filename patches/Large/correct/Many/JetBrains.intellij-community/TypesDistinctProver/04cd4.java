diff --git a/java/java-psi-api/src/com/intellij/psi/util/TypesDistinctProver.java b/java/java-psi-api/src/com/intellij/psi/util/TypesDistinctProver.java
index 5a4ccb1..a28c458 100644
--- a/java/java-psi-api/src/com/intellij/psi/util/TypesDistinctProver.java
+++ b/java/java-psi-api/src/com/intellij/psi/util/TypesDistinctProver.java
@@ -85,7 +85,7 @@
         }
 
         final PsiType bound = ((PsiWildcardType)type1).getBound();
-        return bound != null && !bound.equals(psiClass2);
+        return bound != null && !bound.equals(type2);
       }
       
       if (type2 instanceof PsiArrayType) {
