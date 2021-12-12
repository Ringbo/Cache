diff --git a/src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java b/src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java
index 1144b6e..0977934 100644
--- a/src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java
+++ b/src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java
@@ -923,7 +923,7 @@
         if (Modifier.isProtected(fn.getModifiers()) && (samePackages || accessingNode.isDerivedFrom(declaringClass))) {
             return true;
         }
-        if (!Modifier.isPrivate(fn.getModifiers())) {
+        if (!fn.isPrivate()) {
             // package private is the only modifier left. It means  same package is allowed, subclass not, same class is
             return samePackages;
         }
@@ -973,7 +973,7 @@
                             while (outer!=null) {
                                 outerClassField = outer.getDeclaredField(name);
                                 if (outerClassField!=null && outerClassField.isStatic() && outerClassField.isFinal()) {
-                                    if (outer!=classNode.getOuterClass() && Modifier.isPrivate(outerClassField.getModifiers())) {
+                                    if (outer!=classNode.getOuterClass() && outerClassField.isPrivate()) {
                                         throw new GroovyBugError("Trying to access private constant field ["+outerClassField.getDeclaringClass()+"#"+outerClassField.getName()+"] from inner class");
                                     }
                                     PropertyExpression pexp = new PropertyExpression(
