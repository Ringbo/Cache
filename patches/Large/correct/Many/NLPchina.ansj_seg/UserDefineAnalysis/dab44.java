diff --git a/src/main/java/org/ansj/splitWord/analysis/UserDefineAnalysis.java b/src/main/java/org/ansj/splitWord/analysis/UserDefineAnalysis.java
index 46cd4cd..cffdbc8 100644
--- a/src/main/java/org/ansj/splitWord/analysis/UserDefineAnalysis.java
+++ b/src/main/java/org/ansj/splitWord/analysis/UserDefineAnalysis.java
@@ -74,7 +74,7 @@
 				}
 				setRealName(graph, result);
 
-				FilterModifWord.modifResult(result);
+				FilterModifWord.modifResult(result,forests);
 				return result;
 			}
 		};
