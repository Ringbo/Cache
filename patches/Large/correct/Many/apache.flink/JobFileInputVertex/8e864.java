diff --git a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/JobFileInputVertex.java b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/JobFileInputVertex.java
index 909a910..0224cc9 100644
--- a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/JobFileInputVertex.java
+++ b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/JobFileInputVertex.java
@@ -275,7 +275,7 @@
 		}
 
 		final int numSubtasks = getNumberOfSubtasks();
-		final List<FileInputSplit> inputSplits = new ArrayList<FileInputSplit>(numSubtasks);
+		final List<FileInputSplit> inputSplits = new ArrayList<FileInputSplit>();
 
 		// get all the files that are involved in the splits
 		List<FileStatus> files = new ArrayList<FileStatus>();
@@ -301,7 +301,7 @@
 			}
 
 			final long minSplitSize = 1;
-			final long maxSplitSize = totalLength / numSubtasks + (totalLength % numSubtasks == 0 ? 0 : 1);
+			final long maxSplitSize = (numSubtasks < 1) ? Long.MAX_VALUE : (totalLength / numSubtasks + (totalLength % numSubtasks == 0 ? 0 : 1));
 
 			// now that we have the files, generate the splits
 			for (FileStatus file : files) {
