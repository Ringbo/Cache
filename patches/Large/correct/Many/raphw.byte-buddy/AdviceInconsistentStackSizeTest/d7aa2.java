diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceInconsistentStackSizeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceInconsistentStackSizeTest.java
index 6934891..0d5ce5a 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceInconsistentStackSizeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceInconsistentStackSizeTest.java
@@ -76,7 +76,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(adviced.getDeclaredMethod(FOO).invoke(adviced.getConstructor().newInstance()), is((Object) replaced));
+        assertThat(adviced.getDeclaredMethod(FOO).invoke(adviced.getDeclaredConstructor().newInstance()), is((Object) replaced));
     }
 
     @Test
@@ -104,7 +104,7 @@
                 .load(null, ClassLoadingStrategy.Default.CHILD_FIRST)
                 .getLoaded();
         assertThat(redefined, not(sameInstance((Object) foo)));
-        assertThat(redefined.getDeclaredMethod(FOO).invoke(redefined.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(redefined.getDeclaredMethod(FOO).invoke(redefined.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @SuppressWarnings("all")
