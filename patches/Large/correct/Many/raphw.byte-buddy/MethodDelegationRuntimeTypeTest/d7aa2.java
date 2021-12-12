diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationRuntimeTypeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationRuntimeTypeTest.java
index fdb2dfc..67cc80e 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationRuntimeTypeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationRuntimeTypeTest.java
@@ -14,7 +14,7 @@
     @Test
     public void testRuntimeType() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(Bar.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(FOO), is(FOO));
     }
 
