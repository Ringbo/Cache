diff --git a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
index 64a4f5f..a083c78 100644
--- a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
+++ b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
@@ -1390,9 +1390,9 @@
       final JSType numberType = JSNamedType.createType(NUMBER_CLASS_NAME, JSTypeSourceFactory.createTypeSource(lOperand, true),
                                                        JSContext.INSTANCE);
       myTypeChecker.checkExpressionIsAssignableToType(lOperand, numberType,
-                                                      "javascript.expression.type.implicitly.coerced.to.unrelated.type", null);
+                                                      "javascript.expression.type.implicitly.coerced.to.unrelated.type", null, false);
       myTypeChecker.checkExpressionIsAssignableToType(rOperand, numberType,
-                                                      "javascript.expression.type.implicitly.coerced.to.unrelated.type", null);
+                                                      "javascript.expression.type.implicitly.coerced.to.unrelated.type", null, false);
     }
   }
 
@@ -1454,7 +1454,7 @@
         arguments[0],
         BOOLEAN_CLASS_NAME,
         "javascript.argument.type.mismatch",
-        null);
+        null, false);
     }
   }
 
