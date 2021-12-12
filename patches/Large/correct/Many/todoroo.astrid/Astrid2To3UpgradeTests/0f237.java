diff --git a/tests/src/com/todoroo/astrid/upgrade/Astrid2To3UpgradeTests.java b/tests/src/com/todoroo/astrid/upgrade/Astrid2To3UpgradeTests.java
index 3043d55..80134be 100644
--- a/tests/src/com/todoroo/astrid/upgrade/Astrid2To3UpgradeTests.java
+++ b/tests/src/com/todoroo/astrid/upgrade/Astrid2To3UpgradeTests.java
@@ -270,7 +270,7 @@
         database.openForReading();
         TagService tagService = TagService.getInstance();
         Tag[] tags = tagService.getGroupedTags(TagService.GROUPED_TAGS_BY_ALPHA,
-                TaskCriteria.isActive());
+                TaskCriteria.isActive(), true);
         assertEquals(2, tags.length);
         assertEquals("salty", tags[0].tag);
         assertEquals("tasty", tags[1].tag);
@@ -280,13 +280,13 @@
         assertEquals(3, tasks.getCount());
         tasks.moveToFirst();
         Task task = new Task(tasks);
-        assertEquals("tasty, salty", tagService.getTagsAsString(task.getId()));
+        assertEquals("tasty, salty", tagService.getTagsAsString(task.getId(), true));
         tasks.moveToNext();
         task.readFromCursor(tasks);
-        assertEquals("tasty", tagService.getTagsAsString(task.getId()));
+        assertEquals("tasty", tagService.getTagsAsString(task.getId(), true));
         tasks.moveToNext();
         task.readFromCursor(tasks);
-        assertEquals("", tagService.getTagsAsString(task.getId()));
+        assertEquals("", tagService.getTagsAsString(task.getId(), true));
     }
 
     /**
@@ -325,7 +325,7 @@
         database.openForReading();
         TagService tagService = TagService.getInstance();
         Tag[] tags = tagService.getGroupedTags(TagService.GROUPED_TAGS_BY_ALPHA,
-                TaskCriteria.isActive());
+                TaskCriteria.isActive(), true);
         assertEquals(1, tags.length);
         assertEquals("attached", tags[0].tag);
 
@@ -334,10 +334,10 @@
         assertEquals(2, tasks.getCount());
         tasks.moveToFirst();
         Task task = new Task(tasks);
-        assertEquals("attached", tagService.getTagsAsString(task.getId()));
+        assertEquals("attached", tagService.getTagsAsString(task.getId(), true));
         tasks.moveToNext();
         task.readFromCursor(tasks);
-        assertEquals("", tagService.getTagsAsString(task.getId()));
+        assertEquals("", tagService.getTagsAsString(task.getId(), true));
     }
 
     /**
