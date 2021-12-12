diff --git a/moco-runner/src/main/java/com/github/dreamhead/moco/parser/deserializer/LatencyContainerDeserializer.java b/moco-runner/src/main/java/com/github/dreamhead/moco/parser/deserializer/LatencyContainerDeserializer.java
index d66147d..0781f9f 100644
--- a/moco-runner/src/main/java/com/github/dreamhead/moco/parser/deserializer/LatencyContainerDeserializer.java
+++ b/moco-runner/src/main/java/com/github/dreamhead/moco/parser/deserializer/LatencyContainerDeserializer.java
@@ -26,7 +26,7 @@
             return LatencyContainer.latencyWithUnit(container.duration, TimeUnit.valueOf(container.unit.toUpperCase() + 'S'));
         }
 
-        throw ctxt.mappingException(TextContainer.class, currentToken);
+        throw ctxt.mappingException(LatencyContainer.class, currentToken);
     }
 
     private static class InternalLatencyContainer {
