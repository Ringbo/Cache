diff --git a/src/main/java/com/thinkaurelius/faunus/mapreduce/FaunusCompiler.java b/src/main/java/com/thinkaurelius/faunus/mapreduce/FaunusCompiler.java
index f9de178..7f77361 100644
--- a/src/main/java/com/thinkaurelius/faunus/mapreduce/FaunusCompiler.java
+++ b/src/main/java/com/thinkaurelius/faunus/mapreduce/FaunusCompiler.java
@@ -211,7 +211,7 @@
             logger.warn("Using developer reference to target/" + Tokens.FAUNUS_JOB_JAR);
             hadoopFileJar = "../target/" + Tokens.FAUNUS_JOB_JAR;
         } else {
-            final String faunusHome = System.getProperty(Tokens.FAUNUS_HOME);
+            final String faunusHome = System.getenv(Tokens.FAUNUS_HOME);
             if (null == faunusHome || faunusHome.isEmpty())
                 throw new IllegalStateException("FAUNUS_HOME must be set in order to locate the Faunus Hadoop job jar: " + Tokens.FAUNUS_JOB_JAR);
             if (new File(faunusHome + "/lib/" + Tokens.FAUNUS_JOB_JAR).exists()) {
