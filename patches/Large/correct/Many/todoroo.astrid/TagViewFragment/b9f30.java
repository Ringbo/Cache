diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewFragment.java b/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewFragment.java
index 0fa07c9..e563189 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewFragment.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/TagViewFragment.java
@@ -507,7 +507,7 @@
             ((FilterWithCustomIntent)newFilter).customTaskList =
                 new ComponentName(getActivity(), TagViewFragment.class);
 
-        ((AstridActivity)getActivity()).setupTasklistFragmentWithFilter(newFilter);
+        ((AstridActivity)getActivity()).onFilterItemClicked(newFilter);
     }
 
     @Override
