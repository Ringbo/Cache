diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceFrameTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceFrameTest.java
index f26a399..c04db7d 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceFrameTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceFrameTest.java
@@ -52,7 +52,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getConstructor().newInstance(), FOO), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getDeclaredConstructor().newInstance(), FOO), is((Object) FOO));
         assertThat(type.getField(COUNT).getInt(null), is((Object) count));
     }
 
@@ -76,7 +76,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getConstructor().newInstance(), FOO), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getDeclaredConstructor().newInstance(), FOO), is((Object) FOO));
         assertThat(type.getField(COUNT).getInt(null), is((Object) count));
     }
 
@@ -100,7 +100,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getConstructor().newInstance(), FOO), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getDeclaredConstructor().newInstance(), FOO), is((Object) FOO));
         assertThat(type.getField(COUNT).getInt(null), is((Object) count));
     }
 
@@ -124,7 +124,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getConstructor().newInstance(), FOO), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getDeclaredConstructor().newInstance(), FOO), is((Object) FOO));
         assertThat(type.getField(COUNT).getInt(null), is((Object) count));
     }
 
