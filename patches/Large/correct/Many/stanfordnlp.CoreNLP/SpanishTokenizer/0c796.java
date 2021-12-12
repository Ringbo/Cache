diff --git a/src/edu/stanford/nlp/international/spanish/process/SpanishTokenizer.java b/src/edu/stanford/nlp/international/spanish/process/SpanishTokenizer.java
index bda62b4..9ec7a15 100644
--- a/src/edu/stanford/nlp/international/spanish/process/SpanishTokenizer.java
+++ b/src/edu/stanford/nlp/international/spanish/process/SpanishTokenizer.java
@@ -149,7 +149,7 @@
 		case "contigo":
 		case "consigo":
 		default:
-			First = word.substring(0, 3);
+			first = word.substring(0, 3);
 			second = word.substring(3, 5);
 		}
    
