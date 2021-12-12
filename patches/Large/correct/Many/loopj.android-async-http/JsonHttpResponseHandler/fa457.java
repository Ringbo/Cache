diff --git a/src/com/loopj/android/http/JsonHttpResponseHandler.java b/src/com/loopj/android/http/JsonHttpResponseHandler.java
index e574691..4bd1ce1 100644
--- a/src/com/loopj/android/http/JsonHttpResponseHandler.java
+++ b/src/com/loopj/android/http/JsonHttpResponseHandler.java
@@ -101,7 +101,7 @@
         } else if(jsonResponse instanceof JSONArray) {
             onSuccess((JSONArray)jsonResponse);
         } else {
-            onFailure(new JSONException("Unexpected type " + jsonResponse.getClass().getName()));
+            onFailure(new JSONException("Unexpected type " + jsonResponse.getClass().getName()), (JSONObject)null);
         }
     }
 
