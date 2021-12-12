diff --git a/src/main/java/com/github/nkzawa/socketio/parser/Parser.java b/src/main/java/com/github/nkzawa/socketio/parser/Parser.java
index c4b7c78..26c63c8 100644
--- a/src/main/java/com/github/nkzawa/socketio/parser/Parser.java
+++ b/src/main/java/com/github/nkzawa/socketio/parser/Parser.java
@@ -11,7 +11,7 @@
 
 public class Parser {
 
-    private static final Logger logger = Logger.getLogger("socket.io-parser");
+    private static final Logger logger = Logger.getLogger(Parser.class.getName());
 
     private static final Gson gson = new Gson();
     private static final JsonParser parser = new JsonParser();
@@ -56,7 +56,7 @@
             str.append(gson.toJson(obj.data));
         }
 
-        logger.info(String.format("encoded %s as %s", obj, str));
+        logger.fine(String.format("encoded %s as %s", obj, str));
         return str.toString();
     }
 
@@ -121,7 +121,7 @@
             return error();
         }
 
-        logger.info(String.format("decoded %s as %s", str, p));
+        logger.fine(String.format("decoded %s as %s", str, p));
         return p;
     }
 
