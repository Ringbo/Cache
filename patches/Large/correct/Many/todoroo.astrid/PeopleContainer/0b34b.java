diff --git a/astrid/src/com/todoroo/astrid/ui/PeopleContainer.java b/astrid/src/com/todoroo/astrid/ui/PeopleContainer.java
index 5de4d2c..2c0df68 100644
--- a/astrid/src/com/todoroo/astrid/ui/PeopleContainer.java
+++ b/astrid/src/com/todoroo/astrid/ui/PeopleContainer.java
@@ -185,7 +185,7 @@
             if(text.length() == 0)
                 continue;
 
-            if(text.indexOf('@') == -1)
+            if(text.indexOf('@') == -1 && textView.isEnabled())
                 throw new ParseSharedException(textView,
                         activity.getString(R.string.actfm_EPA_invalid_email, text));
             if (peopleAsJSON) {
