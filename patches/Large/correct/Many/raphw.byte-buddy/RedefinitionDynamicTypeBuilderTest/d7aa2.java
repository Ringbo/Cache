diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/RedefinitionDynamicTypeBuilderTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/RedefinitionDynamicTypeBuilderTest.java
index 23df465..e46b5fe 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/RedefinitionDynamicTypeBuilderTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/RedefinitionDynamicTypeBuilderTest.java
@@ -130,7 +130,7 @@
                 .make()
                 .load(dynamicInterfaceType.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicClassType.getMethod(FOO).invoke(dynamicClassType.getConstructor().newInstance()), is((Object) BAR));
+        assertThat(dynamicClassType.getMethod(FOO).invoke(dynamicClassType.getDeclaredConstructor().newInstance()), is((Object) BAR));
         assertThat(dynamicInterfaceType.getDeclaredMethods().length, is(1));
         assertThat(dynamicClassType.getDeclaredMethods().length, is(0));
     }
