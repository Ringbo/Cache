diff --git a/reactor-core/src/main/java/reactor/core/publisher/FluxWindowTimeOrSize.java b/reactor-core/src/main/java/reactor/core/publisher/FluxWindowTimeOrSize.java
index 56069d7..e558a77 100644
--- a/reactor-core/src/main/java/reactor/core/publisher/FluxWindowTimeOrSize.java
+++ b/reactor-core/src/main/java/reactor/core/publisher/FluxWindowTimeOrSize.java
@@ -235,7 +235,7 @@
 				return true;
 			}
 			catch (RejectedExecutionException ree) {
-				onError(Operators.onRejectedExecution(ree, this, null, null));
+				onError(Operators.onRejectedExecution(ree));
 				return false;
 			}
 		}
