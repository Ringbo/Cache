diff --git a/java/java-psi-impl/src/com/intellij/psi/PsiTypeMapper.java b/java/java-psi-impl/src/com/intellij/psi/PsiTypeMapper.java
index ad93a16..a828306 100644
--- a/java/java-psi-impl/src/com/intellij/psi/PsiTypeMapper.java
+++ b/java/java-psi-impl/src/com/intellij/psi/PsiTypeMapper.java
@@ -42,7 +42,7 @@
     PsiType mappedComponent = mapType(componentType);
     if (mappedComponent == null) return null;
     if (mappedComponent == componentType) return type;
-    return new PsiArrayType(mappedComponent);
+    return new PsiArrayType(mappedComponent, type.getAnnotations());
   }
 
   @Override
@@ -51,7 +51,7 @@
     PsiType mappedComponent = mapType(componentType);
     if (mappedComponent == null) return null;
     if (mappedComponent == componentType) return type;
-    return new PsiEllipsisType(mappedComponent);
+    return new PsiEllipsisType(mappedComponent, type.getAnnotations());
   }
 
   @Override
