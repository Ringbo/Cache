diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationStubValueTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationStubValueTest.java
index abb9b81..3fc5cfe 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationStubValueTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationStubValueTest.java
@@ -16,28 +16,28 @@
     @Test
     public void testVoidMethod() throws Exception {
         DynamicType.Loaded<VoidMethod> loaded = implement(VoidMethod.class, MethodDelegation.to(new Interceptor(null)));
-        VoidMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        VoidMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo();
     }
 
     @Test
     public void testReference() throws Exception {
         DynamicType.Loaded<ReferenceMethod> loaded = implement(ReferenceMethod.class, MethodDelegation.to(new Interceptor(null)));
-        ReferenceMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        ReferenceMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), nullValue(Object.class));
     }
 
     @Test
     public void testLongValue() throws Exception {
         DynamicType.Loaded<LongMethod> loaded = implement(LongMethod.class, MethodDelegation.to(new Interceptor(0L)));
-        LongMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        LongMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(0L));
     }
 
     @Test
     public void tesIntegerValue() throws Exception {
         DynamicType.Loaded<IntegerMethod> loaded = implement(IntegerMethod.class, MethodDelegation.to(new Interceptor(0)));
-        IntegerMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        IntegerMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(0));
     }
 
