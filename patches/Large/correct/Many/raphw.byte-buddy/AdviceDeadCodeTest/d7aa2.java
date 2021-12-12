diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceDeadCodeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceDeadCodeTest.java
index b5e7f14..99686be 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceDeadCodeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceDeadCodeTest.java
@@ -58,7 +58,7 @@
                 .make()
                 .load(null, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(redefined.getDeclaredMethod(FOO).invoke(redefined.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(redefined.getDeclaredMethod(FOO).invoke(redefined.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test
@@ -86,7 +86,7 @@
                 .load(null, ClassLoadingStrategy.Default.CHILD_FIRST)
                 .getLoaded();
         assertThat(redefined, not(sameInstance((Object) foo)));
-        assertThat(redefined.getDeclaredMethod(FOO).invoke(redefined.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(redefined.getDeclaredMethod(FOO).invoke(redefined.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @SuppressWarnings("all")
