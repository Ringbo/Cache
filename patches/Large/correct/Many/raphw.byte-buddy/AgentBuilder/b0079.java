diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/agent/builder/AgentBuilder.java b/byte-buddy-dep/src/main/java/net/bytebuddy/agent/builder/AgentBuilder.java
index e5fdd06..cc6b6aa 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/agent/builder/AgentBuilder.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/agent/builder/AgentBuilder.java
@@ -1228,7 +1228,7 @@
                                     binaryLocator.classFileLocator(entry.getType().getClassLoader()),
                                     typeStrategy,
                                     byteBuddy,
-                                    nativeMethodStrategy.resolve(),
+                                    nativeMethodStrategy,
                                     bootstrapInjectionStrategy,
                                     accessControlContext,
                                     listener));
@@ -1291,7 +1291,7 @@
                      * @param classFileLocator           The class file locator to use.
                      * @param typeStrategy               The type strategy to use.
                      * @param byteBuddy                  The Byte Buddy configuration to use.
-                     * @param methodNameTransformer      The method name transformer to use.
+                     * @param nativeMethodStrategy       The native method strategy to use.
                      * @param bootstrapInjectionStrategy The bootstrap injection strategy to use.
                      * @param accessControlContext       The access control context to use.
                      * @param listener                   The listener to report to.
@@ -1301,7 +1301,7 @@
                                                       ClassFileLocator classFileLocator,
                                                       TypeStrategy typeStrategy,
                                                       ByteBuddy byteBuddy,
-                                                      MethodRebaseResolver.MethodNameTransformer methodNameTransformer,
+                                                      Default.NativeMethodStrategy nativeMethodStrategy,
                                                       Default.BootstrapInjectionStrategy bootstrapInjectionStrategy,
                                                       AccessControlContext accessControlContext,
                                                       Listener listener) {
@@ -1309,7 +1309,7 @@
                                 classFileLocator,
                                 typeStrategy,
                                 byteBuddy,
-                                methodNameTransformer,
+                                nativeMethodStrategy,
                                 bootstrapInjectionStrategy,
                                 accessControlContext,
                                 listener));
@@ -2099,7 +2099,7 @@
                              ClassFileLocator classFileLocator,
                              TypeStrategy typeStrategy,
                              ByteBuddy byteBuddy,
-                             MethodRebaseResolver.MethodNameTransformer methodNameTransformer,
+                             NativeMethodStrategy methodNameTransformer,
                              BootstrapInjectionStrategy bootstrapInjectionStrategy,
                              AccessControlContext accessControlContext,
                              Listener listener);
@@ -2133,7 +2133,7 @@
                                         ClassFileLocator classFileLocator,
                                         TypeStrategy typeStrategy,
                                         ByteBuddy byteBuddy,
-                                        MethodRebaseResolver.MethodNameTransformer methodNameTransformer,
+                                        NativeMethodStrategy methodNameTransformer,
                                         BootstrapInjectionStrategy bootstrapInjectionStrategy,
                                         AccessControlContext accessControlContext,
                                         Listener listener) {
@@ -2296,12 +2296,12 @@
                                         ClassFileLocator classFileLocator,
                                         TypeStrategy typeStrategy,
                                         ByteBuddy byteBuddy,
-                                        MethodRebaseResolver.MethodNameTransformer methodNameTransformer,
+                                        NativeMethodStrategy methodNameTransformer,
                                         BootstrapInjectionStrategy bootstrapInjectionStrategy,
                                         AccessControlContext accessControlContext,
                                         Listener listener) {
                         DynamicType.Unloaded<?> dynamicType = initializationStrategy.apply(transformer.transform(typeStrategy.builder(typeDescription,
-                                byteBuddy, classFileLocator, methodNameTransformer), typeDescription)).make();
+                                byteBuddy, classFileLocator, methodNameTransformer.resolve()), typeDescription)).make();
                         Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                         if (loadedTypeInitializers.size() > 1) { // There exist auxiliary classes.
                             ClassInjector classInjector = classLoader == null
@@ -2514,7 +2514,7 @@
                             classFileLocator,
                             typeStrategy,
                             byteBuddy,
-                            nativeMethodStrategy.resolve(),
+                            nativeMethodStrategy,
                             bootstrapInjectionStrategy,
                             accessControlContext,
                             listener);
