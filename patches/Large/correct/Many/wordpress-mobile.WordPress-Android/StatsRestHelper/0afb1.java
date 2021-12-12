diff --git a/src/org/wordpress/android/util/StatsRestHelper.java b/src/org/wordpress/android/util/StatsRestHelper.java
index b62b4b5..dab224f 100644
--- a/src/org/wordpress/android/util/StatsRestHelper.java
+++ b/src/org/wordpress/android/util/StatsRestHelper.java
@@ -972,7 +972,7 @@
                     public void onErrorResponse(VolleyError error) {
                         if (callback != null)
                             callback.onFailure(error);
-                        Log.e(TAG, "Stats: Failed to get summary");
+                        Log.e(TAG, "Stats: Failed to get summary", error);
                     }
                 });
     }
