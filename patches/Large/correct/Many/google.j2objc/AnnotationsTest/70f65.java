diff --git a/jre_emul/android/platform/libcore/luni/src/test/java/libcore/java/lang/reflect/AnnotationsTest.java b/jre_emul/android/platform/libcore/luni/src/test/java/libcore/java/lang/reflect/AnnotationsTest.java
index 25aa82f..a665a7f 100644
--- a/jre_emul/android/platform/libcore/luni/src/test/java/libcore/java/lang/reflect/AnnotationsTest.java
+++ b/jre_emul/android/platform/libcore/luni/src/test/java/libcore/java/lang/reflect/AnnotationsTest.java
@@ -244,7 +244,7 @@
         assertFalse(Modifier.isPrivate(modifiers));
         assertFalse(Modifier.isAbstract(modifiers));
         assertTrue(Modifier.isStatic(modifiers));
-        assertFalse(Modifier.isFinal(modifiers));
+        assertTrue(Modifier.isFinal(modifiers));
         assertFalse(Modifier.isStrict(modifiers));
     }
 
