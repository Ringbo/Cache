diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDriverBinderParameterBinderForFixedValueOfConstantTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDriverBinderParameterBinderForFixedValueOfConstantTest.java
index 08e2715..6df05e9 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDriverBinderParameterBinderForFixedValueOfConstantTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDriverBinderParameterBinderForFixedValueOfConstantTest.java
@@ -56,7 +56,7 @@
                 .make()
                 .load(Foo.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .foo(), is(value));
     }
