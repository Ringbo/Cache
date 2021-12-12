diff --git a/OsmAnd/src/net/osmand/plus/myplaces/SelectedGPXFragment.java b/OsmAnd/src/net/osmand/plus/myplaces/SelectedGPXFragment.java
index e3a497a..65e1592 100644
--- a/OsmAnd/src/net/osmand/plus/myplaces/SelectedGPXFragment.java
+++ b/OsmAnd/src/net/osmand/plus/myplaces/SelectedGPXFragment.java
@@ -271,7 +271,7 @@
 		
 		final TIntArrayList list = new TIntArrayList();
         final Spinner colorSpinner = (Spinner) view.findViewById(R.id.ColorSpinner);
-        ColorDialogs.setupColorSpinner(getActivity(), getGpx().getColor(0), colorSpinner, list);
+        ColorDialogs.setupColorSpinner(getActivity(), getGpx().getColor(), colorSpinner, list);
 		
 		
 		final Spinner sp = (Spinner) view.findViewById(R.id.Spinner);
