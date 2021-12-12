diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/ExceptionMethodTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/ExceptionMethodTest.java
index e1d2e1e..36fd179 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/ExceptionMethodTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/ExceptionMethodTest.java
@@ -23,7 +23,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
         try {
@@ -42,7 +42,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
         try {
@@ -61,7 +61,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
         try {
