diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationArgumentTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationArgumentTest.java
index 5a88fe3..ac4bdc1 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationArgumentTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationArgumentTest.java
@@ -19,7 +19,7 @@
     @Test
     public void testArgument() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(Bar.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(FOO, BAR), is((Object) (QUX + FOO + BAR)));
     }
 
@@ -32,7 +32,7 @@
                 .make()
                 .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .foo();
     }
