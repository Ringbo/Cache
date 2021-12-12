diff --git a/python/src/com/jetbrains/python/psi/PyUtil.java b/python/src/com/jetbrains/python/psi/PyUtil.java
index 21cc4dd..6332351 100644
--- a/python/src/com/jetbrains/python/psi/PyUtil.java
+++ b/python/src/com/jetbrains/python/psi/PyUtil.java
@@ -484,9 +484,9 @@
       flags.add(CLASSMETHOD);
     }
     else if (PyNames.STATICMETHOD.equals(deconame)) flags.add(STATICMETHOD);
-    // implicit classmethod __new__
+    // implicit staticmethod __new__
     PyClass cls = function.getContainingClass();
-    if (cls != null && PyNames.NEW.equals(function.getName()) && cls.isNewStyleClass()) flags.add(CLASSMETHOD);
+    if (cls != null && PyNames.NEW.equals(function.getName()) && cls.isNewStyleClass()) flags.add(STATICMETHOD);
     //
     if (!flags.contains(CLASSMETHOD) && !flags.contains(STATICMETHOD)) { // not set by decos, look for reassignment
       String func_name = function.getName();
