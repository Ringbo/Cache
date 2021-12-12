diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationAllArgumentsTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationAllArgumentsTest.java
index 2e3115e..7489b87 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationAllArgumentsTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationAllArgumentsTest.java
@@ -16,7 +16,7 @@
     @Test
     public void testStrictBindable() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(Bar.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(FOO, BAR), is((Object) (QUX + FOO + BAR)));
     }
 
@@ -28,14 +28,14 @@
     @Test
     public void testSlackNonBindable() throws Exception {
         DynamicType.Loaded<Qux> loaded = implement(Qux.class, MethodDelegation.to(BazSlack.class));
-        Qux instance = loaded.getLoaded().getConstructor().newInstance();
+        Qux instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(FOOBAR, BAZ), is((Object) (QUX + BAZ)));
     }
 
     @Test
     public void testIncludeSelf() throws Exception {
         DynamicType.Loaded<Qux> loaded = implement(Qux.class, MethodDelegation.to(IncludeSelf.class));
-        Qux instance = loaded.getLoaded().getConstructor().newInstance();
+        Qux instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(QUX, BAZ), is((Object) instance));
     }
 
