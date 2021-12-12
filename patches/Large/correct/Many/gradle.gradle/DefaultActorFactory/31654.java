diff --git a/subprojects/messaging/src/main/java/org/gradle/internal/actor/internal/DefaultActorFactory.java b/subprojects/messaging/src/main/java/org/gradle/internal/actor/internal/DefaultActorFactory.java
index 6452d15..2396fd8 100644
--- a/subprojects/messaging/src/main/java/org/gradle/internal/actor/internal/DefaultActorFactory.java
+++ b/subprojects/messaging/src/main/java/org/gradle/internal/actor/internal/DefaultActorFactory.java
@@ -135,7 +135,7 @@
             dispatch = new AsyncDispatch<MethodInvocation>(executor,
                     new FailureHandlingDispatch<MethodInvocation>(
                             new ReflectionDispatch(targetObject),
-                            failureHandler));
+                            failureHandler), Integer.MAX_VALUE);
         }
 
         public <T> T getProxy(Class<T> type) {
