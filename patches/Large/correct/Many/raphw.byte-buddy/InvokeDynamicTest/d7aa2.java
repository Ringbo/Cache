diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/InvokeDynamicTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/InvokeDynamicTest.java
index 36f4209..5cd6ff6 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/InvokeDynamicTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/InvokeDynamicTest.java
@@ -85,7 +85,7 @@
                     InvokeDynamic.bootstrap(method).withoutArguments(),
                     getClass().getClassLoader(),
                     isDeclaredBy(Simple.class));
-            assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(), is(FOO));
+            assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(), is(FOO));
         }
     }
 
@@ -97,7 +97,7 @@
                     InvokeDynamic.bootstrap(constructor).withoutArguments(),
                     getClass().getClassLoader(),
                     isDeclaredBy(Simple.class));
-            assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(), is(FOO));
+            assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(), is(FOO));
         }
     }
 
@@ -113,7 +113,7 @@
                         .withoutArguments(),
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(), is(FOO));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(), is(FOO));
         Object[] arguments = (Object[]) field.get(null);
         assertThat(arguments.length, is(0));
     }
@@ -131,7 +131,7 @@
                         .withoutArguments(),
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(), is(FOO));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(), is(FOO));
         Object[] arguments = (Object[]) field.get(null);
         assertThat(arguments.length, is(8));
         assertThat(arguments[0], is((Object) INTEGER));
@@ -157,7 +157,7 @@
                         .withoutArguments(),
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(), is(FOO));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(), is(FOO));
         Object[] arguments = (Object[]) field.get(null);
         assertThat(arguments.length, is(8));
         assertThat(arguments[0], is((Object) INTEGER));
@@ -199,7 +199,7 @@
                         .withValue(FOO, CLASS, makeEnum(), makeMethodType(CLASS), makeMethodHandle(), value),
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(),
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(),
                 is("" + BOOLEAN + BYTE + SHORT + CHARACTER + INTEGER + LONG + FLOAT + DOUBLE + CLASS + makeEnum() + makeMethodType(CLASS)
                         + makeMethodHandle() + FOO + CLASS + makeEnum() + makeMethodType(CLASS) + makeMethodHandle() + value));
     }
@@ -218,7 +218,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(1));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(),
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(),
                 is("" + BOOLEAN + BYTE + SHORT + CHARACTER + INTEGER + LONG + FLOAT + DOUBLE + FOO + CLASS + makeEnum()
                         + makeMethodType(CLASS) + makeMethodHandle() + value));
     }
@@ -238,7 +238,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(14));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(),
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(),
                 is("" + BOOLEAN + BYTE + SHORT + CHARACTER + INTEGER + LONG + FLOAT + DOUBLE + FOO + CLASS + makeEnum()
                         + makeMethodType(CLASS) + makeMethodHandle() + value));
     }
@@ -255,7 +255,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(1));
-        Simple instance = dynamicType.getLoaded().getConstructor().newInstance();
+        Simple instance = dynamicType.getLoaded().getDeclaredConstructor().newInstance();
         Field field = dynamicType.getLoaded().getDeclaredField(FOO);
         field.setAccessible(true);
         field.set(instance, FOO);
@@ -274,7 +274,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(SimpleWithField.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(0));
-        SimpleWithField instance = dynamicType.getLoaded().getConstructor().newInstance();
+        SimpleWithField instance = dynamicType.getLoaded().getDeclaredConstructor().newInstance();
         Field field = SimpleWithField.class.getDeclaredField(FOO);
         field.setAccessible(true);
         field.set(instance, FOO);
@@ -306,7 +306,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(0));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(), nullValue(String.class));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(), nullValue(String.class));
     }
 
     @Test
@@ -321,7 +321,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(Simple.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(0));
-        Simple simple = dynamicType.getLoaded().getConstructor().newInstance();
+        Simple simple = dynamicType.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(simple.foo(), is(simple.toString()));
     }
 
@@ -337,7 +337,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(SimpleWithArgument.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(0));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(FOO), is(FOO));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(FOO), is(FOO));
     }
 
     @Test(expected = IllegalArgumentException.class)
@@ -376,7 +376,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(SimpleWithArgument.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(0));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(FOO), is(BAZ));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(FOO), is(BAZ));
     }
 
     @Test
@@ -391,7 +391,7 @@
                 getClass().getClassLoader(),
                 isDeclaredBy(SimpleWithArgument.class));
         assertThat(dynamicType.getLoaded().getDeclaredFields().length, is(0));
-        assertThat(dynamicType.getLoaded().getConstructor().newInstance().foo(FOO), is(FOO));
+        assertThat(dynamicType.getLoaded().getDeclaredConstructor().newInstance().foo(FOO), is(FOO));
     }
 
     @SuppressWarnings("unchecked")
