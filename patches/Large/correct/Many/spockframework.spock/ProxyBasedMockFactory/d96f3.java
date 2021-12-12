diff --git a/spock-core/src/main/java/org/spockframework/mock/runtime/ProxyBasedMockFactory.java b/spock-core/src/main/java/org/spockframework/mock/runtime/ProxyBasedMockFactory.java
index 3d35b49..430d5af 100644
--- a/spock-core/src/main/java/org/spockframework/mock/runtime/ProxyBasedMockFactory.java
+++ b/spock-core/src/main/java/org/spockframework/mock/runtime/ProxyBasedMockFactory.java
@@ -67,7 +67,7 @@
           constructorArgs, mockInterceptor, classLoader, useObjenesis);
     } else {
       throw new CannotCreateMockException(mockType,
-          ". Mocking of non-interface types requires a code generation library. Please put byte-buddy-1.4.0 or cglib-nodep-3.2 or higher on the class path."
+          ". Mocking of non-interface types requires a code generation library. Please put byte-buddy-1.5.0 or cglib-nodep-3.2 or higher on the class path."
       );
     }
 
@@ -120,9 +120,10 @@
               .implement(ISpockMockObject.class)
               .method(any())
                 .intercept(MethodDelegation.to(ByteBuddyInterceptorAdapter.class).appendParameterBinder(Morph.Binder.install(ByteBuddyInvoker.class)))
-                .transform(Transformer.ForMethod.withModifiers(SynchronizationState.PLAIN)) // Overridden methods should not be declared synchronized.
+                .transform(Transformer.ForMethod.withModifiers(SynchronizationState.PLAIN, Visibility.PUBLIC)) // Overridden methods should be public and non-synchronized.
               .implement(ByteBuddyInterceptorAdapter.InterceptorAccess.class)
-                .intercept(FieldAccessor.ofField("$spock_interceptor").defineAs(IProxyBasedMockInterceptor.class, Visibility.PRIVATE))
+                .intercept(FieldAccessor.ofField("$spock_interceptor"))
+                .defineField("$spock_interceptor", IProxyBasedMockInterceptor.class, Visibility.PRIVATE)
               .make()
               .load(classLoader)
               .getLoaded();
