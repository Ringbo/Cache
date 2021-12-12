diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FixedValueConstantPoolTypesTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FixedValueConstantPoolTypesTest.java
index 58bda69..2b56241 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FixedValueConstantPoolTypesTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FixedValueConstantPoolTypesTest.java
@@ -86,7 +86,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(2));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        T instance = loaded.getLoaded().getConstructor().newInstance();
+        T instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(StringTarget.class)));
         assertThat(instance, instanceOf(helperClass));
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO).invoke(instance), is(fixedValue));
@@ -100,7 +100,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(2));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(fixedValue == null ? 0 : 1));
-        T instance = loaded.getLoaded().getConstructor().newInstance();
+        T instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(StringTarget.class)));
         assertThat(instance, instanceOf(helperClass));
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO).invoke(instance), is(fixedValue));
