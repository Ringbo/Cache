diff --git a/src/it/feio/android/omninotes/models/adapters/NavDrawerCategoryAdapter.java b/src/it/feio/android/omninotes/models/adapters/NavDrawerCategoryAdapter.java
index 4148047..ef061d2 100644
--- a/src/it/feio/android/omninotes/models/adapters/NavDrawerCategoryAdapter.java
+++ b/src/it/feio/android/omninotes/models/adapters/NavDrawerCategoryAdapter.java
@@ -78,20 +78,20 @@
 		// Finds elements
 		Category tag = tags.get(position);
 		
-		NoteDrawerTagAdapterViewHolder holder;
+		NoteDrawerCategoryAdapterViewHolder holder;
 	    if (convertView == null) {
 	    	convertView = inflater.inflate(layout, parent, false);
 
 			// Overrides font sizes with the one selected from user
 			Fonts.overrideTextSize(mActivity, mActivity.getSharedPreferences(Constants.PREFS_NAME, Context.MODE_MULTI_PROCESS), convertView);
 	    	
-	    	holder = new NoteDrawerTagAdapterViewHolder();
+	    	holder = new NoteDrawerCategoryAdapterViewHolder();
     		    	
 	    	holder.imgIcon = (ImageView) convertView.findViewById(R.id.icon);
 	    	holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
 	    	convertView.setTag(holder);
 	    } else {
-	        holder = (NoteDrawerTagAdapterViewHolder) convertView.getTag();
+	        holder = (NoteDrawerCategoryAdapterViewHolder) convertView.getTag();
 	    }
 	
 		// Set the results into TextViews	
