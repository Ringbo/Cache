diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/DefaultMethodCallTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/DefaultMethodCallTest.java
index 242f97b..27a08ef 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/DefaultMethodCallTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/DefaultMethodCallTest.java
@@ -46,7 +46,7 @@
                 Class.forName(SINGLE_DEFAULT_METHOD));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         Method method = loaded.getLoaded().getDeclaredMethod(FOO);
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(method.invoke(instance), is((Object) FOO));
     }
 
@@ -84,7 +84,7 @@
                 preferredInterface, secondInterface);
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         Method method = loaded.getLoaded().getDeclaredMethod(FOO);
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(method.invoke(instance), is(expectedResult));
     }
 
@@ -126,7 +126,7 @@
                 Class.forName(SINGLE_DEFAULT_METHOD));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         Method method = loaded.getLoaded().getDeclaredMethod(FOO);
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(method.invoke(instance), is((Object) FOO));
     }
 
@@ -150,7 +150,7 @@
                 Class.forName(SINGLE_DEFAULT_METHOD), Class.forName(CONFLICTING_INTERFACE));
         assertThat(loaded.getLoaded().getDeclaredMethods().length, is(1));
         Method method = loaded.getLoaded().getDeclaredMethod(FOO);
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(method.invoke(instance), is((Object) FOO));
     }
 
