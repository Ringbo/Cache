diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/resolve/processors/SubstitutorComputer.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/resolve/processors/SubstitutorComputer.java
index f80f2ee..6158a66 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/resolve/processors/SubstitutorComputer.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/resolve/processors/SubstitutorComputer.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2016 JetBrains s.r.o.
+ * Copyright 2000-2017 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -213,7 +213,8 @@
 
   @Nullable
   private PsiType handleConversion(@Nullable PsiType paramType, @Nullable PsiType argType) {
-    if (ClosureToSamConverter.isSamConversionAllowed(myPlace) &&
+    if (argType instanceof PsiClassType &&
+        ClosureToSamConverter.isSamConversionAllowed(myPlace) &&
         InheritanceUtil.isInheritor(argType, GroovyCommonClassNames.GROOVY_LANG_CLOSURE) &&
         !TypesUtil.isClassType(paramType, GroovyCommonClassNames.GROOVY_LANG_CLOSURE)) {
       PsiType converted = handleConversionOfSAMType(paramType, (PsiClassType)argType);
