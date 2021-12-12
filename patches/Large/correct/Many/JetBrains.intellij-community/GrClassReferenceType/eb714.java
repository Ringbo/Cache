diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/GrClassReferenceType.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/GrClassReferenceType.java
index e8ad34d..9c3dfb3 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/GrClassReferenceType.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/lang/psi/impl/GrClassReferenceType.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2016 JetBrains s.r.o.
+ * Copyright 2000-2017 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -110,7 +110,7 @@
 
     final PsiClass clazz = resolve();
     if (clazz != null) {
-      return factory.createType(clazz, factory.createRawSubstitutor(clazz));
+      return factory.createType(clazz, factory.createRawSubstitutor(clazz), getLanguageLevel());
     }
     else {
       String qName = myReferenceElement.getClassNameText();
