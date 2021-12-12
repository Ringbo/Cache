diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/GrFieldImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/GrFieldImpl.java
index 63327d3..ca6f792 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/GrFieldImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/statements/GrFieldImpl.java
@@ -136,7 +136,7 @@
     if (clazz == null) return false;
     if (clazz.isInterface()) return false;
     final GrModifierList modifierList = getModifierList();
-    if (GroovyPropertyUtils.isPropertyName(getName())) return false;
+    if (!GroovyPropertyUtils.isPropertyName(getName())) return false;
     return modifierList == null || !modifierList.hasExplicitVisibilityModifiers();
   }
 
