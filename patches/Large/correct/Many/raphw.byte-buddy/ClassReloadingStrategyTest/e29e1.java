diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassReloadingStrategyTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassReloadingStrategyTest.java
index a121102..c27249c 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassReloadingStrategyTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassReloadingStrategyTest.java
@@ -201,7 +201,9 @@
         Class<?> factory = classLoader.loadClass(LAMBDA_SAMPLE_FACTORY);
         @SuppressWarnings("unchecked")
         Callable<String> instance = (Callable<String>) factory.getDeclaredMethod("nonCapturing").invoke(factory.newInstance());
-        ClassReloadingStrategy classReloadingStrategy = ClassReloadingStrategy.of(instrumentation).preregistered(instance.getClass());
+        // Anonymous types can only be reset to their original format, if a retransformation is applied.
+        ClassReloadingStrategy classReloadingStrategy = new ClassReloadingStrategy(instrumentation, ClassReloadingStrategy.Engine.RETRANSFORMATION)
+                .preregistered(instance.getClass());
         ClassFileLocator classFileLocator = ClassFileLocator.AgentBased.of(instrumentation, instance.getClass());
         try {
             assertThat(instance.call(), is(FOO));
@@ -221,9 +223,9 @@
     @Test
     public void testResetEmptyNoEffectImplicitLocator() throws Exception {
         Instrumentation instrumentation = mock(Instrumentation.class);
-        when(instrumentation.isRetransformClassesSupported()).thenReturn(true);
+        when(instrumentation.isRedefineClassesSupported()).thenReturn(true);
         ClassReloadingStrategy.of(instrumentation).reset();
-        verify(instrumentation, times(2)).isRetransformClassesSupported();
+        verify(instrumentation, times(2)).isRedefineClassesSupported();
         verifyNoMoreInteractions(instrumentation);
     }
 
@@ -231,9 +233,9 @@
     public void testResetEmptyNoEffect() throws Exception {
         Instrumentation instrumentation = mock(Instrumentation.class);
         ClassFileLocator classFileLocator = mock(ClassFileLocator.class);
-        when(instrumentation.isRetransformClassesSupported()).thenReturn(true);
+        when(instrumentation.isRedefineClassesSupported()).thenReturn(true);
         ClassReloadingStrategy.of(instrumentation).reset(classFileLocator);
-        verify(instrumentation, times(2)).isRetransformClassesSupported();
+        verify(instrumentation, times(2)).isRedefineClassesSupported();
         verifyNoMoreInteractions(instrumentation);
         verifyZeroInteractions(classFileLocator);
     }
