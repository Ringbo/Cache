diff --git a/python/src/com/jetbrains/python/inspections/PyMethodMayBeStaticInspection.java b/python/src/com/jetbrains/python/inspections/PyMethodMayBeStaticInspection.java
index d488216..f1a044a 100644
--- a/python/src/com/jetbrains/python/inspections/PyMethodMayBeStaticInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyMethodMayBeStaticInspection.java
@@ -57,7 +57,8 @@
       if (decoratorList != null) {
         for (PyDecorator decorator : decoratorList.getDecorators()) {
           final String decoratorName = decorator.getName();
-          if (PyNames.STATICMETHOD.equals(decoratorName) || PyNames.CLASSMETHOD.equals(decoratorName)) {
+          if (PyNames.STATICMETHOD.equals(decoratorName) || PyNames.CLASSMETHOD.equals(decoratorName) ||
+              PyNames.ABSTRACTMETHOD.equals(decoratorName)) {
             return;
           }
           final Property property = containingClass.findPropertyByCallable(node);
