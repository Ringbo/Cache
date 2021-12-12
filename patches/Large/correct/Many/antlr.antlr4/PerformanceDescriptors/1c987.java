diff --git a/runtime-testsuite/test/org/antlr/v4/test/runtime/descriptors/PerformanceDescriptors.java b/runtime-testsuite/test/org/antlr/v4/test/runtime/descriptors/PerformanceDescriptors.java
index cec4c94..ac00eb8 100644
--- a/runtime-testsuite/test/org/antlr/v4/test/runtime/descriptors/PerformanceDescriptors.java
+++ b/runtime-testsuite/test/org/antlr/v4/test/runtime/descriptors/PerformanceDescriptors.java
@@ -113,7 +113,7 @@
 
 		@Override
 		public boolean ignore(String targetName) {
-			return !Arrays.asList("Java", "CSharp", "Python2", "Python3", "Node").contains(targetName);
+			return !Arrays.asList("Java", "CSharp", "Python2", "Python3", "Node", "Cpp").contains(targetName);
 		}
 	}
 
@@ -199,7 +199,7 @@
 		@Override
 		public boolean ignore(String targetName) {
 			// passes, but still too slow in Python and JavaScript
-			return !Arrays.asList("Java", "CSharp").contains(targetName);
+			return !Arrays.asList("Java", "CSharp", "Cpp").contains(targetName);
 		}
 	}
 
