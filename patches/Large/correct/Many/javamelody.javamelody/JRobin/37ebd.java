diff --git a/javamelody-core/src/main/java/net/bull/javamelody/JRobin.java b/javamelody-core/src/main/java/net/bull/javamelody/JRobin.java
index d57594e..a8487a1 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/JRobin.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/JRobin.java
@@ -138,8 +138,10 @@
 			throw new IOException("JavaMelody directory can't be created: "
 					+ rrdDirectory.getPath());
 		}
-		if (!rrdFile.exists()) {
-			// create RRD file since it does not exist
+		// cf issue 41: rrdFile could have been created with length 0 if out of disk space
+		// (fix IOException: Read failed, file xxx.rrd not mapped for I/O)
+		if (!rrdFile.exists() || rrdFile.length() == 0) {
+			// create RRD file since it does not exist (or is empty)
 			final RrdDef rrdDef = new RrdDef(rrdFileName, step);
 			// "startTime" décalé de "step" pour éviter que addValue appelée juste
 			// après ne lance l'exception suivante la première fois
