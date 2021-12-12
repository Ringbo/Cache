diff --git a/src/main/org/codehaus/groovy/classgen/InnerClassVisitor.java b/src/main/org/codehaus/groovy/classgen/InnerClassVisitor.java
index bbb97cd..673de5e 100644
--- a/src/main/org/codehaus/groovy/classgen/InnerClassVisitor.java
+++ b/src/main/org/codehaus/groovy/classgen/InnerClassVisitor.java
@@ -70,7 +70,7 @@
             if (innerClass.getVariableScope() == null &&
                     innerClass.getDeclaredConstructors().isEmpty()) {
                 // add dummy constructor
-                innerClass.addConstructor(PUBLIC_SYNTHETIC, new Parameter[0], null, null);
+                innerClass.addConstructor(ACC_PUBLIC, new Parameter[0], null, null);
             }
         }
 
