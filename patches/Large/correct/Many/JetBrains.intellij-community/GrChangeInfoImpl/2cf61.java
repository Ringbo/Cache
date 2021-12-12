diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/changeSignature/GrChangeInfoImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/changeSignature/GrChangeInfoImpl.java
index 2508abb..905b384 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/changeSignature/GrChangeInfoImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/changeSignature/GrChangeInfoImpl.java
@@ -184,7 +184,7 @@
       myExceptionSetChanged = false;
       for (int i = 0; i < myThrownExceptions.length; i++) {
         ThrownExceptionInfo info = myThrownExceptions[i];
-        if (info.getOldIndex() < 0) {
+        if (info.getOldIndex() < 0 || !thrownTypes[info.getOldIndex()].equals(info.createType(method, method.getManager()))) {
           myExceptionSetChanged = true;
           myExceptionSetOrOrderChanged = true;
           break;
