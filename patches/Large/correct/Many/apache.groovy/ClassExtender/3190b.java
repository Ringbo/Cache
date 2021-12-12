diff --git a/src/main/java/org/codehaus/groovy/runtime/ClassExtender.java b/src/main/java/org/codehaus/groovy/runtime/ClassExtender.java
index 6e5d371..390cf9c 100644
--- a/src/main/java/org/codehaus/groovy/runtime/ClassExtender.java
+++ b/src/main/java/org/codehaus/groovy/runtime/ClassExtender.java
@@ -74,7 +74,7 @@
         if (methods == null) {
             methods = createMap();
         }
-        methods.put(name, methods);
+        methods.put(name, closure);
     }
 
     public synchronized void removeMethod(String name) {
