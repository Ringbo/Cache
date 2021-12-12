diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceNoRegularReturnWithinAdviceTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceNoRegularReturnWithinAdviceTest.java
index 680dc17..48923a3 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceNoRegularReturnWithinAdviceTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceNoRegularReturnWithinAdviceTest.java
@@ -72,7 +72,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
