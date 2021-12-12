diff --git a/app/src/processing/mode/javascript/JavaScriptMode.java b/app/src/processing/mode/javascript/JavaScriptMode.java
index 439e2bc..3a71cbe 100644
--- a/app/src/processing/mode/javascript/JavaScriptMode.java
+++ b/app/src/processing/mode/javascript/JavaScriptMode.java
@@ -43,8 +43,7 @@
 		try {
 			loadKeywords(); // in JavaMode, sets tokenMarker
 			loadAdditionalKeywords( 
-				new File( base.getContentFile("modes/java"), 
-						  "keywords.txt" ),
+				new File(Base.getContentFile("modes/java"), "keywords.txt" ),
 				tokenMarker
 			);
 		} 
