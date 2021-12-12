diff --git a/src/com/google/inject/DefaultConstructionProxyFactory.java b/src/com/google/inject/DefaultConstructionProxyFactory.java
index 6addfb4..bf04696 100644
--- a/src/com/google/inject/DefaultConstructionProxyFactory.java
+++ b/src/com/google/inject/DefaultConstructionProxyFactory.java
@@ -80,10 +80,10 @@
         return (T) fastConstructor.newInstance(arguments);
       }
       public List<Parameter<?>> getParameters() {
-        return Parameter.forConstructor(errorHandler, fastConstructor);
+        return Parameter.forConstructor(errorHandler, constructor);
       }
       public Member getMember() {
-        return fastConstructor.getJavaConstructor();
+        return constructor;
       }
     };
   }
