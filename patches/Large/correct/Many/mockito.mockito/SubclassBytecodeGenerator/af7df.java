diff --git a/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java b/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
index ef13aaf..c3c5d33 100644
--- a/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
+++ b/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
@@ -57,7 +57,7 @@
                          .implement(new ArrayList<Type>(features.interfaces))
                          .method(matcher)
                            .intercept(to(DispatcherDefaultingToRealMethod.class))
-                           .transform(withModifiers(SynchronizationState.PLAIN))
+                           .transform(withModifiers(SynchronizationState.PLAIN, Visibility.PUBLIC))
                            .attribute(INCLUDING_RECEIVER)
                          .method(isHashCode())
                            .intercept(to(MockMethodInterceptor.ForHashCode.class))
