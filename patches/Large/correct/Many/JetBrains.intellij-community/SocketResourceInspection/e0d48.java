diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/resources/SocketResourceInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/resources/SocketResourceInspection.java
index 232f769..b7918e7 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/resources/SocketResourceInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/resources/SocketResourceInspection.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2003-2010 Dave Griffith, Bas Leijdekkers
+ * Copyright 2003-2011 Dave Griffith, Bas Leijdekkers
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -77,7 +77,8 @@
                 return;
             }
             final PsiElement parent = getExpressionParent(expression);
-            if (parent instanceof PsiReturnStatement) {
+            if (parent instanceof PsiReturnStatement ||
+                    parent instanceof PsiResourceVariable) {
                 return;
             }
             final PsiVariable boundVariable = getVariable(parent);
@@ -98,7 +99,8 @@
                 return;
             }
             final PsiElement parent = getExpressionParent(expression);
-            if (parent instanceof PsiReturnStatement) {
+            if (parent instanceof PsiReturnStatement ||
+                    parent instanceof PsiResourceVariable) {
                 return;
             }
             final PsiVariable boundVariable = getVariable(parent);
