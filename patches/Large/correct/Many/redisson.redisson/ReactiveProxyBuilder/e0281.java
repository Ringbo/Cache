diff --git a/redisson/src/main/java/org/redisson/reactive/ReactiveProxyBuilder.java b/redisson/src/main/java/org/redisson/reactive/ReactiveProxyBuilder.java
index 14ab541..50845af 100644
--- a/redisson/src/main/java/org/redisson/reactive/ReactiveProxyBuilder.java
+++ b/redisson/src/main/java/org/redisson/reactive/ReactiveProxyBuilder.java
@@ -80,7 +80,8 @@
                     });
                 }
                 
-                if (instanceMethod.getDeclaringClass() == implementation.getClass()) {
+                if (implementation != null 
+                        && instanceMethod.getDeclaringClass() == implementation.getClass()) {
                     return instanceMethod.invoke(implementation, args);
                 }
                 
