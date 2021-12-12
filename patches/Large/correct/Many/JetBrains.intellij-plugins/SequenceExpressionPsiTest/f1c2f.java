diff --git a/struts2/ognl/src-test/com/intellij/lang/ognl/psi/SequenceExpressionPsiTest.java b/struts2/ognl/src-test/com/intellij/lang/ognl/psi/SequenceExpressionPsiTest.java
index de6b66d..e0ffe29 100644
--- a/struts2/ognl/src-test/com/intellij/lang/ognl/psi/SequenceExpressionPsiTest.java
+++ b/struts2/ognl/src-test/com/intellij/lang/ognl/psi/SequenceExpressionPsiTest.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2013 The authors
+ * Copyright 2014 The authors
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
@@ -52,7 +52,7 @@
     final OgnlConditionalExpression expression =
       (OgnlConditionalExpression)parseSingleExpression("a == true ? { 1,2 } : { 2,3 }");
     assertElementType(OgnlTypes.SEQUENCE_EXPRESSION, expression.getThen());
-    assertElementType(OgnlTypes.SEQUENCE_EXPRESSION, expression.getThen());
+    assertElementType(OgnlTypes.SEQUENCE_EXPRESSION, expression.getElse());
   }
 
   private OgnlSequenceExpression parse(@Language(value = OgnlLanguage.ID,
