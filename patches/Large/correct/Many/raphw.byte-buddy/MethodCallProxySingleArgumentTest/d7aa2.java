diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/auxiliary/MethodCallProxySingleArgumentTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/auxiliary/MethodCallProxySingleArgumentTest.java
index 492e6ba..75337f4 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/auxiliary/MethodCallProxySingleArgumentTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/implementation/auxiliary/MethodCallProxySingleArgumentTest.java
@@ -69,7 +69,7 @@
         Class<?> auxiliaryType = proxyOnlyDeclaredMethodOf(targetType);
         Constructor<?> constructor = auxiliaryType.getDeclaredConstructor(targetType, valueType);
         constructor.setAccessible(true);
-        T proxiedInstance = targetType.getConstructor().newInstance();
+        T proxiedInstance = targetType.getDeclaredConstructor().newInstance();
         ((Runnable) constructor.newInstance(proxiedInstance, value)).run();
         proxiedInstance.assertOnlyCall(FOO, value);
     }
@@ -79,7 +79,7 @@
         Class<?> auxiliaryType = proxyOnlyDeclaredMethodOf(targetType);
         Constructor<?> constructor = auxiliaryType.getDeclaredConstructor(targetType, valueType);
         constructor.setAccessible(true);
-        T proxiedInstance = targetType.getConstructor().newInstance();
+        T proxiedInstance = targetType.getDeclaredConstructor().newInstance();
         assertThat(((Callable<?>) constructor.newInstance(proxiedInstance, value)).call(), is(value));
         proxiedInstance.assertOnlyCall(FOO, value);
     }
