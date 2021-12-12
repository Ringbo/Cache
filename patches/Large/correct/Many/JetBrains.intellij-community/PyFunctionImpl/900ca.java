diff --git a/python/src/com/jetbrains/python/psi/impl/PyFunctionImpl.java b/python/src/com/jetbrains/python/psi/impl/PyFunctionImpl.java
index 0df1112..7578ab1 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyFunctionImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyFunctionImpl.java
@@ -695,7 +695,7 @@
 
     return languageLevel.isAtLeast(LanguageLevel.PYTHON35) && (
       functionName == null ||
-      ArrayUtil.contains(functionName, PyNames.AITER, PyNames.ANEXT, PyNames.AENTER, PyNames.AEXIT) ||
+      ArrayUtil.contains(functionName, PyNames.AITER, PyNames.ANEXT, PyNames.AENTER, PyNames.AEXIT, PyNames.CALL) ||
       !PyNames.getBuiltinMethods(languageLevel).containsKey(functionName)
     );
   }
