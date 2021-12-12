diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/SuperMethodCallOtherTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/SuperMethodCallOtherTest.java
index 2b36a17..5c3dcc4 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/SuperMethodCallOtherTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/SuperMethodCallOtherTest.java
@@ -133,7 +133,7 @@
     public void testAndThen() throws Exception {
         DynamicType.Loaded<Foo> loaded = implement(Foo.class, SuperMethodCall.INSTANCE
                 .andThen(new Implementation.Simple(new TextConstant(FOO), MethodReturn.REFERENCE)));
-        Foo foo = loaded.getLoaded().getConstructor().newInstance();
+        Foo foo = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(foo.foo(), is(FOO));
         foo.assertOnlyCall(FOO);
     }
@@ -148,7 +148,7 @@
                 Class.forName(SINGLE_DEFAULT_METHOD));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         Method method = loaded.getLoaded().getDeclaredMethod(FOO);
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(method.invoke(instance), is((Object) FOO));
     }
 
@@ -161,7 +161,7 @@
                 isMethod().and(not(isDeclaredBy(Object.class))));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         Method method = loaded.getLoaded().getDeclaredMethod(FOO);
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(method.invoke(instance), is((Object) FOO));
     }
 
