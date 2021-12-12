diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceJsrRetTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceJsrRetTest.java
index aa5d149..4abd733 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceJsrRetTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceJsrRetTest.java
@@ -30,14 +30,14 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER_PERSISTENT)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         Class<?> advised = new ByteBuddy()
                 .redefine(type)
                 .visit(Advice.to(JsrAdvice.class).on(named(FOO)))
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(advised.getDeclaredMethod(FOO).invoke(advised.getConstructor().newInstance()), is((Object) BAR));
+        assertThat(advised.getDeclaredMethod(FOO).invoke(advised.getDeclaredConstructor().newInstance()), is((Object) BAR));
     }
 
     @SuppressWarnings("all")
