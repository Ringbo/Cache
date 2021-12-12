diff --git a/src/main/java/org/jabref/logic/importer/WebFetchers.java b/src/main/java/org/jabref/logic/importer/WebFetchers.java
index 56740d6..8025d16 100644
--- a/src/main/java/org/jabref/logic/importer/WebFetchers.java
+++ b/src/main/java/org/jabref/logic/importer/WebFetchers.java
@@ -91,7 +91,7 @@
         return list;
     }
 
-    public static ArrayList<IdFetcher> getIdFetchers() {
+    public static List<IdFetcher> getIdFetchers() {
         ArrayList<IdFetcher> list = new ArrayList<>();
         list.add(new CrossRef());
         list.sort(Comparator.comparing(WebFetcher::getName));
