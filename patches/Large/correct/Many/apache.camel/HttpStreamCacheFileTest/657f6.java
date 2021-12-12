diff --git a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/HttpStreamCacheFileTest.java b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/HttpStreamCacheFileTest.java
index 88f42c1..98aaf8d 100644
--- a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/HttpStreamCacheFileTest.java
+++ b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/HttpStreamCacheFileTest.java
@@ -51,7 +51,7 @@
         // the temporary files should have been deleted
         File file = new File("./target/cachedir");
         String[] files = file.list();
-        assertEquals("There should be no files", files.length, 0);
+        assertEquals("There should be no files", 0, files.length);
     }
 
     @Test
@@ -68,7 +68,7 @@
         // the temporary files should have been deleted
         File file = new File("./target/cachedir");
         String[] files = file.list();
-        assertEquals("There should be no files", files.length, 0);
+        assertEquals("There should be no files", 0, files.length);
     }
 
     @Override
