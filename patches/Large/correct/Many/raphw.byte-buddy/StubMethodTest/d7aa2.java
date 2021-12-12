diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/StubMethodTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/StubMethodTest.java
index 037c065..d255371 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/StubMethodTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/StubMethodTest.java
@@ -118,7 +118,7 @@
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, StubMethod.INSTANCE);
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(11));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
         assertThat(loaded.getLoaded().getDeclaredMethod(methodName, methodParameterTypes)
