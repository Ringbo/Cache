diff --git a/compiler/src/org.graalvm.compiler.replacements.test.jdk9/src/org/graalvm/compiler/replacements/jdk9/UnsafeReplacementsTest.java b/compiler/src/org.graalvm.compiler.replacements.test.jdk9/src/org/graalvm/compiler/replacements/jdk9/UnsafeReplacementsTest.java
index 288538d..5481f4d 100644
--- a/compiler/src/org.graalvm.compiler.replacements.test.jdk9/src/org/graalvm/compiler/replacements/jdk9/UnsafeReplacementsTest.java
+++ b/compiler/src/org.graalvm.compiler.replacements.test.jdk9/src/org/graalvm/compiler/replacements/jdk9/UnsafeReplacementsTest.java
@@ -84,7 +84,7 @@
 
     public static boolean unsafeCompareAndSetByte() {
         Container container = new Container();
-        return unsafe.compareAndSetByte(container, booleanOffset, (byte) 17, (byte) 121);
+        return unsafe.compareAndSetByte(container, byteOffset, (byte) 17, (byte) 121);
     }
 
     public static boolean unsafeCompareAndSetChar() {
@@ -165,7 +165,7 @@
 
     public static Object unsafeCompareAndExchangeObject() {
         Container container = new Container();
-        return unsafe.compareAndExchangeObject(container, doubleOffset, container, dummyValue);
+        return unsafe.compareAndExchangeObject(container, objectOffset, container, dummyValue);
     }
 
     @Test
