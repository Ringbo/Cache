diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/SuperMethodCallTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/SuperMethodCallTest.java
index c2a4ff4..7f37c8d 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/SuperMethodCallTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/SuperMethodCallTest.java
@@ -100,7 +100,7 @@
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, SuperMethodCall.INSTANCE);
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(11));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
         assertThat(loaded.getLoaded().getDeclaredMethod(methodName, methodParameterTypes)
