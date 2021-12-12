diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationDefaultTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationDefaultTest.java
index 44783c9..80b956a 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationDefaultTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/MethodDelegationDefaultTest.java
@@ -34,7 +34,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(DEFAULT_INTERFACE));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass().getDeclaredMethod(FOO).invoke(instance), is((Object) (FOO + BAR)));
     }
 
@@ -46,7 +46,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 DelegationNoDefaultInterface.class);
-        DelegationNoDefaultInterface instance = (DelegationNoDefaultInterface) loaded.getLoaded().getConstructor().newInstance();
+        DelegationNoDefaultInterface instance = (DelegationNoDefaultInterface) loaded.getLoaded().getDeclaredConstructor().newInstance();
         instance.foo();
     }
 
@@ -58,7 +58,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(DEFAULT_INTERFACE));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass().getDeclaredMethod(FOO).invoke(instance), is((Object) (FOO + BAR)));
     }
 
@@ -70,7 +70,7 @@
                 getClass().getClassLoader(),
                 isMethod().and(not(isDeclaredBy(Object.class))),
                 Class.forName(DEFAULT_INTERFACE));
-        Object instance = loaded.getLoaded().getConstructor().newInstance();
+        Object instance = loaded.getLoaded().getDeclaredConstructor().newInstance();
         assertThat(instance.getClass().getDeclaredMethod(FOO).invoke(instance), is((Object) (FOO + BAR)));
     }
 
