diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationOriginTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationOriginTest.java
index f805716..6aae6f2 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationOriginTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationOriginTest.java
@@ -33,7 +33,7 @@
     @Test
     public void testOriginClass() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(OriginClass.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), instanceOf(Class.class));
         assertThat(instance.foo(), is((Object) Foo.class));
     }
@@ -41,7 +41,7 @@
     @Test
     public void testOriginMethodWithoutCache() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(OriginMethod.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Object method = instance.foo();
         assertThat(method, instanceOf(Method.class));
         assertThat(method, is((Object) Foo.class.getDeclaredMethod(FOO)));
@@ -51,7 +51,7 @@
     @Test
     public void testOriginMethodWithCache() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(OriginMethodWithCache.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Object method = instance.foo();
         assertThat(method, instanceOf(Method.class));
         assertThat(method, is((Object) Foo.class.getDeclaredMethod(FOO)));
@@ -66,11 +66,11 @@
                 SuperMethodCall.INSTANCE.andThen(MethodDelegation.to(originConstructor)),
                 getClass().getClassLoader(),
                 isConstructor());
-        loaded.getLoaded().getConstructor().newInstance();
+        loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(originConstructor.constructor, instanceOf(Constructor.class));
         assertThat(originConstructor.constructor, is((Constructor) loaded.getLoaded().getDeclaredConstructor()));
         Constructor<?> previous = originConstructor.constructor;
-        loaded.getLoaded().getConstructor().newInstance();
+        loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(originConstructor.constructor, instanceOf(Constructor.class));
         assertThat(originConstructor.constructor, is((Constructor) loaded.getLoaded().getDeclaredConstructor()));
         assertThat(originConstructor.constructor, not(sameInstance((Constructor) previous)));
@@ -84,11 +84,11 @@
                 SuperMethodCall.INSTANCE.andThen(MethodDelegation.to(originConstructor)),
                 getClass().getClassLoader(),
                 isConstructor());
-        loaded.getLoaded().getConstructor().newInstance();
+        loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(originConstructor.constructor, instanceOf(Constructor.class));
         assertThat(originConstructor.constructor, is((Constructor) loaded.getLoaded().getDeclaredConstructor()));
         Constructor<?> previous = originConstructor.constructor;
-        loaded.getLoaded().getConstructor().newInstance();
+        loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(originConstructor.constructor, instanceOf(Constructor.class));
         assertThat(originConstructor.constructor, sameInstance((Constructor) previous));
     }
@@ -96,9 +96,9 @@
     @Test
     @JavaVersionRule.Enforce(8)
     public void testOriginExecutableOnMethodWithoutCache() throws Exception {
-        Object origin = Class.forName(ORIGIN_EXECUTABLE).getConstructor().newInstance();
+        Object origin = Class.forName(ORIGIN_EXECUTABLE).getDeclaredConstructor().newInstance();
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(origin));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Object method = instance.foo();
         assertThat(method, instanceOf(Method.class));
         assertThat(method, is((Object) Foo.class.getDeclaredMethod(FOO)));
@@ -108,9 +108,9 @@
     @Test
     @JavaVersionRule.Enforce(8)
     public void testOriginExecutableOnMethodWithCache() throws Exception {
-        Object origin = Class.forName(ORIGIN_EXECUTABLE_CACHED).getConstructor().newInstance();
+        Object origin = Class.forName(ORIGIN_EXECUTABLE_CACHED).getDeclaredConstructor().newInstance();
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(origin));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Object method = instance.foo();
         assertThat(method, instanceOf(Method.class));
         assertThat(method, is((Object) Foo.class.getDeclaredMethod(FOO)));
@@ -121,17 +121,17 @@
     @SuppressWarnings("unchecked")
     @JavaVersionRule.Enforce(8)
     public void testOriginExecutableConstructorWithoutCache() throws Exception {
-        Object originConstructor = Class.forName(ORIGIN_EXECUTABLE).getConstructor().newInstance();
+        Object originConstructor = Class.forName(ORIGIN_EXECUTABLE).getDeclaredConstructor().newInstance();
         Field constructor = Class.forName(ORIGIN_EXECUTABLE).getDeclaredField("executable");
         DynamicType.Loaded<Foo> loaded = implement(Foo.class,
                 SuperMethodCall.INSTANCE.andThen(MethodDelegation.to(originConstructor)),
                 getClass().getClassLoader(),
                 isConstructor());
-        loaded.getLoaded().getConstructor().newInstance();
+        loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(constructor.get(originConstructor), instanceOf(Constructor.class));
         assertThat(constructor.get(originConstructor), is((Object) loaded.getLoaded().getDeclaredConstructor()));
         Object previous = constructor.get(originConstructor);
-        loaded.getLoaded().getConstructor().newInstance();
+        loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(constructor.get(originConstructor), instanceOf(Constructor.class));
         assertThat(constructor.get(originConstructor), is((Object) loaded.getLoaded().getDeclaredConstructor()));
         assertThat(constructor.get(originConstructor), not(sameInstance(previous)));
@@ -141,17 +141,17 @@
     @SuppressWarnings("unchecked")
     @JavaVersionRule.Enforce(8)
     public void testOriginExecutableConstructorWithCache() throws Exception {
-        Object originConstructor = Class.forName(ORIGIN_EXECUTABLE_CACHED).getConstructor().newInstance();
+        Object originConstructor = Class.forName(ORIGIN_EXECUTABLE_CACHED).getDeclaredConstructor().newInstance();
         Field constructor = Class.forName(ORIGIN_EXECUTABLE_CACHED).getDeclaredField("executable");
         DynamicType.Loaded<Foo> loaded = implement(Foo.class,
                 SuperMethodCall.INSTANCE.andThen(MethodDelegation.to(originConstructor)),
                 getClass().getClassLoader(),
                 isConstructor());
-        loaded.getLoaded().getConstructor().newInstance();
+        loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(constructor.get(originConstructor), instanceOf(Constructor.class));
         assertThat(constructor.get(originConstructor), is((Object) loaded.getLoaded().getDeclaredConstructor()));
         Object previous = constructor.get(originConstructor);
-        loaded.getLoaded().getConstructor().newInstance();
+        loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(constructor.get(originConstructor), instanceOf(Constructor.class));
         assertThat(constructor.get(originConstructor), sameInstance(previous));
     }
@@ -159,7 +159,7 @@
     @Test
     public void testOriginString() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(OriginString.class));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), instanceOf(String.class));
         assertThat(instance.foo(), is((Object) Foo.class.getDeclaredMethod(FOO).toString()));
     }
@@ -169,7 +169,7 @@
     public void testOriginMethodHandle() throws Throwable {
         Class<?> originMethodHandle = Class.forName(ORIGIN_METHOD_HANDLE);
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(originMethodHandle));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), instanceOf((Class<?>) originMethodHandle.getDeclaredField(TYPE).get(null)));
     }
 
@@ -178,7 +178,7 @@
     public void testOriginMethodType() throws Throwable {
         Class<?> originMethodType = Class.forName(ORIGIN_METHOD_TYPE);
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(originMethodType));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), instanceOf((Class<?>) originMethodType.getDeclaredField(TYPE).get(null)));
     }
 
