diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTypeTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTypeTest.java
index facb8e2..57d67fa 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTypeTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTypeTest.java
@@ -91,7 +91,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO, this.type, this.type).invoke(type.getConstructor().newInstance(), value, value), is((Object) value));
+        assertThat(type.getDeclaredMethod(FOO, this.type, this.type).invoke(type.getDeclaredConstructor().newInstance(), value, value), is((Object) value));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -110,7 +110,7 @@
                 .getLoaded();
         type.getDeclaredField(exception).set(null, true);
         try {
-            assertThat(type.getDeclaredMethod(BAR, this.type, this.type).invoke(type.getConstructor().newInstance(), value, value), is((Object) value));
+            assertThat(type.getDeclaredMethod(BAR, this.type, this.type).invoke(type.getDeclaredConstructor().newInstance(), value, value), is((Object) value));
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -134,7 +134,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO, this.type, this.type).invoke(type.getConstructor().newInstance(), value, value), is((Object) value));
+        assertThat(type.getDeclaredMethod(FOO, this.type, this.type).invoke(type.getDeclaredConstructor().newInstance(), value, value), is((Object) value));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
