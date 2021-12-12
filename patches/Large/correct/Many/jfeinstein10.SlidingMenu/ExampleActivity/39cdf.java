diff --git a/example/src/com/slidingmenu/example/ExampleActivity.java b/example/src/com/slidingmenu/example/ExampleActivity.java
index 8329f10..cadbc7b 100644
--- a/example/src/com/slidingmenu/example/ExampleActivity.java
+++ b/example/src/com/slidingmenu/example/ExampleActivity.java
@@ -35,7 +35,7 @@
 		// set the Behind View
 		setBehindContentView(R.layout.frame);
 		FragmentTransaction t = this.getFragmentManager().beginTransaction();
-		t.add(R.id.frame, new SampleListFragment());
+		t.replace(R.id.frame, new SampleListFragment());
 		t.commit();
 
 		// customize the SlidingMenu
