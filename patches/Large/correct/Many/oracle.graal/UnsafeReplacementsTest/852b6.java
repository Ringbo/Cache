diff --git a/compiler/src/org.graalvm.compiler.replacements.jdk9.test/src/org/graalvm/compiler/replacements/jdk9/UnsafeReplacementsTest.java b/compiler/src/org.graalvm.compiler.replacements.jdk9.test/src/org/graalvm/compiler/replacements/jdk9/UnsafeReplacementsTest.java
index bb09d14..041ca10 100644
--- a/compiler/src/org.graalvm.compiler.replacements.jdk9.test/src/org/graalvm/compiler/replacements/jdk9/UnsafeReplacementsTest.java
+++ b/compiler/src/org.graalvm.compiler.replacements.jdk9.test/src/org/graalvm/compiler/replacements/jdk9/UnsafeReplacementsTest.java
@@ -353,13 +353,13 @@
 
         static final long STATIC_V_OFFSET;
 
-        static int ARRAY_OFFSET;
+        static final int ARRAY_OFFSET;
 
-        static int ARRAY_SHIFT;
+        static final int ARRAY_SHIFT;
 
         static {
             try {
-                Field staticVField = UnsafeReplacementsTest.JdkInternalMiscUnsafeAccessTestBoolean.class.getDeclaredField("static_v");
+                Field staticVField = UnsafeReplacementsTest.JdkInternalMiscUnsafeAccessTestBoolean.class.getDeclaredField("staticV");
                 STATIC_V_BASE = unsafe.staticFieldBase(staticVField);
                 STATIC_V_OFFSET = unsafe.staticFieldOffset(staticVField);
             } catch (Exception e) {
@@ -378,7 +378,7 @@
             ARRAY_SHIFT = 31 - Integer.numberOfLeadingZeros(ascale);
         }
 
-        static boolean static_v;
+        static boolean staticV;
 
         boolean v;
 
@@ -411,6 +411,7 @@
             }
         }
 
+        // Checkstyle: stop
         @BytecodeParserForceInline
         public static void testAccess(Object base, long offset) {
             // Advanced compare
@@ -507,5 +508,6 @@
             }
 
         }
+        // Checkstyle: resume
     }
 }
