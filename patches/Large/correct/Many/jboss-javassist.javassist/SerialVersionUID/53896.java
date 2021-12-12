diff --git a/src/main/javassist/SerialVersionUID.java b/src/main/javassist/SerialVersionUID.java
index 1339af4..c1a93bb 100644
--- a/src/main/javassist/SerialVersionUID.java
+++ b/src/main/javassist/SerialVersionUID.java
@@ -70,8 +70,10 @@
     /**
      * Calculate default value. See Java Serialization Specification, Stream
      * Unique Identifiers.
+     *
+     * @since 3.20
      */
-    static long calculateDefault(CtClass clazz)
+    public static long calculateDefault(CtClass clazz)
         throws CannotCompileException
     {
         try {
