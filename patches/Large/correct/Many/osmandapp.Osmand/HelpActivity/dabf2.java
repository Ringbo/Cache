diff --git a/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java b/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
index 11a2b27..10af54f 100644
--- a/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
@@ -415,7 +415,7 @@
 			this.icon = icon;
 			this.title = name;
 			this.description = description;
-			this.onClickListener = new ShowArticleOnTouchListener(name, activity, helpFileName);
+			this.onClickListener = new ShowArticleOnTouchListener(helpFileName, activity, title);
 		}
 		
 		public HelpMenuItem(int name, int description, int icon, String helpFileName,
@@ -423,7 +423,7 @@
 			this.title = activity.getString(name);
 			this.description = description == -1 ? null : activity.getString(description);
 			this.icon = icon;
-			this.onClickListener = new ShowArticleOnTouchListener(title, activity, helpFileName);
+			this.onClickListener = new ShowArticleOnTouchListener(helpFileName,  activity, title);
 		}
 
 		public HelpMenuItem(String name, String description, OnClickListener onClickListener) {
