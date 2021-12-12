diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/agent/builder/AgentBuilder.java b/byte-buddy-dep/src/main/java/net/bytebuddy/agent/builder/AgentBuilder.java
index 4366719..c7c41ea 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/agent/builder/AgentBuilder.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/agent/builder/AgentBuilder.java
@@ -3893,7 +3893,7 @@
                     RedefinitionStrategy.DISABLED,
                     BootstrapInjectionStrategy.Disabled.INSTANCE,
                     LambdaInstrumentationStrategy.DISABLED,
-                    new RawMatcher.ForElementMatcherPair(isSynthetic(), none()),
+                    new RawMatcher.ForElementMatcherPair(isSynthetic(), any()),
                     Transformation.Ignored.INSTANCE);
         }
 
