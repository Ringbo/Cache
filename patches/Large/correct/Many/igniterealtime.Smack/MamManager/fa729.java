diff --git a/smack-experimental/src/main/java/org/jivesoftware/smackx/mam/MamManager.java b/smack-experimental/src/main/java/org/jivesoftware/smackx/mam/MamManager.java
index 3b90d1c..61fd861 100644
--- a/smack-experimental/src/main/java/org/jivesoftware/smackx/mam/MamManager.java
+++ b/smack-experimental/src/main/java/org/jivesoftware/smackx/mam/MamManager.java
@@ -995,7 +995,7 @@
         public List<Message> pagePrevious(int count) throws NoResponseException, XMPPErrorException,
                         NotConnectedException, NotLoggedInException, InterruptedException {
             RSMSet previousResultRsmSet = getPreviousRsmSet();
-            RSMSet requestRsmSet = new RSMSet(count, previousResultRsmSet.getLast(), RSMSet.PageDirection.before);
+            RSMSet requestRsmSet = new RSMSet(count, previousResultRsmSet.getFirst(), RSMSet.PageDirection.before);
             return page(requestRsmSet);
         }
 
