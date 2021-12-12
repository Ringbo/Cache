diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/TypeWriterDefaultTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/TypeWriterDefaultTest.java
index ad4b462..d55cce7 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/TypeWriterDefaultTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/TypeWriterDefaultTest.java
@@ -390,7 +390,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getConstructor().newInstance()), is((Object) Object.class));
+        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getDeclaredConstructor().newInstance()), is((Object) Object.class));
     }
 
     @Test
@@ -403,7 +403,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getConstructor().newInstance()), is((Object) Object[].class));
+        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getDeclaredConstructor().newInstance()), is((Object) Object[].class));
     }
 
     @Test
@@ -416,7 +416,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getConstructor().newInstance()), is((Object) int.class));
+        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getDeclaredConstructor().newInstance()), is((Object) int.class));
     }
 
     @Test
