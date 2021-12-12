diff --git a/roboguice/src/main/java/roboguice/inject/ViewListener.java b/roboguice/src/main/java/roboguice/inject/ViewListener.java
index fbabc5c..018a573 100644
--- a/roboguice/src/main/java/roboguice/inject/ViewListener.java
+++ b/roboguice/src/main/java/roboguice/inject/ViewListener.java
@@ -175,7 +175,7 @@
                 final int id = injectView.value();
 
                 if( id>=0 )
-                    view = fragUtils != null && fragUtils.getClass().isInstance(activityOrFragment) ? (fragUtils.getView(activityOrFragment)).findViewById(id) : ((Activity)activityOrFragment).findViewById(id);
+                    view = fragUtils != null && fragUtils.fragmentType().isInstance(activityOrFragment) ? (fragUtils.getView(activityOrFragment)).findViewById(id) : ((Activity)activityOrFragment).findViewById(id);
 
                 else
                     view = fragUtils !=null && fragUtils.fragmentType().isInstance(activityOrFragment) ? (fragUtils.getView(activityOrFragment)).findViewWithTag(injectView.tag()) : ((Activity)activityOrFragment).getWindow().getDecorView().findViewWithTag(injectView.tag());
