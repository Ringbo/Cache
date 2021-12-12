diff --git a/src/main/org/codehaus/groovy/classgen/ClassGenerator.java b/src/main/org/codehaus/groovy/classgen/ClassGenerator.java
index 0d288fc..6129002 100644
--- a/src/main/org/codehaus/groovy/classgen/ClassGenerator.java
+++ b/src/main/org/codehaus/groovy/classgen/ClassGenerator.java
@@ -598,7 +598,8 @@
 
         // rest of code goes here...
 
-        final String exceptionTypeInternalName = (catchStatement != null) ? getTypeDescription(exceptionType) : null;
+        //final String exceptionTypeInternalName = (catchStatement != null) ? getTypeDescription(exceptionType) : null;
+        final String exceptionTypeInternalName = (catchStatement != null) ? getClassInternalName(exceptionType) : null;
 
         exceptionBlocks.add(new Runnable() {
             public void run() {
