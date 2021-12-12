diff --git a/src/main/java/org/elasticsearch/search/action/SearchServiceTransportAction.java b/src/main/java/org/elasticsearch/search/action/SearchServiceTransportAction.java
index f3720ec..ecdd0be 100644
--- a/src/main/java/org/elasticsearch/search/action/SearchServiceTransportAction.java
+++ b/src/main/java/org/elasticsearch/search/action/SearchServiceTransportAction.java
@@ -106,7 +106,7 @@
             try {
                 DfsSearchResult result = searchService.executeDfsPhase(request);
                 listener.onResult(result);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
             }
         } else {
@@ -174,7 +174,7 @@
             try {
                 QuerySearchResult result = searchService.executeQueryPhase(request);
                 listener.onResult(result);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
             }
         } else {
@@ -208,7 +208,7 @@
             try {
                 ScrollQuerySearchResult result = searchService.executeQueryPhase(request);
                 listener.onResult(result.queryResult());
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
             }
         } else {
@@ -242,7 +242,7 @@
             try {
                 QueryFetchSearchResult result = searchService.executeFetchPhase(request);
                 listener.onResult(result);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
             }
         } else {
@@ -276,7 +276,7 @@
             try {
                 QueryFetchSearchResult result = searchService.executeFetchPhase(request);
                 listener.onResult(result);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
             }
         } else {
@@ -310,7 +310,7 @@
             try {
                 ScrollQueryFetchSearchResult result = searchService.executeFetchPhase(request);
                 listener.onResult(result.result());
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
             }
         } else {
@@ -412,7 +412,7 @@
             try {
                 ScrollQueryFetchSearchResult result = searchService.executeScan(request);
                 listener.onResult(result.result());
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(e);
             }
         } else {
