diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/PyDictLiteralFormToConstructorIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/PyDictLiteralFormToConstructorIntention.java
index b436393..e32388f 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/PyDictLiteralFormToConstructorIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/PyDictLiteralFormToConstructorIntention.java
@@ -126,8 +126,8 @@
       }
     }
     stringBuilder.append(")");
-    PyStatement callExpression = elementGenerator.createFromText(LanguageLevel.forElement(dictExpression),
-                                                     PyStatement.class, stringBuilder.toString());
+    PyCallExpression callExpression = (PyCallExpression)elementGenerator.createFromText(LanguageLevel.forElement(dictExpression),
+                                                     PyExpressionStatement.class, stringBuilder.toString()).getExpression();
     dictExpression.replace(callExpression);
   }
 }
