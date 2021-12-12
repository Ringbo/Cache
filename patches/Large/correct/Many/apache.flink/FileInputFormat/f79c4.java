diff --git a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/io/FileInputFormat.java b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/io/FileInputFormat.java
index 4b47514..e47039e 100644
--- a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/io/FileInputFormat.java
+++ b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/io/FileInputFormat.java
@@ -478,9 +478,9 @@
 		
 		private final long timeout;
 
-		private FSDataInputStream fdis = null;
+		private volatile FSDataInputStream fdis = null;
 
-		private Throwable error = null;
+		private volatile Throwable error = null;
 
 		public InputSplitOpenThread(FileInputSplit split, long timeout)
 		{
@@ -527,7 +527,7 @@
 			}
 			
 			// try to forcefully shut this thread down
-			throw new IOException("OPening request timed out.");
+			throw new IOException("Opening request timed out.");
 		}
 
 		public FSDataInputStream getFSDataInputStream() {
