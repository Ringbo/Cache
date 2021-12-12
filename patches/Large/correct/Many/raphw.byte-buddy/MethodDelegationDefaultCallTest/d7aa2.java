diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationDefaultCallTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationDefaultCallTest.java
index ce61ac6..4702a1f 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationDefaultCallTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationDefaultCallTest.java
@@ -40,7 +40,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(SINGLE_DEFAULT_METHOD));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Method method = loaded.getLoaded().getMethod(FOO);
         assertThat(method.invoke(instance), is((Object) QUX));
     }
@@ -53,7 +53,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(SINGLE_DEFAULT_METHOD));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Method method = loaded.getLoaded().getMethod(FOO);
         assertThat(method.invoke(instance), is((Object) FOO));
     }
@@ -76,7 +76,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(SINGLE_DEFAULT_METHOD), Class.forName(CONFLICTING_INTERFACE));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Method method = loaded.getLoaded().getMethod(FOO);
         assertThat(method.invoke(instance), is((Object) FOO));
     }
@@ -89,7 +89,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(SINGLE_DEFAULT_METHOD), Class.forName(CONFLICTING_INTERFACE));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Method method = loaded.getLoaded().getMethod(FOO);
         assertThat(method.invoke(instance), is((Object) QUX));
     }
@@ -112,7 +112,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(SINGLE_DEFAULT_METHOD));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         Method method = loaded.getLoaded().getMethod(FOO);
         assertThat(method.invoke(instance), is((Object) FOO));
     }
