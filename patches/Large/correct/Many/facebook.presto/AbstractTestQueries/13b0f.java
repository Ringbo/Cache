diff --git a/presto-main/src/test/java/com/facebook/presto/AbstractTestQueries.java b/presto-main/src/test/java/com/facebook/presto/AbstractTestQueries.java
index 70eafa2..6a75b89 100644
--- a/presto-main/src/test/java/com/facebook/presto/AbstractTestQueries.java
+++ b/presto-main/src/test/java/com/facebook/presto/AbstractTestQueries.java
@@ -1813,7 +1813,7 @@
         assertQuery("SELECT \"TOTALPRICE\" \"my price\" FROM \"ORDERS\"");
     }
 
-    @Test(expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = ".*orderkey_1.*")
+    @Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = ".*orderkey_1.*")
     public void testInvalidColumn()
             throws Exception
     {
@@ -2961,7 +2961,7 @@
                         MILLISECONDS.toSeconds(new DateTime(1970, 1, 1, 3, 4, 0, 0, DateTimeZone.UTC).getMillis()) + ",  " +
                         MILLISECONDS.toSeconds(new DateTime(1960, 1, 22, 3, 4, 0, 0, DateTimeZone.UTC).getMillis()) + ",  " +
                         MILLISECONDS.toSeconds(new DateTime(2013, 3, 22, 0, 0, 0, 0, DateTimeZone.UTC).getMillis()) + ",  " +
-                        String.valueOf(TimeUnit.DAYS.toSeconds(123)));
+                        TimeUnit.DAYS.toSeconds(123));
     }
 
     @Test
