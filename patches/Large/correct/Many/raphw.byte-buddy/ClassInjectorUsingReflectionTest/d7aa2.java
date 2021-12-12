diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassInjectorUsingReflectionTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassInjectorUsingReflectionTest.java
index f87f3a4..5d8028c 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassInjectorUsingReflectionTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/loading/ClassInjectorUsingReflectionTest.java
@@ -79,7 +79,7 @@
                 .intercept(MethodDelegation.to(Interceptor.class)).make()
                 .load(classLoader, ClassLoadingStrategy.Default.INJECTION)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(BAR, String.class).invoke(type.getConstructor().newInstance(), FOO), is((Object) BAR));
+        assertThat(type.getDeclaredMethod(BAR, String.class).invoke(type.getDeclaredConstructor().newInstance(), FOO), is((Object) BAR));
     }
 
     @Test
