diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationMorphTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationMorphTest.java
index 398690b..4de9740 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationMorphTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationMorphTest.java
@@ -35,7 +35,7 @@
     public void testMorph() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(new SimpleMorph(QUX))
                 .appendParameterBinder(Morph.Binder.install(Morphing.class)));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(FOO), is(QUX + BAR));
     }
 
@@ -44,7 +44,7 @@
         SimpleMorph simpleMorph = new SimpleMorph(QUX);
         DynamicType.Loaded<Bar> loaded = implement(Bar.class, MethodDelegation.to(simpleMorph)
                 .appendParameterBinder(Morph.Binder.install(Morphing.class)));
-        Bar instance = loaded.getLoaded().getConstructor().newInstance();
+        Bar instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo();
         instance.assertOnlyCall(FOO);
         simpleMorph.assertOnlyCall(BAR);
@@ -54,7 +54,7 @@
     public void testMorphPrimitive() throws Exception {
         DynamicType.Loaded<Qux> loaded = implement(Qux.class, MethodDelegation.to(new PrimitiveMorph(BAZ))
                 .appendParameterBinder(Morph.Binder.install(Morphing.class)));
-        Qux instance = loaded.getLoaded().getConstructor().newInstance();
+        Qux instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(0), is(BAZ * 2L));
     }
 
@@ -62,7 +62,7 @@
     public void testMorphSerializable() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(SimpleMorphSerializable.class)
                 .appendParameterBinder(Morph.Binder.install(Morphing.class)));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.foo(FOO), is(QUX + BAR));
     }
 
@@ -76,7 +76,7 @@
     public void testMorphToIncompatibleTypeThrowsException() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, MethodDelegation.to(new SimpleMorph(new Object()))
                 .appendParameterBinder(Morph.Binder.install(Morphing.class)));
-        Foo instance = loaded.getLoaded().getConstructor().newInstance();
+        Foo instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo(QUX);
     }
 
@@ -114,7 +114,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(DEFAULT_INTERFACE));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass().getDeclaredMethod(FOO, String.class)
                 .invoke(instance, QUX), is((Object) (FOO + BAR)));
     }
@@ -128,7 +128,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(DEFAULT_INTERFACE));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass().getDeclaredMethod(FOO, String.class)
                 .invoke(instance, QUX), is((Object) (FOO + BAR)));
     }
