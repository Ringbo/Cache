diff --git a/core/src/test/java/com/graphhopper/routing/RoutingAlgorithmIT.java b/core/src/test/java/com/graphhopper/routing/RoutingAlgorithmIT.java
index aac84d2..be369d8 100644
--- a/core/src/test/java/com/graphhopper/routing/RoutingAlgorithmIT.java
+++ b/core/src/test/java/com/graphhopper/routing/RoutingAlgorithmIT.java
@@ -62,7 +62,7 @@
         list.add(new OneRun(43.730729, 7.42135, 43.727697, 7.419199, 2581, 91));
         list.add(new OneRun(43.727687, 7.418737, 43.74958, 7.436566, 3586, 126));
         list.add(new OneRun(43.728677, 7.41016, 43.739213, 7.4277, 2560, 102));
-        list.add(new OneRun(43.733802, 7.413433, 43.739662, 7.424355, 2225, 105));
+        list.add(new OneRun(43.733802, 7.413433, 43.739662, 7.424355, 2227, 105));
         list.add(new OneRun(43.730949, 7.412338, 43.739643, 7.424542, 2101, 100));
         list.add(new OneRun(43.727592, 7.419333, 43.727712, 7.419333, 0, 1));
 
@@ -109,7 +109,7 @@
     {
         List<OneRun> list = createMonacoCar();
         list.get(0).locs = 95;
-        list.get(3).dist = 2274;
+        list.get(3).dist = 2276;
         list.get(3).locs = 107;
         list.get(4).dist = 2150;
         list.get(4).locs = 102;
@@ -155,7 +155,7 @@
         list.add(new OneRun(43.730729, 7.421288, 43.727687, 7.418737, 2535, 88));
         list.add(new OneRun(43.727687, 7.418737, 43.74958, 7.436566, 3585, 126));
         list.add(new OneRun(43.728677, 7.41016, 43.739213, 7.427806, 2569, 107));
-        list.add(new OneRun(43.733802, 7.413433, 43.739662, 7.424355, 2225, 105));
+        list.add(new OneRun(43.733802, 7.413433, 43.739662, 7.424355, 2227, 105));
         runAlgo(testCollector, "files/monaco.osm.gz", "target/graph-monaco",
                 list, "BIKE", true, "BIKE", "shortest");
         assertEquals(testCollector.toString(), 0, testCollector.errors.size());
@@ -164,7 +164,7 @@
     List<OneRun> createAndorra()
     {
         List<OneRun> list = new ArrayList<OneRun>();
-        list.add(new OneRun(42.56819, 1.603231, 42.571034, 1.520662, 17712, 446));
+        list.add(new OneRun(42.56819, 1.603231, 42.571034, 1.520662, 17710, 446));
         list.add(new OneRun(42.529176, 1.571302, 42.571034, 1.520662, 11411, 259));
         return list;
     }
