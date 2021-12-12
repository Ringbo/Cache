diff --git a/src/org/zaproxy/zap/extension/ascan/ChallengeCallbackAPI.java b/src/org/zaproxy/zap/extension/ascan/ChallengeCallbackAPI.java
index 98eebe5..bfae136 100644
--- a/src/org/zaproxy/zap/extension/ascan/ChallengeCallbackAPI.java
+++ b/src/org/zaproxy/zap/extension/ascan/ChallengeCallbackAPI.java
@@ -41,10 +41,10 @@
     private static final long CALLBACK_EXPIRE_TIME = 2 * 60 * 1000;
     
     // Internal logger
-    private static Logger logger = Logger.getLogger(ChallengeCallbackAPI.class);
+    private static final Logger logger = Logger.getLogger(ChallengeCallbackAPI.class);
     
     // The registered callbacks for this API
-    private TreeMap<String, RegisteredCallback> regCallbacks = new TreeMap();
+    private final TreeMap<String, RegisteredCallback> regCallbacks = new TreeMap();
 
     /**
      * Default contructor
@@ -106,8 +106,7 @@
 
     /**
      *
-     * @param name
-     * @param params
+     * @param msg
      * @return
      * @throws ApiException
      */
@@ -121,7 +120,7 @@
         try {
             String path = msg.getRequestHeader().getURI().getPath();            
             String challenge = path.substring(path.indexOf(getPrefix()) + getPrefix().length() + 1);
-            if (challenge.charAt(challenge.length()) == '/') {
+            if (challenge.charAt(challenge.length() - 1) == '/') {
                 challenge = challenge.substring(0, challenge.length() - 1);
             }
             
