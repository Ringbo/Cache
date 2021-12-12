diff --git a/enterprise/src/test/java/org/graylog/plugins/enterprise/database/PaginatedDbServiceTest.java b/enterprise/src/test/java/org/graylog/plugins/enterprise/database/PaginatedDbServiceTest.java
index 233d696..c468cdc 100644
--- a/enterprise/src/test/java/org/graylog/plugins/enterprise/database/PaginatedDbServiceTest.java
+++ b/enterprise/src/test/java/org/graylog/plugins/enterprise/database/PaginatedDbServiceTest.java
@@ -167,7 +167,7 @@
         final PaginatedList<TestDTO> page1 = dbService.findPaginatedWithQueryFilterAndSort(DBQuery.empty(), filter, DBSort.asc("title"), 1, 2);
 
         assertThat(page1.pagination().getCount()).isEqualTo(2);
-        assertThat(page1.pagination().getGlobalTotal()).isEqualTo(7);
+        assertThat(page1.pagination().getGlobalTotal()).isEqualTo(5);
         assertThat(page1.delegate())
                 .extracting("title")
                 .containsExactly("hello2", "hello3");
@@ -175,7 +175,7 @@
         final PaginatedList<TestDTO> page2 = dbService.findPaginatedWithQueryFilterAndSort(DBQuery.empty(), filter, DBSort.asc("title"), 2, 2);
 
         assertThat(page2.pagination().getCount()).isEqualTo(2);
-        assertThat(page2.pagination().getGlobalTotal()).isEqualTo(7);
+        assertThat(page2.pagination().getGlobalTotal()).isEqualTo(5);
         assertThat(page2.delegate())
                 .extracting("title")
                 .containsExactly("hello4", "hello5");
@@ -183,7 +183,7 @@
         final PaginatedList<TestDTO> page3 = dbService.findPaginatedWithQueryFilterAndSort(DBQuery.empty(), filter, DBSort.asc("title"), 3, 2);
 
         assertThat(page3.pagination().getCount()).isEqualTo(1);
-        assertThat(page3.pagination().getGlobalTotal()).isEqualTo(7);
+        assertThat(page3.pagination().getGlobalTotal()).isEqualTo(5);
         assertThat(page3.delegate())
                 .extracting("title")
                 .containsExactly("hello6");
@@ -191,7 +191,7 @@
         final PaginatedList<TestDTO> page4 = dbService.findPaginatedWithQueryFilterAndSort(DBQuery.empty(), filter, DBSort.asc("title"), 2, 4);
 
         assertThat(page4.pagination().getCount()).isEqualTo(1);
-        assertThat(page4.pagination().getGlobalTotal()).isEqualTo(7);
+        assertThat(page4.pagination().getGlobalTotal()).isEqualTo(5);
         assertThat(page4.delegate())
                 .extracting("title")
                 .containsExactly("hello6");
@@ -199,7 +199,7 @@
         final PaginatedList<TestDTO> page1reverse = dbService.findPaginatedWithQueryFilterAndSort(DBQuery.empty(), filter, DBSort.desc("title"), 1, 2);
 
         assertThat(page1reverse.pagination().getCount()).isEqualTo(2);
-        assertThat(page1reverse.pagination().getGlobalTotal()).isEqualTo(7);
+        assertThat(page1reverse.pagination().getGlobalTotal()).isEqualTo(5);
         assertThat(page1reverse.delegate())
                 .extracting("title")
                 .containsExactly("hello6", "hello5");
