diff --git a/subprojects/testing-jvm/src/main/java/org/gradle/api/internal/tasks/testing/testng/TestNGListenerAdapterFactory.java b/subprojects/testing-jvm/src/main/java/org/gradle/api/internal/tasks/testing/testng/TestNGListenerAdapterFactory.java
index ccaee7c..a51409c 100644
--- a/subprojects/testing-jvm/src/main/java/org/gradle/api/internal/tasks/testing/testng/TestNGListenerAdapterFactory.java
+++ b/subprojects/testing-jvm/src/main/java/org/gradle/api/internal/tasks/testing/testng/TestNGListenerAdapterFactory.java
@@ -83,18 +83,18 @@
                 if (proxy == other) {
                     return true;
                 }
-                String proxyClassName = Proxy.getInvocationHandler(proxy).getClass().toString();
+                String proxyClassName = Proxy.getInvocationHandler(proxy).getClass().getName();
                 String otherClassName;
                 if (Proxy.isProxyClass(other.getClass())) {
-                    otherClassName = Proxy.getInvocationHandler(other).getClass().toString();
+                    otherClassName = Proxy.getInvocationHandler(other).getClass().getName();
                 } else {
-                    otherClassName = other.getClass().toString();
+                    otherClassName = other.getClass().getName();
                 }
-                return proxyClassName.equalsIgnoreCase(otherClassName);
+                return proxyClassName.equals(otherClassName);
             }
 
             private int proxyHashCode(Object proxy) {
-                return System.identityHashCode(proxy);
+                return Proxy.getInvocationHandler(proxy).getClass().getName().hashCode();
             }
         });
     }
