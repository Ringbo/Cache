diff --git a/OsmAnd/src/net/osmand/plus/myplaces/AvailableGPXFragment.java b/OsmAnd/src/net/osmand/plus/myplaces/AvailableGPXFragment.java
index 05c658e..3fbf929 100644
--- a/OsmAnd/src/net/osmand/plus/myplaces/AvailableGPXFragment.java
+++ b/OsmAnd/src/net/osmand/plus/myplaces/AvailableGPXFragment.java
@@ -187,7 +187,7 @@
 				allGpxAdapter.notifyDataSetChanged();
 			}
 			asyncProcessor = new ProcessGpxTask();
-			asyncProcessor.execute();
+			asyncProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
 		}
 		updateCurrentTrack();
 
