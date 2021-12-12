diff --git a/modules/cpr/src/main/java/org/atmosphere/config/managed/Invoker.java b/modules/cpr/src/main/java/org/atmosphere/config/managed/Invoker.java
index 5e3645b..f6677a0 100644
--- a/modules/cpr/src/main/java/org/atmosphere/config/managed/Invoker.java
+++ b/modules/cpr/src/main/java/org/atmosphere/config/managed/Invoker.java
@@ -44,7 +44,7 @@
 
     public static Object invokeMethod(Method method, Object objectToInvoke, Object decodedObject) {
         Object objectToEncode = null;
-        boolean hasMatch = true;
+        boolean hasMatch = false;
         try {
             objectToEncode = method.invoke(objectToInvoke, new Object[]{decodedObject});
             hasMatch = true;
