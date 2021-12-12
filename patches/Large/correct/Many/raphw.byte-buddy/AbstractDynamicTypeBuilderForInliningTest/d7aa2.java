diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/AbstractDynamicTypeBuilderForInliningTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/AbstractDynamicTypeBuilderForInliningTest.java
index 2ffe868..a7e56df 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/AbstractDynamicTypeBuilderForInliningTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/dynamic/scaffold/inline/AbstractDynamicTypeBuilderForInliningTest.java
@@ -101,7 +101,7 @@
                 .make()
                 .load(new URLClassLoader(new URL[0], null), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getConstructor().newInstance(), notNullValue(Object.class));
+        assertThat(type.getDeclaredConstructor().newInstance(), notNullValue(Object.class));
         assertThat(type.getDeclaredField(FOO).get(null), is((Object) FOO));
         assertThat(type.getDeclaredField(BAR).get(null), is((Object) BAR));
     }
@@ -222,7 +222,7 @@
                 .getLoaded();
         assertEquals(String.class, dynamicType.getDeclaredMethod(FOO).getReturnType());
         assertThat(dynamicType.getDeclaredMethod(FOO).getGenericReturnType(), is((Type) String.class));
-        BridgeRetention<String> bridgeRetention = (BridgeRetention<String>) dynamicType.getConstructor().newInstance();
+        BridgeRetention<String> bridgeRetention = (BridgeRetention<String>) dynamicType.getDeclaredConstructor().newInstance();
         assertThat(bridgeRetention.foo(), is(FOO));
         bridgeRetention.assertZeroCalls();
     }
@@ -242,7 +242,7 @@
         assertEquals(Object.class, dynamicType.getDeclaredMethod(FOO, Object.class).getReturnType());
         assertThat(dynamicType.getDeclaredMethod(FOO, Object.class).getGenericReturnType(), is((Type) Object.class));
         assertThat(dynamicType.getDeclaredMethod(FOO, Object.class).isBridge(), is(true));
-        CallSuperMethod<String> callSuperMethod = (CallSuperMethod<String>) dynamicType.getConstructor().newInstance();
+        CallSuperMethod<String> callSuperMethod = (CallSuperMethod<String>) dynamicType.getDeclaredConstructor().newInstance();
         assertThat(callSuperMethod.foo(FOO), is(FOO));
         callSuperMethod.assertOnlyCall(FOO);
     }
@@ -360,7 +360,7 @@
                 .load(new URLClassLoader(new URL[0], null), ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
         Method foo = type.getDeclaredMethod(FOO);
-        assertThat(foo.invoke(type.getConstructor().newInstance()), is((Object) FOO));
+        assertThat(foo.invoke(type.getDeclaredConstructor().newInstance()), is((Object) FOO));
         assertThat(foo.getModifiers(), is(Opcodes.ACC_FINAL | Opcodes.ACC_PUBLIC));
     }
 
@@ -396,7 +396,7 @@
                 .make()
                 .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
                 .getLoaded();
-        assertThat(type.getDeclaredMethod(FOO).invoke(type.getConstructor().newInstance()), is((Object) BAR));
+        assertThat(type.getDeclaredMethod(FOO).invoke(type.getDeclaredConstructor().newInstance()), is((Object) BAR));
         verify(asmVisitorWrapper).mergeWriter(0);
         verify(asmVisitorWrapper).mergeReader(0);
         verify(asmVisitorWrapper).wrap(any(TypeDescription.class), any(ClassVisitor.class), anyInt(), anyInt());
