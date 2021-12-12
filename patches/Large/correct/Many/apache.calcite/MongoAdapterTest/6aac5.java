diff --git a/mongodb/src/test/java/org/apache/calcite/adapter/mongodb/MongoAdapterTest.java b/mongodb/src/test/java/org/apache/calcite/adapter/mongodb/MongoAdapterTest.java
index a4061e4..00daf53 100644
--- a/mongodb/src/test/java/org/apache/calcite/adapter/mongodb/MongoAdapterTest.java
+++ b/mongodb/src/test/java/org/apache/calcite/adapter/mongodb/MongoAdapterTest.java
@@ -166,9 +166,9 @@
     assertModel(MODEL)
             .query("select state, id from zips\n"
                     + "order by state, id offset 2 rows fetch next 3 rows only")
-            .returns("STATE=AK; ID=99801\n"
-                    + "STATE=AL; ID=35215\n"
-                    + "STATE=AL; ID=35401\n")
+            .returnsOrdered("STATE=AK; ID=99801",
+                    "STATE=AL; ID=35215",
+                    "STATE=AL; ID=35401")
             .queryContains(
                     mongoChecker(
                             "{$project: {STATE: '$state', ID: '$_id'}}",
@@ -239,10 +239,11 @@
                     + "where pop BETWEEN 45000 AND 46000\n"
                     + "order by state desc, pop")
             .limit(4)
-            .returns("CITY=BECKLEY; LONGITUDE=null; LATITUDE=null; POP=45196; STATE=WV; ID=25801\n"
-                    + "CITY=ROCKERVILLE; LONGITUDE=null; LATITUDE=null; POP=45328; STATE=SD; ID=57701\n"
-                    + "CITY=PAWTUCKET; LONGITUDE=null; LATITUDE=null; POP=45442; STATE=RI; ID=02860\n"
-                    + "CITY=LAWTON; LONGITUDE=null; LATITUDE=null; POP=45542; STATE=OK; ID=73505\n");
+            .returnsOrdered(
+                  "CITY=BECKLEY; LONGITUDE=null; LATITUDE=null; POP=45196; STATE=WV; ID=25801",
+                  "CITY=ROCKERVILLE; LONGITUDE=null; LATITUDE=null; POP=45328; STATE=SD; ID=57701",
+                  "CITY=PAWTUCKET; LONGITUDE=null; LATITUDE=null; POP=45442; STATE=RI; ID=02860",
+                  "CITY=LAWTON; LONGITUDE=null; LATITUDE=null; POP=45542; STATE=OK; ID=73505");
   }
 
   @Ignore("broken; [CALCITE-2115] is logged to fix it")
@@ -405,8 +406,8 @@
     assertModel(MODEL)
             .query("select count(*) from zips group by state order by 1")
             .limit(2)
-            .returns("EXPR$0=2\n"
-                    + "EXPR$0=2\n")
+            .returnsUnordered("EXPR$0=2",
+                    "EXPR$0=2")
             .queryContains(
                     mongoChecker(
                             "{$project: {STATE: '$state'}}",
@@ -420,8 +421,8 @@
     assertModel(MODEL)
             .query(
                     "select state, count(*) as c from zips group by state order by state")
-            .limit(2)
-            .returns("STATE=AK; C=3\nSTATE=AL; C=3\n")
+            .limit(3)
+            .returns("STATE=AK; C=3\nSTATE=AL; C=3\nSTATE=AR; C=3\n")
             .queryContains(
                     mongoChecker(
                             "{$project: {STATE: '$state'}}",
@@ -594,12 +595,13 @@
             .query("select state, count(distinct city) as cdc\n"
                     + "from zips\n"
                     + "group by state\n"
-                    + "order by cdc desc limit 5")
-            .returns("STATE=VA; CDC=3\n"
-                    + "STATE=NY; CDC=3\n"
-                    + "STATE=SC; CDC=3\n"
-                    + "STATE=RI; CDC=3\n"
-                    + "STATE=WV; CDC=3\n")
+                    + "order by cdc desc, state\n"
+                    + "limit 5")
+            .returns("STATE=AK; CDC=3\n"
+                    + "STATE=AL; CDC=3\n"
+                    + "STATE=AR; CDC=3\n"
+                    + "STATE=AZ; CDC=3\n"
+                    + "STATE=CA; CDC=3\n")
             .queryContains(
                     mongoChecker(
                             "{$project: {CITY: '$city', STATE: '$state'}}",
@@ -607,7 +609,7 @@
                             "{$project: {_id: 0, CITY: '$_id.CITY', STATE: '$_id.STATE'}}",
                             "{$group: {_id: '$STATE', CDC: {$sum: {$cond: [ {$eq: ['CITY', null]}, 0, 1]}}}}",
                             "{$project: {STATE: '$_id', CDC: '$CDC'}}",
-                            "{$sort: {CDC: -1}}",
+                            "{$sort: {CDC: -1, STATE: 1}}",
                             "{$limit: 5}"));
   }
 
@@ -628,9 +630,10 @@
   @Test public void testFilter() {
     assertModel(MODEL)
             .query("select state, city from zips where state = 'CA'")
-            .limit(2)
-            .returns("STATE=CA; CITY=LOS ANGELES\n"
-                    + "STATE=CA; CITY=BELL GARDENS\n")
+            .limit(3)
+            .returnsUnordered("STATE=CA; CITY=LOS ANGELES",
+                      "STATE=CA; CITY=BELL GARDENS",
+                      "STATE=CA; CITY=NORWALK")
             .explainContains("PLAN=MongoToEnumerableConverter\n"
                     + "  MongoProject(STATE=[CAST(ITEM($0, 'state')):VARCHAR(2) CHARACTER SET \"ISO-8859-1\" COLLATE \"ISO-8859-1$en_US$primary\"], CITY=[CAST(ITEM($0, 'city')):VARCHAR(20) CHARACTER SET \"ISO-8859-1\" COLLATE \"ISO-8859-1$en_US$primary\"])\n"
                     + "    MongoFilter(condition=[=(CAST(ITEM($0, 'state')):VARCHAR(2) CHARACTER SET \"ISO-8859-1\" COLLATE \"ISO-8859-1$en_US$primary\", 'CA')])\n"
@@ -642,15 +645,18 @@
    * ways around. */
   @Test public void testFilterReversed() {
     assertModel(MODEL)
-            .query("select state, city from zips where 'WI' < state")
-            .limit(2)
-            .returns("STATE=WV; CITY=BECKLEY\nSTATE=WV; CITY=ELM GROVE\n");
+            .query("select state, city from zips where 'WI' < state order by state, city")
+            .limit(3)
+            .returnsOrdered("STATE=WV; CITY=BECKLEY",
+                            "STATE=WV; CITY=ELM GROVE",
+                            "STATE=WV; CITY=STAR CITY");
 
     assertModel(MODEL)
-            .query("select state, city from zips where state > 'WI'")
-            .limit(2)
-            .returns("STATE=WV; CITY=BECKLEY\n"
-                    + "STATE=WV; CITY=ELM GROVE\n");
+            .query("select state, city from zips where state > 'WI' order by state, city")
+            .limit(3)
+            .returnsOrdered("STATE=WV; CITY=BECKLEY",
+                    "STATE=WV; CITY=ELM GROVE",
+                    "STATE=WV; CITY=STAR CITY");
   }
 
   /** MongoDB's predicates are handed (they can only accept literals on the
