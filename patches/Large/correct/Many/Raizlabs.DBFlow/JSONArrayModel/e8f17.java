diff --git a/library/src/main/java/com/grosner/dbflow/structure/container/JSONArrayModel.java b/library/src/main/java/com/grosner/dbflow/structure/container/JSONArrayModel.java
index 92cbc75..39058ef 100644
--- a/library/src/main/java/com/grosner/dbflow/structure/container/JSONArrayModel.java
+++ b/library/src/main/java/com/grosner/dbflow/structure/container/JSONArrayModel.java
@@ -137,7 +137,7 @@
             for (int i = 0; i < length; i++) {
                 try {
                     jsonModel.mData = mJsonArray.getJSONObject(i);
-                    jsonModel.update(async);
+                    jsonModel.insert(async);
                 } catch (JSONException e) {
                     FlowLog.logError(e);
                 }
