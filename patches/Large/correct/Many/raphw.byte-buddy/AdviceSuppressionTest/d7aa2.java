diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceSuppressionTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceSuppressionTest.java
index d4f7aa9..8ee45e6 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceSuppressionTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceSuppressionTest.java
@@ -78,7 +78,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(dynamicType.getDeclaredMethod(FOO).invoke(dynamicType.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @SuppressWarnings("unused")
