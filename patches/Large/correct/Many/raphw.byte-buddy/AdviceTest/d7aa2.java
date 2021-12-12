diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTest.java
index f89539e..da16c35 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/asm/AdviceTest.java
@@ -50,7 +50,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -61,7 +61,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -72,7 +72,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -83,7 +83,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -94,7 +94,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -105,7 +105,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -116,7 +116,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -127,7 +127,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -138,7 +138,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -149,7 +149,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -160,7 +160,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -171,7 +171,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -182,7 +182,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -193,7 +193,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -204,7 +204,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -215,7 +215,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -228,7 +228,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -241,7 +241,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -254,7 +254,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 0));
     }
@@ -267,7 +267,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 0));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -280,7 +280,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 0));
     }
@@ -293,7 +293,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 0));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -306,7 +306,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
         assertThat(type.getDeclaredMethod(BAZ).invoke(null), is((Object) FOO));
@@ -322,7 +322,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
         assertThat(type.getDeclaredMethod(BAZ).invoke(null), is((Object) FOO));
@@ -339,7 +339,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 2));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 2));
     }
@@ -353,7 +353,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 2));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 2));
     }
@@ -366,7 +366,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO + BAZ).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO + BAZ).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -379,7 +379,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO + BAZ).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO + BAZ).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -392,7 +392,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getConstructor().newInstance(), notNullValue(Object.class));
+        assertThat(type.getDeclaredConstructor().newInstance(), notNullValue(Object.class));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -405,7 +405,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getConstructor().newInstance(), notNullValue(Object.class));
+        assertThat(type.getDeclaredConstructor().newInstance(), notNullValue(Object.class));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -418,7 +418,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test
@@ -429,7 +429,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test(expected = IllegalStateException.class)
@@ -448,7 +448,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(BAR, String.class).invoke(type.getConstructor().newInstance(), BAR), is((Object) BAR));
+        assertThat(type.getDeclaredMethod(BAR, String.class).invoke(type.getDeclaredConstructor().newInstance(), BAR), is((Object) BAR));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -461,7 +461,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getConstructor().newInstance(), BAR), is((Object) BAR));
+        assertThat(type.getDeclaredMethod(FOO, String.class).invoke(type.getDeclaredConstructor().newInstance(), BAR), is((Object) BAR));
     }
 
     @Test
@@ -472,7 +472,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(QUX, String.class, String.class).invoke(type.getConstructor().newInstance(), FOO, BAR), is((Object) (FOO + BAR)));
+        assertThat(type.getDeclaredMethod(QUX, String.class, String.class).invoke(type.getDeclaredConstructor().newInstance(), FOO, BAR), is((Object) (FOO + BAR)));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -485,7 +485,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO, int.class).invoke(type.getConstructor().newInstance(), 0), is((Object) 2));
+        assertThat(type.getDeclaredMethod(FOO, int.class).invoke(type.getDeclaredConstructor().newInstance(), 0), is((Object) 2));
     }
 
     @Test
@@ -496,7 +496,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -509,7 +509,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -535,7 +535,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -548,7 +548,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 0));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -561,7 +561,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -575,7 +575,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 2));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 2));
     }
@@ -589,7 +589,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO + BAR).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO + BAR).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -608,7 +608,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO + BAR).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO + BAR).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -626,7 +626,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO + BAR).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO + BAR).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -644,7 +644,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(BAR + BAZ).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(BAR + BAZ).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(NullPointerException.class));
@@ -663,7 +663,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(BAR + BAZ).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(BAR + BAZ).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(NullPointerException.class));
@@ -681,7 +681,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(BAR + BAZ).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(BAR + BAZ).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(NullPointerException.class));
@@ -698,7 +698,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -711,7 +711,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 0));
     }
@@ -724,7 +724,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -737,7 +737,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(BAR, String.class).invoke(type.getConstructor().newInstance(), FOO + BAR + QUX + BAZ), is((Object) (FOO + BAR + QUX + BAZ)));
+        assertThat(type.getDeclaredMethod(BAR, String.class).invoke(type.getDeclaredConstructor().newInstance(), FOO + BAR + QUX + BAZ), is((Object) (FOO + BAR + QUX + BAZ)));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -750,7 +750,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(QUX + BAZ).invoke(type.getConstructor().newInstance()), is((Object) (FOO + BAR + QUX + BAZ)));
+        assertThat(type.getDeclaredMethod(QUX + BAZ).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (FOO + BAR + QUX + BAZ)));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -763,7 +763,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) (FOO)));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) (FOO)));
         assertThat(type.getDeclaredField(THROWABLE).get(null), nullValue(Object.class));
     }
 
@@ -776,7 +776,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO + BAR).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO + BAR).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -793,7 +793,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -812,7 +812,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -830,7 +830,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+        type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(INSIDE).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
@@ -845,7 +845,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(Exception.class));
@@ -864,7 +864,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(Exception.class));
@@ -931,7 +931,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(BAR, String.class).invoke(type.getConstructor().newInstance(), FOO), is((Object) BAR));
+        assertThat(type.getDeclaredMethod(BAR, String.class).invoke(type.getDeclaredConstructor().newInstance(), FOO), is((Object) BAR));
     }
 
     @Test(expected = IllegalStateException.class)
@@ -950,7 +950,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test(expected = IllegalStateException.class)
@@ -969,7 +969,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -982,7 +982,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -995,7 +995,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -1008,7 +1008,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
     }
@@ -1021,7 +1021,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO + BAR).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO + BAR).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -1033,7 +1033,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(IllegalStateException.class));
@@ -1051,7 +1051,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(Exception.class));
@@ -1069,7 +1069,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(RuntimeException.class));
@@ -1087,7 +1087,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(IOException.class));
@@ -1105,7 +1105,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(ClassCastException.class));
@@ -1120,7 +1120,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
     }
 
     @Test
@@ -1132,7 +1132,7 @@
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         try {
-            type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance());
+            type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance());
             fail();
         } catch (InvocationTargetException exception) {
             assertThat(exception.getCause(), instanceOf(ClassCastException.class));
@@ -1155,7 +1155,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test
@@ -1174,7 +1174,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test
@@ -1193,7 +1193,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test
@@ -1204,7 +1204,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(FOO).get(null), is((Object) 0));
@@ -1218,7 +1218,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(FOO).get(null), is((Object) 0));
@@ -1232,7 +1232,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(FOO).get(null), is((Object) 1));
@@ -1246,7 +1246,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(type.getDeclaredField(ENTER).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(EXIT).get(null), is((Object) 1));
         assertThat(type.getDeclaredField(FOO).get(null), is((Object) 1));
