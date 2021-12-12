diff --git a/modules/tools/src/main/java/org/apache/ignite/tools/classgen/ClassesGenerator.java b/modules/tools/src/main/java/org/apache/ignite/tools/classgen/ClassesGenerator.java
index 03e0384..ba0aab9 100644
--- a/modules/tools/src/main/java/org/apache/ignite/tools/classgen/ClassesGenerator.java
+++ b/modules/tools/src/main/java/org/apache/ignite/tools/classgen/ClassesGenerator.java
@@ -186,7 +186,8 @@
             Class<?> cls = Class.forName(clsName, false, ldr);
 
             if (Serializable.class.isAssignableFrom(cls) && !AbstractQueuedSynchronizer.class.isAssignableFrom(cls)) {
-                if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers()) && !cls.isEnum()) {
+                if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers()) && !cls.isEnum() &&
+                    !cls.getSimpleName().isEmpty()) {
                     try {
                         Field field = cls.getDeclaredField("serialVersionUID");
 
