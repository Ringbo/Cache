diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/AbstractDynamicTypeBuilderTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/AbstractDynamicTypeBuilderTest.java
index 216d7a6..1f20717 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/AbstractDynamicTypeBuilderTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/AbstractDynamicTypeBuilderTest.java
@@ -127,7 +127,7 @@
         assertThat(method.getReturnType(), CoreMatchers.<Class<?>>is(Object.class));
         assertThat(method.getExceptionTypes(), is(new Class<?>[]{Exception.class}));
         assertThat(method.getModifiers(), is(Modifier.PUBLIC));
-        assertThat(method.invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(method.invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test
@@ -207,7 +207,7 @@
                 .make()
                 .load(new URLClassLoader(new URL[0], null), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded()
-                .getConstructor()
+                .getDeclaredConstructor()
                 .newInstance()
                 .toString(), is(BAR));
     }
@@ -224,7 +224,7 @@
                 .make()
                 .load(classLoader, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getConstructor().newInstance(), notNullValue(Object.class));
+        assertThat(type.getDeclaredConstructor().newInstance(), notNullValue(Object.class));
         Class<?> foo = classLoader.loadClass(Bar.class.getName());
         assertThat(foo.getDeclaredField(FOO).get(null), is((Object) FOO));
     }
@@ -238,7 +238,7 @@
                 .load(new URLClassLoader(new URL[0], null), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         Method method = type.getDeclaredMethod(FOO);
-        assertThat(method.invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(method.invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test
@@ -250,7 +250,7 @@
                 .make()
                 .load(new URLClassLoader(new URL[0], null), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getConstructor().newInstance().toString(), is(FOO));
+        assertThat(type.getDeclaredConstructor().newInstance().toString(), is(FOO));
         assertThat(type.getDeclaredMethod(TO_STRING).getModifiers(), is(Opcodes.ACC_FINAL | Opcodes.ACC_PUBLIC));
     }
 
@@ -275,7 +275,7 @@
                 .make()
                 .load(new URLClassLoader(new URL[0], null), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getConstructor().newInstance().toString(), CoreMatchers.not(FOO));
+        assertThat(type.getDeclaredConstructor().newInstance().toString(), CoreMatchers.not(FOO));
     }
 
     @Test
@@ -287,7 +287,7 @@
                 .make()
                 .load(new URLClassLoader(new URL[0], null), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
     }
 
     @Test
@@ -370,7 +370,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         verify(asmVisitorWrapper).mergeWriter(0);
         verify(asmVisitorWrapper, atMost(1)).mergeReader(0);
         verify(asmVisitorWrapper).wrap(any(TypeDescription.class), any(ClassVisitor.class), anyInt(), anyInt());
@@ -961,11 +961,11 @@
             if (method.getReturnType() == String.class) {
                 assertThat(method.getName(), is(QUX));
                 assertThat(method.getParameterTypes().length, is(0));
-                assertThat(method.invoke(type.getConstructor().newInstance()), is((Object) BAR));
+                assertThat(method.invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
             } else if (method.getReturnType() == Object.class) {
                 assertThat(method.getName(), is(QUX));
                 assertThat(method.getParameterTypes().length, is(0));
-                assertThat(method.invoke(type.getConstructor().newInstance()), is((Object) BAR));
+                assertThat(method.invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
             } else {
                 throw new AssertionError();
             }
@@ -986,7 +986,7 @@
             if (method.getReturnType() == String.class) {
                 assertThat(method.getName(), is(QUX));
                 assertThat(method.getParameterTypes().length, is(0));
-                assertThat(method.invoke(type.getConstructor().newInstance()), is((Object) FOO));
+                assertThat(method.invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
             } else if (method.getReturnType() == Object.class) {
                 assertThat(method.getName(), is(QUX));
                 assertThat(method.getParameterTypes().length, is(0));
