diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/InvocationHandlerAdapterTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/InvocationHandlerAdapterTest.java
index dee50a8..e2f9d0d 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/InvocationHandlerAdapterTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/InvocationHandlerAdapterTest.java
@@ -29,7 +29,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        Bar instance = loaded.getLoaded().getConstructor().newInstance();
+        Bar instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.bar(FOO), is((Object) instance));
         assertThat(foo.methods.size(), is(1));
         assertThat(instance.bar(FOO), is((Object) instance));
@@ -45,7 +45,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        Baz instance = loaded.getLoaded().getConstructor().newInstance();
+        Baz instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.bar(BAZ), is(BAZ * 2L));
         instance.assertZeroCalls();
     }
@@ -57,7 +57,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(2));
-        Bar instance = loaded.getLoaded().getConstructor().newInstance();
+        Bar instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.bar(FOO), is((Object) instance));
         assertThat(foo.methods.size(), is(1));
         assertThat(instance.bar(FOO), is((Object) instance));
@@ -75,7 +75,7 @@
         Field field = loaded.getLoaded().getDeclaredField(QUX);
         assertThat(field.getModifiers(), is(Modifier.PUBLIC | Opcodes.ACC_SYNTHETIC));
         field.setAccessible(true);
-        Bar instance = loaded.getLoaded().getConstructor().newInstance();
+        Bar instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Foo foo = new Foo();
         field.set(instance, foo);
         assertThat(instance.bar(FOO), is((Object) instance));
@@ -95,7 +95,7 @@
         Field field = loaded.getLoaded().getDeclaredField(QUX);
         assertThat(field.getModifiers(), is(Modifier.PUBLIC | Opcodes.ACC_SYNTHETIC));
         field.setAccessible(true);
-        Bar instance = loaded.getLoaded().getConstructor().newInstance();
+        Bar instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Foo foo = new Foo();
         field.set(instance, foo);
         assertThat(instance.bar(FOO), is((Object) instance));
