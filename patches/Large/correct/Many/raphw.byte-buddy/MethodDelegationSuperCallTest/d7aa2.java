diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationSuperCallTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationSuperCallTest.java
index b35ae27..cae4bbf 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationSuperCallTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationSuperCallTest.java
@@ -33,7 +33,7 @@
     @Test
     public void testRunnableSuperCall() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(RunnableClass.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.value, is(BAR));
         instance.foo();
         assertThat(instance.value, is(FOO));
@@ -42,14 +42,14 @@
     @Test
     public void testCallableSuperCall() throws Exception {
         DynamicType.Loaded<Bar> loaded = implement(Bar.class, MethodDelegation.to(CallableClass.class));
-        Bar instance = loaded.getLoaded().getConstructor().newInstance();
+        Bar instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.bar(), is(FOO));
     }
 
     @Test
     public void testVoidToNonVoidSuperCall() throws Exception {
         DynamicType.Loaded<VoidTest> loaded = implement(VoidTest.class, MethodDelegation.to(NonVoidTarget.class));
-        VoidTest instance = loaded.getLoaded().getConstructor().newInstance();
+        VoidTest instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo();
         instance.assertOnlyCall(FOO);
     }
@@ -57,14 +57,14 @@
     @Test
     public void testRuntimeTypeSuperCall() throws Exception {
         DynamicType.Loaded<RuntimeTypeTest> loaded = implement(RuntimeTypeTest.class, MethodDelegation.to(RuntimeTypeTarget.class));
-        RuntimeTypeTest instance = loaded.getLoaded().getConstructor().newInstance();
+        RuntimeTypeTest instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(FOO));
     }
 
     @Test
     public void testSerializableProxy() throws Exception {
         DynamicType.Loaded<Bar> loaded = implement(Bar.class, MethodDelegation.to(SerializationCheck.class));
-        Bar instance = loaded.getLoaded().getConstructor().newInstance();
+        Bar instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.bar(), is(FOO));
     }
 
@@ -76,7 +76,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(SINGLE_DEFAULT_METHOD));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Method method = loaded.getLoaded().getMethod(FOO);
         assertThat(method.invoke(instance), is((Object) FOO));
     }
