diff --git a/src/com/google/javascript/jscomp/TypeCheck.java b/src/com/google/javascript/jscomp/TypeCheck.java
index 49b74b5..02a1099 100644
--- a/src/com/google/javascript/jscomp/TypeCheck.java
+++ b/src/com/google/javascript/jscomp/TypeCheck.java
@@ -1245,7 +1245,8 @@
             interfaceHasProperty;
         if (reportMissingOverride.isOn()
             && !declaredOverride
-            && interfaceHasProperty) {
+            && interfaceHasProperty
+            && !"__proto__".equals(propertyName)) {
           // @override not present, but the property does override an interface
           // property
           compiler.report(t.makeError(n, reportMissingOverride,
@@ -1271,7 +1272,8 @@
     if (reportMissingOverride.isOn()
         && !declaredOverride
         && superClassHasDeclaredProperty
-        && declaredLocally) {
+        && declaredLocally
+        && !"__proto__".equals(propertyName)) {
       // @override not present, but the property does override a superclass
       // property
       compiler.report(t.makeError(n, reportMissingOverride,
