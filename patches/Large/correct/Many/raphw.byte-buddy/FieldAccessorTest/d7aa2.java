diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FieldAccessorTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FieldAccessorTest.java
index 3cf03d1..188bbf0 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FieldAccessorTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FieldAccessorTest.java
@@ -193,7 +193,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(definesField ? 1 : 0));
-        Z instance = loaded.getLoaded().getConstructor().newInstance();
+        Z instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         if (definesField) {
             initializeField(instance);
         }
@@ -214,7 +214,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(definesField ? 1 : 0));
-        Z instance = loaded.getLoaded().getConstructor().newInstance();
+        Z instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(target)));
         assertThat(instance, instanceOf(target));
         Method setter = loaded.getLoaded()
