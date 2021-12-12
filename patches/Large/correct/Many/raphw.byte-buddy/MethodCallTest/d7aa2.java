diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodCallTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodCallTest.java
index a86cb92..0c5ba9b 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodCallTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodCallTest.java
@@ -78,7 +78,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        SimpleMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(BAR));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(SimpleMethod.class)));
         assertThat(instance, instanceOf(SimpleMethod.class));
@@ -93,7 +93,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        SimpleMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(BAR));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(SimpleMethod.class)));
         assertThat(instance, instanceOf(SimpleMethod.class));
@@ -108,7 +108,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        InstanceMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        InstanceMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is(BAR));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(InstanceMethod.class)));
         assertThat(instance, instanceOf(InstanceMethod.class));
@@ -131,7 +131,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        ArgumentCall instance = loaded.getLoaded().getConstructor().newInstance();
+        ArgumentCall instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(new ArgumentCall.Target(BAR)), is(BAR));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(InstanceMethod.class)));
         assertThat(instance, instanceOf(ArgumentCall.class));
@@ -157,7 +157,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        ArgumentCallDynamic instance = loaded.getLoaded().getConstructor().newInstance();
+        ArgumentCallDynamic instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(new ArgumentCallDynamic.Target(BAR)), is(BAR));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(InstanceMethod.class)));
         assertThat(instance, instanceOf(ArgumentCallDynamic.class));
@@ -173,7 +173,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(0));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(Object.class)));
         assertThat(instance, instanceOf(Object.class));
     }
@@ -186,7 +186,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        SelfReference instance = loaded.getLoaded().getConstructor().newInstance();
+        SelfReference instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         SelfReference created = instance.foo();
         assertThat(created.getClass(), CoreMatchers.<Class<?>>is(SelfReference.class));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(SelfReference.class)));
@@ -205,7 +205,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        SuperMethodInvocation instance = loaded.getLoaded().getConstructor().newInstance();
+        SuperMethodInvocation instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(SuperMethodInvocation.class)));
         assertThat(instance, instanceOf(SuperMethodInvocation.class));
         assertThat(instance.foo(), is(FOO));
@@ -220,7 +220,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, String.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallWithExplicitArgument instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithExplicitArgument instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallWithExplicitArgument.class)));
         assertThat(instance, instanceOf(MethodCallWithExplicitArgument.class));
         assertThat(instance.foo(BAR), is(FOO));
@@ -241,7 +241,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, String.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        MethodCallWithExplicitArgument instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithExplicitArgument instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallWithExplicitArgument.class)));
         assertThat(instance, instanceOf(MethodCallWithExplicitArgument.class));
         assertThat(instance.foo(BAR), is(FOO));
@@ -262,7 +262,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, String.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallWithExplicitArgument instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithExplicitArgument instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallWithExplicitArgument.class)));
         assertThat(instance, instanceOf(MethodCallWithExplicitArgument.class));
         assertThat(instance.foo(BAR), is(BAR));
@@ -277,7 +277,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, String.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallWithExplicitArgument instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithExplicitArgument instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallWithExplicitArgument.class)));
         assertThat(instance, instanceOf(MethodCallWithExplicitArgument.class));
         assertThat(instance.foo(BAR), is(BAR));
@@ -292,7 +292,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, String.class, String.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallWithTwoExplicitArguments instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithTwoExplicitArguments instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallWithTwoExplicitArguments.class)));
         assertThat(instance, instanceOf(MethodCallWithTwoExplicitArguments.class));
         assertThat(instance.foo(FOO, BAR), is(FOO + BAR));
@@ -307,7 +307,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, String.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        MethodCallWithExplicitArgument instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithExplicitArgument instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Field field = instance.getClass().getDeclaredField(FOO);
         field.setAccessible(true);
         field.set(instance, FOO);
@@ -335,7 +335,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, String.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallWithField instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithField instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo = FOO;
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallWithField.class)));
         assertThat(instance, instanceOf(MethodCallWithField.class));
@@ -361,7 +361,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, String.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        InvisibleMethodCallWithField instance = loaded.getLoaded().getConstructor().newInstance();
+        InvisibleMethodCallWithField instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         ((InvisibleBase) instance).foo = FOO;
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(InvisibleMethodCallWithField.class)));
         assertThat(instance, instanceOf(InvisibleMethodCallWithField.class));
