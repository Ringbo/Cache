diff --git a/src/main/javassist/util/proxy/RuntimeSupport.java b/src/main/javassist/util/proxy/RuntimeSupport.java
index 3971e39..48cacec 100644
--- a/src/main/javassist/util/proxy/RuntimeSupport.java
+++ b/src/main/javassist/util/proxy/RuntimeSupport.java
@@ -50,7 +50,10 @@
                                     String thisMethod, int index,
                                     String desc, java.lang.reflect.Method[] methods)
     {
-        if (methods[index] == null) {
+        /* Once methods[index] and methods[index + 1] are set to non-null, 
+         * then their values never change.
+         */
+        if (methods[index] == null || methods[index + 1] == null) {
             Method m1 = thisMethod == null ? null
                                            : findMethod(self, thisMethod, desc);
             Method m0 = findSuperMethod(self, superMethod, desc);
