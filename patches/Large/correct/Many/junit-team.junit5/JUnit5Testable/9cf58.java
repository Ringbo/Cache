diff --git a/junit5-engine/src/main/java/org/junit/gen5/engine/junit5/discovery/JUnit5Testable.java b/junit5-engine/src/main/java/org/junit/gen5/engine/junit5/discovery/JUnit5Testable.java
index f8f5490..7349e76 100644
--- a/junit5-engine/src/main/java/org/junit/gen5/engine/junit5/discovery/JUnit5Testable.java
+++ b/junit5-engine/src/main/java/org/junit/gen5/engine/junit5/discovery/JUnit5Testable.java
@@ -27,7 +27,7 @@
 
 	@Deprecated
 	static JUnit5Testable fromUniqueId(String uniqueId, String engineId) {
-		return fromUniqueId(UniqueId.parse(uniqueId), UniqueId.forEngine("engine", engineId));
+		return fromUniqueId(UniqueId.parse(uniqueId), UniqueId.forEngine(engineId));
 	}
 
 	static JUnit5Testable fromUniqueId(UniqueId uniqueId, UniqueId engineId) {
