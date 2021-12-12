diff --git a/src/main/groovy/lang/ExpandoMetaClass.java b/src/main/groovy/lang/ExpandoMetaClass.java
index a633088..cf12718 100644
--- a/src/main/groovy/lang/ExpandoMetaClass.java
+++ b/src/main/groovy/lang/ExpandoMetaClass.java
@@ -202,7 +202,8 @@
 
               if (method.getParameterTypes().length == 1 && !method.getParameterTypes()[0].isPrimitive) {
                   MetaMethod noParam = pickMethod(methodName, new Class[0]);
-                  if (noParam == null) {
+                  // if the current call itself is with empty arg class array, no need to recurse with 'new Class[0]'
+                  if (noParam == null && arguments.length != 0) {
                       findMixinMethod(methodName, new Class [0]);
                   }
               }
