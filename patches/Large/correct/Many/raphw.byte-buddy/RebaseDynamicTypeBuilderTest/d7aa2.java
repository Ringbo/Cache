diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilderTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilderTest.java
index 7cd4a3a..bf59294 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilderTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/RebaseDynamicTypeBuilderTest.java
@@ -161,7 +161,7 @@
                 .make()
                 .load(dynamicInterfaceType.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicClassType.getMethod(FOO).invoke(dynamicClassType.getConstructor().newInstance()), is((Object) (FOO + BAR)));
+        assertThat(dynamicClassType.getMethod(FOO).invoke(dynamicClassType.getDeclaredConstructor().newInstance()), is((Object) (FOO + BAR)));
         assertThat(dynamicInterfaceType.getDeclaredMethods().length, is(3));
         assertThat(dynamicClassType.getDeclaredMethods().length, is(0));
     }
