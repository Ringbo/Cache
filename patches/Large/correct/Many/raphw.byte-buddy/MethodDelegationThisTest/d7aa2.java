diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationThisTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationThisTest.java
index 7f0c69a..2c91c8a 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationThisTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationThisTest.java
@@ -12,7 +12,7 @@
     @Test
     public void testThis() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(Bar.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is((Object) instance));
     }
 
