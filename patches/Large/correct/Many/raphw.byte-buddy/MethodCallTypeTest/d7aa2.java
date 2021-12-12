diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodCallTypeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodCallTypeTest.java
index c31dcd1..30ee596 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodCallTypeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodCallTypeTest.java
@@ -105,7 +105,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, Object.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(definesFieldConstantPool ? 1 : 0));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
         assertThat(instance.foo(new Object()), is(value));
@@ -119,7 +119,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, Object.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(definesFieldReference ? 1 : 0));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
         assertThat(instance.foo(new Object()), sameInstance(value));
