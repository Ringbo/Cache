diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilderTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilderTest.java
index 9624bbc..3e73b81 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilderTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/subclass/SubclassDynamicTypeBuilderTest.java
@@ -87,7 +87,7 @@
         assertThat(type.getDeclaredConstructor(), notNullValue(Constructor.class));
         assertThat(Object.class.isAssignableFrom(type), is(true));
         assertThat(type, not(CoreMatchers.<Class<?>>is(Object.class)));
-        assertThat(type.getConstructor().newInstance(), notNullValue(Object.class));
+        assertThat(type.getDeclaredConstructor().newInstance(), notNullValue(Object.class));
         assertThat(type.isInterface(), is(false));
         assertThat(type.isAnnotation(), is(false));
     }
@@ -119,7 +119,7 @@
         assertThat(type.getDeclaredConstructor(), notNullValue(Constructor.class));
         assertThat(DefaultConstructor.class.isAssignableFrom(type), is(true));
         assertThat(type, not(CoreMatchers.<Class<?>>is(DefaultConstructor.class)));
-        assertThat(type.getConstructor().newInstance(), notNullValue(DefaultConstructor.class));
+        assertThat(type.getDeclaredConstructor().newInstance(), notNullValue(DefaultConstructor.class));
         assertThat(type.isInterface(), is(false));
         assertThat(type.isAnnotation(), is(false));
     }
@@ -225,7 +225,7 @@
                 .getLoaded();
         assertThat(dynamicType.getDeclaredFields().length, is(0));
         assertThat(dynamicType.getDeclaredMethods().length, is(0));
-        assertThat(interfaceMethod.invoke(dynamicType.getConstructor().newInstance()), is(interfaceMarker));
+        assertThat(interfaceMethod.invoke(dynamicType.getDeclaredConstructor().newInstance()), is(interfaceMarker));
     }
 
     @Test
@@ -241,7 +241,7 @@
                 .getLoaded();
         assertThat(dynamicType.getDeclaredFields().length, is(0));
         assertThat(dynamicType.getDeclaredMethods().length, is(1));
-        assertThat(interfaceMethod.invoke(dynamicType.getConstructor().newInstance()), is((Object) BAR));
+        assertThat(interfaceMethod.invoke(dynamicType.getDeclaredConstructor().newInstance()), is((Object) BAR));
     }
 
     @Test
@@ -285,7 +285,7 @@
                 .make()
                 .load(dynamicInterfaceType.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(dynamicClassType.getMethod(FOO).invoke(dynamicClassType.getConstructor().newInstance()), is((Object) (FOO + BAR)));
+        assertThat(dynamicClassType.getMethod(FOO).invoke(dynamicClassType.getDeclaredConstructor().newInstance()), is((Object) (FOO + BAR)));
         assertThat(dynamicInterfaceType.getDeclaredMethods().length, is(2));
         assertThat(dynamicClassType.getDeclaredMethods().length, is(0));
     }
@@ -376,7 +376,7 @@
                 .getLoaded();
         assertEquals(String.class, dynamicType.getDeclaredMethod(FOO).getReturnType());
         assertThat(dynamicType.getDeclaredMethod(FOO).getGenericReturnType(), is((Type) String.class));
-        BridgeRetention<String> bridgeRetention = (BridgeRetention<String>) dynamicType.getConstructor().newInstance();
+        BridgeRetention<String> bridgeRetention = (BridgeRetention<String>) dynamicType.getDeclaredConstructor().newInstance();
         assertThat(bridgeRetention.foo(), is(FOO));
         bridgeRetention.assertZeroCalls();
     }
@@ -397,7 +397,7 @@
         assertEquals(Object.class, dynamicType.getDeclaredMethod(FOO, Object.class).getReturnType());
         assertThat(dynamicType.getDeclaredMethod(FOO, Object.class).getGenericReturnType(), is((Type) Object.class));
         assertThat(dynamicType.getDeclaredMethod(FOO, Object.class).isBridge(), is(true));
-        CallSuperMethod<String> callSuperMethod = (CallSuperMethod<String>) dynamicType.getConstructor().newInstance();
+        CallSuperMethod<String> callSuperMethod = (CallSuperMethod<String>) dynamicType.getDeclaredConstructor().newInstance();
         assertThat(callSuperMethod.foo(FOO), is(FOO));
         callSuperMethod.assertOnlyCall(FOO);
     }
@@ -436,12 +436,12 @@
         assertThat(foo.isBridge(), is(true));
         assertThat(foo.getDeclaredAnnotations().length, is(1));
         assertThat(foo.getAnnotation(Foo.class), notNullValue(Foo.class));
-        assertThat(foo.invoke(type.getConstructor().newInstance(), BAR), is((Object) (FOO + BAR)));
+        assertThat(foo.invoke(type.getDeclaredConstructor().newInstance(), BAR), is((Object) (FOO + BAR)));
         Method bar = type.getDeclaredMethod(BAR, List.class);
         assertThat(bar.isBridge(), is(true));
         assertThat(bar.getDeclaredAnnotations().length, is(0));
         List<?> list = new ArrayList<Object>();
-        assertThat(bar.invoke(type.getConstructor().newInstance(), list), sameInstance((Object) list));
+        assertThat(bar.invoke(type.getDeclaredConstructor().newInstance(), list), sameInstance((Object) list));
         assertThat(bar.getGenericReturnType(), instanceOf(Class.class));
         assertThat(bar.getGenericParameterTypes()[0], instanceOf(Class.class));
         assertThat(bar.getGenericExceptionTypes()[0], instanceOf(Class.class));
