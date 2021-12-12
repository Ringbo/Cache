diff --git a/src/java/org/codehaus/groovy/grails/web/json/JSONObject.java b/src/java/org/codehaus/groovy/grails/web/json/JSONObject.java
index ab74754..786f2af 100644
--- a/src/java/org/codehaus/groovy/grails/web/json/JSONObject.java
+++ b/src/java/org/codehaus/groovy/grails/web/json/JSONObject.java
@@ -1162,11 +1162,11 @@
     }
 
     public boolean containsKey(Object o) {
-        return false;
+        return myHashMap.containsKey(o);
     }
 
     public boolean containsValue(Object o) {
-        return this.myHashMap.containsKey(o);
+        return this.myHashMap.containsValue(o);
     }
 
     public Object get(Object o) {
