diff --git a/src/main/javassist/CtClass.java b/src/main/javassist/CtClass.java
index 9f17aa8..8bfca0c 100644
--- a/src/main/javassist/CtClass.java
+++ b/src/main/javassist/CtClass.java
@@ -410,7 +410,7 @@
      *
      * <p>This method may return <code>null</code>.
      */
-    public Collection getRefClasses() {
+    public synchronized Collection getRefClasses() {
         ClassFile cf = getClassFile2();
         if (cf != null) {
             ClassMap cm = new ClassMap() {
