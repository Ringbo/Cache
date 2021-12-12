diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationIgnoreForBindingTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationIgnoreForBindingTest.java
index 26ca9cc..bf030e3 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationIgnoreForBindingTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationIgnoreForBindingTest.java
@@ -14,7 +14,7 @@
     @Test
     public void testIgnoreForBinding() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(Bar.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(FOO));
     }
 
