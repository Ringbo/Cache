diff --git a/src/main/javassist/CtNewMethod.java b/src/main/javassist/CtNewMethod.java
index eb65b73..0a929d6 100644
--- a/src/main/javassist/CtNewMethod.java
+++ b/src/main/javassist/CtNewMethod.java
@@ -244,8 +244,9 @@
      * Creates a public setter method.  The setter method assigns the
      * value of the first parameter to the specified field
      * in the class to which this method is added.
-     * The created method is initially not static even if the field is
-     * static.  Change the modifiers if the method should be static.
+     * The created method is not static even if the field is
+     * static.  You may not change it to be static
+     * by <code>setModifiers()</code> in <code>CtBehavior</code>.
      *
      * @param methodName        the name of the setter
      * @param field             the field accessed.
@@ -269,7 +270,7 @@
                 code.addPutfield(Bytecode.THIS, fieldName, fieldType);
             }
             else {
-                code.addLoad(0, field.getType());
+                code.addLoad(1, field.getType());
                 code.addPutstatic(Bytecode.THIS, fieldName, fieldType);
             }
 
