diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationPipeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationPipeTest.java
index c340e2e..a409b0b 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationPipeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationPipeTest.java
@@ -22,7 +22,7 @@
     public void testPipeToIdenticalType() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(new ForwardingInterceptor(new Foo(FOO)))
                 .defineParameterBinder(Pipe.Binder.install(ForwardingType.class)));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(QUX), is(FOO + QUX));
     }
 
@@ -30,7 +30,7 @@
     public void testPipeToIdenticalTypeVoid() throws Exception {
         DynamicType.Loaded<Qux> loaded = implement(Qux.class, MethodDelegation.to(new ForwardingInterceptor(new Qux()))
                 .defineParameterBinder(Pipe.Binder.install(ForwardingType.class)));
-        Qux instance = loaded.getLoaded().getConstructor().newInstance();
+        Qux instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo();
         instance.assertZeroCalls();
     }
@@ -39,7 +39,7 @@
     public void testPipeToIdenticalTypePrimitive() throws Exception {
         DynamicType.Loaded<Baz> loaded = implement(Baz.class, MethodDelegation.to(new PrimitiveForwardingInterceptor(new Baz()))
                 .defineParameterBinder(Pipe.Binder.install(ForwardingType.class)));
-        Baz instance = loaded.getLoaded().getConstructor().newInstance();
+        Baz instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(BAZ), is(BAZ * 2L));
         instance.assertZeroCalls();
     }
@@ -48,7 +48,7 @@
     public void testPipeToSubtype() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(new ForwardingInterceptor(new Bar(FOO)))
                 .defineParameterBinder(Pipe.Binder.install(ForwardingType.class)));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(QUX), is(FOO + QUX));
     }
 
@@ -56,7 +56,7 @@
     public void testPipeSerialization() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(new SerializableForwardingInterceptor(new Foo(FOO)))
                 .defineParameterBinder(Pipe.Binder.install(ForwardingType.class)));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(QUX), is(FOO + QUX));
     }
 
@@ -64,7 +64,7 @@
     public void testPipeToIncompatibleTypeThrowsException() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(new ForwardingInterceptor(new Object()))
                 .defineParameterBinder(Pipe.Binder.install(ForwardingType.class)));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo(QUX);
     }
 
