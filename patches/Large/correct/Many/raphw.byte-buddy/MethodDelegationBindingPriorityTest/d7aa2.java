diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationBindingPriorityTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationBindingPriorityTest.java
index 84bd837..8df38d4 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationBindingPriorityTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationBindingPriorityTest.java
@@ -16,7 +16,7 @@
     @Test
     public void testBindingPriority() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(Bar.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(FOO));
     }
 
