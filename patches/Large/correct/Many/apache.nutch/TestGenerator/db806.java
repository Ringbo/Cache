diff --git a/src/test/org/apache/nutch/crawl/TestGenerator.java b/src/test/org/apache/nutch/crawl/TestGenerator.java
index 8972066..d889bdd 100644
--- a/src/test/org/apache/nutch/crawl/TestGenerator.java
+++ b/src/test/org/apache/nutch/crawl/TestGenerator.java
@@ -144,7 +144,7 @@
     createCrawlDB(list);
 
     Configuration myConfiguration = new Configuration(conf);
-    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 1);
+    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 2);
     Path generatedSegment = generateFetchlist(Integer.MAX_VALUE,
         myConfiguration, false);
 
@@ -157,7 +157,7 @@
     assertEquals(1, fetchList.size());
 
     myConfiguration = new Configuration(conf);
-    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 2);
+    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 3);
     generatedSegment = generateFetchlist(Integer.MAX_VALUE, myConfiguration,
         false);
 
@@ -170,7 +170,7 @@
     assertEquals(2, fetchList.size());
 
     myConfiguration = new Configuration(conf);
-    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 3);
+    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 4);
     generatedSegment = generateFetchlist(Integer.MAX_VALUE, myConfiguration,
         false);
 
@@ -198,7 +198,7 @@
     createCrawlDB(list);
 
     Configuration myConfiguration = new Configuration(conf);
-    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 1);
+    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 2);
     myConfiguration.set(Generator.GENERATOR_COUNT_MODE, Generator.GENERATOR_COUNT_VALUE_DOMAIN);
 
     Path generatedSegment = generateFetchlist(Integer.MAX_VALUE,
@@ -213,7 +213,7 @@
     assertEquals(1, fetchList.size());
 
     myConfiguration = new Configuration(myConfiguration);
-    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 2);
+    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 3);
     generatedSegment = generateFetchlist(Integer.MAX_VALUE, myConfiguration, false);
 
     fetchlistPath = new Path(new Path(generatedSegment,
@@ -225,7 +225,7 @@
     assertEquals(2, fetchList.size());
 
     myConfiguration = new Configuration(myConfiguration);
-    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 3);
+    myConfiguration.setInt(Generator.GENERATOR_MAX_COUNT, 4);
     generatedSegment = generateFetchlist(Integer.MAX_VALUE, myConfiguration,
         false);
 
