diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FixedValueTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FixedValueTest.java
index aac9460..49905eb 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FixedValueTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/FixedValueTest.java
@@ -44,14 +44,14 @@
     public void testTypeDescriptionConstantPool() throws Exception {
         Class<? extends Qux> qux = implement(Qux.class, FixedValue.value(TypeDescription.OBJECT)).getLoaded();
         assertThat(qux.getDeclaredFields().length, is(0));
-        assertThat(qux.getConstructor().newInstance().bar(), is((Object) Object.class));
+        assertThat(qux.getDeclaredConstructor().newInstance().bar(), is((Object) Object.class));
     }
 
     @Test
     public void testClassConstantPool() throws Exception {
         Class<? extends Qux> qux = implement(Qux.class, FixedValue.value(Object.class)).getLoaded();
         assertThat(qux.getDeclaredFields().length, is(0));
-        assertThat(qux.getConstructor().newInstance().bar(), is((Object) Object.class));
+        assertThat(qux.getDeclaredConstructor().newInstance().bar(), is((Object) Object.class));
     }
 
     @Test
@@ -59,7 +59,7 @@
     public void testMethodTypeConstantPool() throws Exception {
         Class<? extends Qux> qux = implement(Qux.class, FixedValue.value(JavaConstant.MethodType.of(void.class, Object.class))).getLoaded();
         assertThat(qux.getDeclaredFields().length, is(0));
-        assertThat(qux.getConstructor().newInstance().bar(), is(makeMethodType(void.class, Object.class)));
+        assertThat(qux.getDeclaredConstructor().newInstance().bar(), is(makeMethodType(void.class, Object.class)));
     }
 
     @Test
@@ -67,7 +67,7 @@
     public void testMethodTypeConstantPoolValue() throws Exception {
         Class<? extends Qux> qux = implement(Qux.class, FixedValue.value(makeMethodType(void.class, Object.class))).getLoaded();
         assertThat(qux.getDeclaredFields().length, is(0));
-        assertThat(qux.getConstructor().newInstance().bar(), is(makeMethodType(void.class, Object.class)));
+        assertThat(qux.getDeclaredConstructor().newInstance().bar(), is(makeMethodType(void.class, Object.class)));
     }
 
     @Test
@@ -75,7 +75,7 @@
     public void testMethodHandleConstantPool() throws Exception {
         Class<? extends Qux> qux = implement(Qux.class, FixedValue.value(JavaConstant.MethodHandle.of(Qux.class.getDeclaredMethod("bar")))).getLoaded();
         assertThat(qux.getDeclaredFields().length, is(0));
-        assertThat(JavaConstant.MethodHandle.ofLoaded(qux.getConstructor().newInstance().bar()), is(JavaConstant.MethodHandle.ofLoaded(makeMethodHandle())));
+        assertThat(JavaConstant.MethodHandle.ofLoaded(qux.getDeclaredConstructor().newInstance().bar()), is(JavaConstant.MethodHandle.ofLoaded(makeMethodHandle())));
     }
 
     @Test
@@ -83,7 +83,7 @@
     public void testMethodHandleConstantPoolValue() throws Exception {
         Class<? extends Qux> qux = implement(Qux.class, FixedValue.value(makeMethodHandle())).getLoaded();
         assertThat(qux.getDeclaredFields().length, is(0));
-        assertThat(JavaConstant.MethodHandle.ofLoaded(qux.getConstructor().newInstance().bar()), is(JavaConstant.MethodHandle.ofLoaded(makeMethodHandle())));
+        assertThat(JavaConstant.MethodHandle.ofLoaded(qux.getDeclaredConstructor().newInstance().bar()), is(JavaConstant.MethodHandle.ofLoaded(makeMethodHandle())));
     }
 
     @Test
@@ -101,7 +101,7 @@
         Class<?> type = implement(Foo.class, FixedValue.nullValue()).getLoaded();
         assertThat(type.getDeclaredFields().length, is(0));
         assertThat(type.getDeclaredMethods().length, is(1));
-        assertThat(type.getDeclaredMethod(BAR).invoke(type.getConstructor().newInstance()), nullValue(Object.class));
+        assertThat(type.getDeclaredMethod(BAR).invoke(type.getDeclaredConstructor().newInstance()), nullValue(Object.class));
     }
 
     @Test
@@ -109,7 +109,7 @@
         Class<?> type = implement(Baz.class, FixedValue.originType()).getLoaded();
         assertThat(type.getDeclaredFields().length, is(0));
         assertThat(type.getDeclaredMethods().length, is(1));
-        assertThat(type.getDeclaredMethod(BAR).invoke(type.getConstructor().newInstance()), is((Object) Baz.class));
+        assertThat(type.getDeclaredMethod(BAR).invoke(type.getDeclaredConstructor().newInstance()), is((Object) Baz.class));
     }
 
     @Test
@@ -153,7 +153,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Foo.class)));
         assertThat(instance, instanceOf(Foo.class));
         assertThat((Bar) loaded.getLoaded().getDeclaredMethod(BAR).invoke(instance), is(bar));
