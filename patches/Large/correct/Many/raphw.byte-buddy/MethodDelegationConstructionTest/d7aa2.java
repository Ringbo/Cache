diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationConstructionTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationConstructionTest.java
index 0f90dd8..7e31e76 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationConstructionTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationConstructionTest.java
@@ -96,7 +96,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        T instance = loaded.getLoaded().getConstructor().newInstance();
+        T instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(sourceType)));
         assertThat(instance, instanceOf(sourceType));
         Object value = loaded.getLoaded().getDeclaredMethod(FOO, parameterTypes).invoke(instance, arguments);
