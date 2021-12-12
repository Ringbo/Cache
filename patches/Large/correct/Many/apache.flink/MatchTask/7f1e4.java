diff --git a/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/MatchTask.java b/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/MatchTask.java
index 2f52c80..cc048e2 100644
--- a/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/MatchTask.java
+++ b/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/MatchTask.java
@@ -131,7 +131,7 @@
 			break;
 		case HYBRIDHASH_SECOND:
 			this.matchIterator = new BuildSecondHashMatchIterator(this.inputs[0], this.inputs[1], 
-				keyPositions1, keyPositions2, keyClasses, memoryManager, ioManager, this, availableMemory);
+				keyPositions2, keyPositions1, keyClasses, memoryManager, ioManager, this, availableMemory);
 			break;
 		default:
 			throw new Exception("Unsupported local strategy for MatchTask: " + ls.name());
