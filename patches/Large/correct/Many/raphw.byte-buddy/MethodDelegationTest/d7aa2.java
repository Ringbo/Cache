diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationTest.java
index 436532a..539ed78 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationTest.java
@@ -97,7 +97,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        T instance = loaded.getLoaded().getConstructor().newInstance();
+        T instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(sourceType)));
         assertThat(instance, instanceOf(sourceType));
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, parameterTypes).invoke(instance, arguments), (Matcher) matcher);
@@ -107,11 +107,11 @@
     @Test
     @SuppressWarnings("unchecked")
     public void testStaticFieldBinding() throws Exception {
-        DynamicType.Loaded<T> loaded = implement(sourceType, MethodDelegation.to(targetType.getConstructor().newInstance()).filter(isDeclaredBy(targetType)));
+        DynamicType.Loaded<T> loaded = implement(sourceType, MethodDelegation.to(targetType.getDeclaredConstructor().newInstance()).filter(isDeclaredBy(targetType)));
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        T instance = loaded.getLoaded().getConstructor().newInstance();
+        T instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(sourceType)));
         assertThat(instance, instanceOf(sourceType));
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, parameterTypes).invoke(instance, arguments), (Matcher) matcher);
@@ -125,12 +125,12 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        T instance = loaded.getLoaded().getConstructor().newInstance();
+        T instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Field field = loaded.getLoaded().getDeclaredField(FIELD_NAME);
         assertThat(field.getModifiers(), is(Modifier.PUBLIC));
         assertThat(field.getType(), CoreMatchers.<Class<?>>is(targetType));
         field.setAccessible(true);
-        field.set(instance, targetType.getConstructor().newInstance());
+        field.set(instance, targetType.getDeclaredConstructor().newInstance());
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(sourceType)));
         assertThat(instance, instanceOf(sourceType));
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, parameterTypes).invoke(instance, arguments), (Matcher) matcher);
