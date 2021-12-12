diff --git a/src/org/zaproxy/zap/spider/parser/SpiderODataAtomParser.java b/src/org/zaproxy/zap/spider/parser/SpiderODataAtomParser.java
index 0bc17d9..2766a05 100644
--- a/src/org/zaproxy/zap/spider/parser/SpiderODataAtomParser.java
+++ b/src/org/zaproxy/zap/spider/parser/SpiderODataAtomParser.java
@@ -68,8 +68,8 @@
 			processURL(message, depth, s,baseURL);
 		}
 		
-		// We don't consider the resource consumed, as there might be other files processing it
-		return false;
+		// resource consumed is consumed
+		return true;
 	}
 
 
