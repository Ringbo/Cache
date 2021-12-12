diff --git a/client/src/main/java/org/asynchttpclient/oauth/Parameter.java b/client/src/main/java/org/asynchttpclient/oauth/Parameter.java
index c89eba8..bc4734e 100644
--- a/client/src/main/java/org/asynchttpclient/oauth/Parameter.java
+++ b/client/src/main/java/org/asynchttpclient/oauth/Parameter.java
@@ -20,7 +20,7 @@
 
   final String key, value;
 
-  Parameter(String key, String value) {
+  public Parameter(String key, String value) {
     this.key = key;
     this.value = value;
   }
