diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceSkipIfTrueTypeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceSkipIfTrueTypeTest.java
index fabe421..1689e9e 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceSkipIfTrueTypeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceSkipIfTrueTypeTest.java
@@ -81,7 +81,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is(value));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is(value));
     }
 
     @SuppressWarnings("unused")
