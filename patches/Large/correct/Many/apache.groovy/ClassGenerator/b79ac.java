diff --git a/src/main/org/codehaus/groovy/classgen/ClassGenerator.java b/src/main/org/codehaus/groovy/classgen/ClassGenerator.java
index 99cf9db..0871fe4 100644
--- a/src/main/org/codehaus/groovy/classgen/ClassGenerator.java
+++ b/src/main/org/codehaus/groovy/classgen/ClassGenerator.java
@@ -848,7 +848,7 @@
             }
             else {
                 if (isValidTypeForCast(returnType) && !returnType.equals(c.getName())) {
-                    doCast(returnType);
+                    doConvertAndCast(returnType);
                 }
                 cv.visitInsn(ARETURN);
             }
