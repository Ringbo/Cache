diff --git a/spock-core/src/main/java/org/spockframework/mock/runtime/ProxyBasedMockFactory.java b/spock-core/src/main/java/org/spockframework/mock/runtime/ProxyBasedMockFactory.java
index cd78439..53115ee 100644
--- a/spock-core/src/main/java/org/spockframework/mock/runtime/ProxyBasedMockFactory.java
+++ b/spock-core/src/main/java/org/spockframework/mock/runtime/ProxyBasedMockFactory.java
@@ -128,7 +128,7 @@
               .load(classLoader)
               .getLoaded();
           }
-        }, type);
+        }, CACHE);
 
       Object proxy = MockInstantiator.instantiate(type, enhancedType, constructorArgs, useObjenesis);
       ((ByteBuddyInterceptorAdapter.InterceptorAccess) proxy).$spock_set(interceptor);
