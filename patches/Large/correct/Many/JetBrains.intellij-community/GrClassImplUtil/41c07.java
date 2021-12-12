diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/util/GrClassImplUtil.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/util/GrClassImplUtil.java
index c99f9fd..11dc762 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/util/GrClassImplUtil.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/util/GrClassImplUtil.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2014 JetBrains s.r.o.
+ * Copyright 2000-2015 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -645,7 +645,7 @@
     return result == null || result.booleanValue();
   }
 
-  public static void addExpandingReflectedMethods(List<PsiMethod> result, PsiMethod method) {
+  public static void addExpandingReflectedMethods(Collection<PsiMethod> result, PsiMethod method) {
     if (method instanceof GrMethod) {
       final GrReflectedMethod[] reflectedMethods = ((GrMethod)method).getReflectedMethods();
       if (reflectedMethods.length > 0) {
@@ -656,7 +656,7 @@
     result.add(method);
   }
 
-  public static void collectMethodsFromBody(@NotNull GrTypeDefinition definition, List<PsiMethod> result) {
+  public static void collectMethodsFromBody(@NotNull GrTypeDefinition definition, Collection<PsiMethod> result) {
     for (GrMethod method : definition.getCodeMethods()) {
       addExpandingReflectedMethods(result, method);
     }
