diff --git a/src/main/org/codehaus/groovy/runtime/ConversionHandler.java b/src/main/org/codehaus/groovy/runtime/ConversionHandler.java
index 8bcbc7f..dc5357a 100644
--- a/src/main/org/codehaus/groovy/runtime/ConversionHandler.java
+++ b/src/main/org/codehaus/groovy/runtime/ConversionHandler.java
@@ -70,7 +70,7 @@
      */
     public Object invoke(Object proxy, Method method, Object[] args)
     throws Throwable {
-        if(!isObjectMethod(method)){
+        if(!isObjectMethod(method) || method.getName().equals("toString")){
             return invokeCustom(proxy,method,args);
         }
         try {
