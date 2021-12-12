diff --git a/drools-core/src/main/java/org/drools/rule/builder/dialect/asm/GeneratorHelper.java b/drools-core/src/main/java/org/drools/rule/builder/dialect/asm/GeneratorHelper.java
index 2d25c9a..1fc69bb 100644
--- a/drools-core/src/main/java/org/drools/rule/builder/dialect/asm/GeneratorHelper.java
+++ b/drools-core/src/main/java/org/drools/rule/builder/dialect/asm/GeneratorHelper.java
@@ -112,7 +112,7 @@
         return createInvokerClassGenerator(className, stub, classLoader, getTypeResolver(stub, workingMemory, classLoader));
     }
 
-    static ClassGenerator createInvokerClassGenerator(final String className,
+    public static ClassGenerator createInvokerClassGenerator(final String className,
                                                               final InvokerDataProvider data,
                                                               final CompositeClassLoader classLoader,
                                                               final TypeResolver typeResolver) {
