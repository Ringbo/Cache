diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/ForwardingTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/ForwardingTest.java
index 92d1357..cbd7d3d 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/ForwardingTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/ForwardingTest.java
@@ -23,7 +23,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(BAR));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
@@ -35,7 +35,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Field field = loaded.getLoaded().getDeclaredField(FOO);
         field.setAccessible(true);
         field.set(instance, new Bar());
@@ -50,7 +50,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Field field = loaded.getLoaded().getDeclaredField(FOO);
         field.setAccessible(true);
         field.set(null, new Bar());