@@ -377,7 +377,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, MethodCallWithThis.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallWithThis instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithThis instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallWithThis.class)));
         assertThat(instance, instanceOf(MethodCallWithThis.class));
         assertThat(instance.foo(null), is(instance));
@@ -392,7 +392,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO, Class.class), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallWithOwnType instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallWithOwnType instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallWithThis.class)));
         assertThat(instance, instanceOf(MethodCallWithOwnType.class));
         assertThat(instance.foo(null), CoreMatchers.<Class<?>>is(loaded.getLoaded()));
@@ -407,7 +407,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallAppending instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallAppending instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallAppending.class)));
         assertThat(instance, instanceOf(MethodCallAppending.class));
         assertThat(instance.foo(), is((Object) FOO));
@@ -424,7 +424,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        MethodCallAppending instance = loaded.getLoaded().getConstructor().newInstance();
+        MethodCallAppending instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(MethodCallAppending.class)));
         assertThat(instance, instanceOf(MethodCallAppending.class));
         assertThat(instance.foo(), is((Object) FOO));
@@ -441,7 +441,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        ExplicitTarget instance = loaded.getLoaded().getConstructor().newInstance();
+        ExplicitTarget instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(ExplicitTarget.class)));
         assertThat(instance, instanceOf(ExplicitTarget.class));
         assertThat(instance.foo(), is(target.toString()));
@@ -457,7 +457,7 @@
         assertThat(loaded.getLoaded().getDeclaredMethod(FOO), not(nullValue(Method.class)));
         assertThat(loaded.getLoaded().getDeclaredConstructors().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(1));
-        ExplicitTarget instance = loaded.getLoaded().getConstructor().newInstance();
+        ExplicitTarget instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Field field = loaded.getLoaded().getDeclaredField(FOO);
         field.setAccessible(true);
         field.set(instance, target);
@@ -476,7 +476,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        SimpleMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is("" + Object.class + String.class));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(SimpleMethod.class)));
         assertThat(instance, instanceOf(SimpleMethod.class));
@@ -493,7 +493,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        SimpleMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is("" + makeMethodHandle() + makeMethodType(void.class)));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(SimpleMethod.class)));
         assertThat(instance, instanceOf(SimpleMethod.class));
@@ -510,7 +510,7 @@
         assertThat(loaded.getLoadedAuxiliaryTypes().size(), is(0));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         assertThat(loaded.getLoaded().getDeclaredFields().length, is(0));
-        SimpleMethod instance = loaded.getLoaded().getConstructor().newInstance();
+        SimpleMethod instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(), is("" + makeMethodHandle() + makeMethodType(void.class)));
         assertThat(instance.getClass(), not(CoreMatchers.<Class<?>>is(SimpleMethod.class)));
         assertThat(instance, instanceOf(SimpleMethod.class));
@@ -526,7 +526,7 @@
                 Class.forName(SINGLE_DEFAULT_METHOD));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         Method method = loaded.getLoaded().getDeclaredMethod(FOO);
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(method.invoke(instance), is((Object) FOO));
     }
 
@@ -534,7 +534,7 @@
     public void testCallable() throws Exception {
         Traceable traceable = new Traceable();
         Class<? extends SimpleStringMethod> loaded = implement(SimpleStringMethod.class, MethodCall.call(traceable)).getLoaded();
-        assertThat(loaded.getConstructor().newInstance().foo(), is(FOO));
+        assertThat(loaded.getDeclaredConstructor().newInstance().foo(), is(FOO));
         traceable.assertOnlyCall(FOO);
     }
 
@@ -542,7 +542,7 @@
     public void testRunnable() throws Exception {
         Traceable traceable = new Traceable();
         Class<? extends SimpleStringMethod> loaded = implement(SimpleStringMethod.class, MethodCall.run(traceable)).getLoaded();
-        assertThat(loaded.getConstructor().newInstance().foo(), nullValue(String.class));
+        assertThat(loaded.getDeclaredConstructor().newInstance().foo(), nullValue(String.class));
         traceable.assertOnlyCall(FOO);
     }
 
