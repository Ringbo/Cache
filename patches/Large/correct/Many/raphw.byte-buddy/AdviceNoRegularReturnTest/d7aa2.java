diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceNoRegularReturnTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceNoRegularReturnTest.java
index 88b4304..4e3536e 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceNoRegularReturnTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceNoRegularReturnTest.java
@@ -51,7 +51,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -67,7 +67,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -83,7 +83,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
