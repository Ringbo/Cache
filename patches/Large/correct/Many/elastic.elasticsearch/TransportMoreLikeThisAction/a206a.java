diff --git a/src/main/java/org/elasticsearch/action/mlt/TransportMoreLikeThisAction.java b/src/main/java/org/elasticsearch/action/mlt/TransportMoreLikeThisAction.java
index 5c02287..a7f2b2d 100644
--- a/src/main/java/org/elasticsearch/action/mlt/TransportMoreLikeThisAction.java
+++ b/src/main/java/org/elasticsearch/action/mlt/TransportMoreLikeThisAction.java
@@ -182,7 +182,7 @@
                     // exclude myself
                     Term uidTerm = docMapper.uidMapper().term(request.type(), request.id());
                     boolBuilder.mustNot(termQuery(uidTerm.field(), uidTerm.text()));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     listener.onFailure(e);
                     return;
                 }
@@ -336,7 +336,7 @@
                 public void onResponse(SearchResponse result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
