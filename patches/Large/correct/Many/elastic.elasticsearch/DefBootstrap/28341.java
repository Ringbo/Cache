diff --git a/modules/lang-painless/src/main/java/org/elasticsearch/painless/DefBootstrap.java b/modules/lang-painless/src/main/java/org/elasticsearch/painless/DefBootstrap.java
index 312f4dd..55948d9 100644
--- a/modules/lang-painless/src/main/java/org/elasticsearch/painless/DefBootstrap.java
+++ b/modules/lang-painless/src/main/java/org/elasticsearch/painless/DefBootstrap.java
@@ -169,7 +169,7 @@
                 };
                 MethodHandle cacheLookup = MEGAMORPHIC_LOOKUP.bindTo(megamorphicCache);
                 cacheLookup = MethodHandles.dropArguments(cacheLookup,
-                        0, type.parameterList().subList(1, type.parameterCount()));
+                        1, type.parameterList().subList(1, type.parameterCount()));
                 MethodHandle target = MethodHandles.foldArguments(MethodHandles.exactInvoker(type), cacheLookup);
                 setTarget(target);
                 return target.invokeWithArguments(callArgs);                    
