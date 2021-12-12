diff --git a/python/src/com/jetbrains/python/formatter/PyBlock.java b/python/src/com/jetbrains/python/formatter/PyBlock.java
index 75438a9..1bc4435 100644
--- a/python/src/com/jetbrains/python/formatter/PyBlock.java
+++ b/python/src/com/jetbrains/python/formatter/PyBlock.java
@@ -285,7 +285,7 @@
         return createSpaces(0);
       }
     }
-    if (type2 == PyElementTypes.ANNOTATION) {
+    if (parentType == PyElementTypes.FUNCTION_DECLARATION && type2 == PyElementTypes.ANNOTATION) {
       return createSpaces(1);
     }
 
