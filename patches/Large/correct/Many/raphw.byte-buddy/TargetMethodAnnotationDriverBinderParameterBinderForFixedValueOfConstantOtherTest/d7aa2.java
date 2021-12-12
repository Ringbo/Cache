diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDriverBinderParameterBinderForFixedValueOfConstantOtherTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDriverBinderParameterBinderForFixedValueOfConstantOtherTest.java
index e3309e6..3fb7935 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDriverBinderParameterBinderForFixedValueOfConstantOtherTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDriverBinderParameterBinderForFixedValueOfConstantOtherTest.java
@@ -40,7 +40,7 @@
                 .make()
                 .load(Foo.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .foo(), is((Object) Object.class));
     }
@@ -55,7 +55,7 @@
                 .make()
                 .load(Foo.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .foo(), nullValue(Object.class));
     }
@@ -75,7 +75,7 @@
                 .make()
                 .load(Foo.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .foo()), is(JavaConstant.MethodHandle.ofLoaded(methodHandleLoaded)));
     }
@@ -95,7 +95,7 @@
                 .make()
                 .load(Foo.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .foo()), is(JavaConstant.MethodHandle.ofLoaded(methodHandleLoaded)));
     }
@@ -113,7 +113,7 @@
                 .make()
                 .load(Foo.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .foo()), is(JavaConstant.MethodType.ofLoaded(loadedMethodType)));
     }
@@ -131,7 +131,7 @@
                 .make()
                 .load(Foo.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .foo()), is(JavaConstant.MethodType.ofLoaded(loadedMethodType)));
     }
