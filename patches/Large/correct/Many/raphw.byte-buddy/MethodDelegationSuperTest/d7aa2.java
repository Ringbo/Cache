diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationSuperTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationSuperTest.java
index a9ee5a6..f458d44 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationSuperTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationSuperTest.java
@@ -25,55 +25,55 @@
     @Test
     public void testSuperInstance() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(Baz.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.qux(), is((Object) (FOO + QUX)));
     }
 
     @Test
     public void testSuperInterface() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(FooBar.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.qux(), is((Object) (FOO + QUX)));
     }
 
     @Test
     public void testSuperInstanceUnsafe() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(QuxBaz.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.qux(), is((Object) (FOO + QUX)));
     }
 
     @Test
     public void testBridgeMethodResolution() throws Exception {
         DynamicType.Loaded<Bar> loaded = implement(Bar.class, MethodDelegation.to(GenericBaz.class));
-        Bar instance = loaded.getLoaded().getConstructor().newInstance();
+        Bar instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.qux(BAR), is(BAR + QUX));
     }
 
     @Test(expected = AbstractMethodError.class)
     public void testSuperCallOnAbstractMethod() throws Exception {
         DynamicType.Loaded<FooBarQuxBaz> loaded = implement(FooBarQuxBaz.class, MethodDelegation.to(FooBar.class));
-        loaded.getLoaded().getConstructor().newInstance().qux();
+        loaded.getLoaded().getDeclaredConstructor().newInstance().qux();
     }
 
     @Test
     public void testSerializableProxy() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(SerializationCheck.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.qux(), is((Object) (FOO + QUX)));
     }
 
     @Test
     public void testTargetTypeProxy() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(TargetTypeTest.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.qux(), is((Object) (FOO + QUX)));
     }
 
     @Test
     public void testExplicitTypeProxy() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(ExplicitTypeTest.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.qux(), is((Object) (FOO + QUX)));
     }
 
@@ -92,7 +92,7 @@
                 .make()
                 .load(classLoader, ClassLoadingStrategy.Default.INJECTION)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(BAR).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(BAR).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     public interface Qux {
