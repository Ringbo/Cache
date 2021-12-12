diff --git a/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java b/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
index e68c599..b63e5d0 100644
--- a/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
+++ b/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
@@ -71,7 +71,7 @@
                          .implement(new ArrayList<Type>(features.interfaces))
                          .method(matcher)
                            .intercept(to(DispatcherDefaultingToRealMethod.class))
-                           .transform(withModifiers(SynchronizationState.PLAIN, Visibility.PUBLIC))
+                           .transform(withModifiers(SynchronizationState.PLAIN))
                            .attribute(INCLUDING_RECEIVER)
                          .method(isHashCode())
                            .intercept(to(MockMethodInterceptor.ForHashCode.class))
