diff --git a/client/src/main/java/org/asynchttpclient/oauth/Parameters.java b/client/src/main/java/org/asynchttpclient/oauth/Parameters.java
index e82829f..b0c533a 100644
--- a/client/src/main/java/org/asynchttpclient/oauth/Parameters.java
+++ b/client/src/main/java/org/asynchttpclient/oauth/Parameters.java
@@ -19,16 +19,16 @@
 import java.util.Collections;
 import java.util.List;
 
-class Parameters {
+final class Parameters {
 
   private List<Parameter> parameters = new ArrayList<>();
 
-  Parameters add(String key, String value) {
+  public Parameters add(String key, String value) {
     parameters.add(new Parameter(key, value));
     return this;
   }
 
-  void reset() {
+  public void reset() {
     parameters.clear();
   }
 
