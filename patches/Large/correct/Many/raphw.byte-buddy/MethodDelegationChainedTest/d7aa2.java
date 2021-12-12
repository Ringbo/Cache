diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationChainedTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationChainedTest.java
index 01cf9bd..17d1a60 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationChainedTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationChainedTest.java
@@ -19,7 +19,7 @@
         DynamicType.Loaded<Foo> dynamicType = implement(Foo.class, MethodDelegation.to(voidInterceptor)
                 .filter(isDeclaredBy(VoidInterceptor.class))
                 .andThen(new Implementation.Simple(new TextConstant(FOO), MethodReturn.REFERENCE)));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(), is(FOO));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(), is(FOO));
         assertThat(voidInterceptor.intercepted, is(true));
     }
 
@@ -29,7 +29,7 @@
         DynamicType.Loaded<Foo> dynamicType = implement(Foo.class, MethodDelegation.to(nonVoidInterceptor)
                 .filter(isDeclaredBy(NonVoidInterceptor.class))
                 .andThen(new Implementation.Simple(new TextConstant(FOO), MethodReturn.REFERENCE)));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(), is(FOO));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(), is(FOO));
         assertThat(nonVoidInterceptor.intercepted, is(true));
     }
 
