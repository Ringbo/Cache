diff --git a/src/main/org/codehaus/groovy/runtime/MetaClassHelper.java b/src/main/org/codehaus/groovy/runtime/MetaClassHelper.java
index cbd360d..aba2584 100644
--- a/src/main/org/codehaus/groovy/runtime/MetaClassHelper.java
+++ b/src/main/org/codehaus/groovy/runtime/MetaClassHelper.java
@@ -278,12 +278,12 @@
     }
     
     private static int getMaximumInterfaceDistance(Class c, Class interfaceClass) {
-        if (c==interfaceClass) return 0;
+        if (c==null || c==interfaceClass) return 0;
         Class[] interfaces = c.getInterfaces();
         int max = 0;
         for (int i=0; i<interfaces.length; i++) {
             int sub = 0;
-            if (interfaces[i].isAssignableFrom(c)) {
+            if (interfaces[i].isAssignableFrom(interfaceClass)) {
                 sub = 1+ getMaximumInterfaceDistance(interfaces[i],interfaceClass);
             }
             max = Math.max(max,sub);
