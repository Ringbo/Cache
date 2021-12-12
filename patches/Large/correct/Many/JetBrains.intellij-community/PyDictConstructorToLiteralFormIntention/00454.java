diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/PyDictConstructorToLiteralFormIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/PyDictConstructorToLiteralFormIntention.java
index 61bdc7e..c3b1192 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/PyDictConstructorToLiteralFormIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/PyDictConstructorToLiteralFormIntention.java
@@ -81,8 +81,8 @@
       }
 
     }
-    PyExpressionStatement dict = elementGenerator.createFromText(LanguageLevel.forElement(expression), PyExpressionStatement.class,
-                                                "{" + stringBuilder.toString() + "}");
+    PyDictLiteralExpression dict = (PyDictLiteralExpression)elementGenerator.createFromText(LanguageLevel.forElement(expression), PyExpressionStatement.class,
+                                                "{" + stringBuilder.toString() + "}").getExpression();
     expression.replace(dict);
   }
 }
