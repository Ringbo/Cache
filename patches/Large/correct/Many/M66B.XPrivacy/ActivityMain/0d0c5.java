diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index d3d0ba6..1fc4518 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -1544,7 +1544,7 @@
 			public ImageView imgCbRestricted;
 			public ProgressBar pbRunning;
 			public TextView tvOnDemand;
-			public RelativeLayout rlName;
+			public LinearLayout llName;
 
 			public ViewHolder(View theRow, int thePosition) {
 				row = theRow;
@@ -1560,7 +1560,7 @@
 				imgCbRestricted = (ImageView) row.findViewById(R.id.imgCbRestricted);
 				pbRunning = (ProgressBar) row.findViewById(R.id.pbRunning);
 				tvOnDemand = (TextView) row.findViewById(R.id.tvOnDemand);
-				rlName = (RelativeLayout) row.findViewById(R.id.rlName);
+				llName = (LinearLayout) row.findViewById(R.id.llName);
 			}
 		}
 
@@ -1663,7 +1663,7 @@
 					// Display enabled state
 					holder.tvName.setEnabled(enabled);
 					holder.imgCbRestricted.setEnabled(enabled);
-					holder.rlName.setEnabled(enabled);
+					holder.llName.setEnabled(enabled);
 
 					// Display selection
 					if (mListAppSelected.contains(xAppInfo))
@@ -1672,7 +1672,7 @@
 						holder.row.setBackgroundColor(Color.TRANSPARENT);
 
 					// Listen for multiple select
-					holder.rlName.setOnLongClickListener(new View.OnLongClickListener() {
+					holder.llName.setOnLongClickListener(new View.OnLongClickListener() {
 						@Override
 						public boolean onLongClick(View view) {
 							if (mListAppSelected.contains(xAppInfo)) {
@@ -1690,7 +1690,7 @@
 					});
 
 					// Listen for restriction changes
-					holder.rlName.setOnClickListener(new View.OnClickListener() {
+					holder.llName.setOnClickListener(new View.OnClickListener() {
 						@Override
 						public void onClick(final View view) {
 							if (mSelecting) {
@@ -1868,7 +1868,7 @@
 			holder.tvOnDemand.setVisibility(View.INVISIBLE);
 			holder.tvName.setEnabled(false);
 			holder.imgCbRestricted.setEnabled(false);
-			holder.rlName.setEnabled(false);
+			holder.llName.setEnabled(false);
 
 			// Async update
 			new HolderTask(position, holder, xAppInfo).executeOnExecutor(mExecutor, (Object) null);
