diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
index 9f24229..3a1dd30 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmInvoker.java
@@ -110,7 +110,7 @@
             Log.e("act-fm-invoke-response", response);
             JSONObject object = new JSONObject(response);
             if(object.getString("status").equals("error"))
-                throw new ActFmServiceException(object.getString("message"));
+                throw new ActFmServiceException(object.getString("message"), object);
             return object;
         } catch (JSONException e) {
             throw new IOException(e.getMessage());
@@ -139,7 +139,7 @@
             Log.e("act-fm-post-response", response);
             JSONObject object = new JSONObject(response);
             if(object.getString("status").equals("error"))
-                throw new ActFmServiceException(object.getString("message"));
+                throw new ActFmServiceException(object.getString("message"), object);
             return object;
         } catch (JSONException e) {
             throw new IOException(e.getMessage());
