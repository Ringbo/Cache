diff --git a/openephyra/src/info/ephyra/trec/OpenEphyraCorpus.java b/openephyra/src/info/ephyra/trec/OpenEphyraCorpus.java
index fcd34d3..2f023d0 100644
--- a/openephyra/src/info/ephyra/trec/OpenEphyraCorpus.java
+++ b/openephyra/src/info/ephyra/trec/OpenEphyraCorpus.java
@@ -65,7 +65,7 @@
 		Logger.enableLogging(true);
 		
 		// initialize Ephyra and start command line interface
-		(new OpenEphyraCorpus()).commandLine();
+		(new OpenEphyraCorpus()).commandLine("");
 	}
 	
 	/**
