diff --git a/src/main/groovy/lang/MetaClassImpl.java b/src/main/groovy/lang/MetaClassImpl.java
index ba2f585..1caad88 100644
--- a/src/main/groovy/lang/MetaClassImpl.java
+++ b/src/main/groovy/lang/MetaClassImpl.java
@@ -910,7 +910,7 @@
             final Closure closure = (Closure) object;
 
             final Object owner = closure.getOwner();
-            if (CLOSURE_DO_CALL_METHOD.equals(methodName)) {
+            if (CLOSURE_DO_CALL_METHOD.equals(methodName) || CLOSURE_CALL_METHOD.equals(methodName)) {
                 final Class objectClass = object.getClass();
                 if (objectClass == MethodClosure.class) {
                     final MethodClosure mc = (MethodClosure) object;
