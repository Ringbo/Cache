diff --git a/plugins/git4idea/src/git4idea/history/wholeTree/MediatorImpl.java b/plugins/git4idea/src/git4idea/history/wholeTree/MediatorImpl.java
index 82d6932..b7421d5 100644
--- a/plugins/git4idea/src/git4idea/history/wholeTree/MediatorImpl.java
+++ b/plugins/git4idea/src/git4idea/history/wholeTree/MediatorImpl.java
@@ -199,7 +199,7 @@
           }
         }));
       filters.setUseOnlyHashes(true);
-      myLoader.loadSkeleton(myTicket.copy(), rootsHolder, Collections.<String>emptyList(), filters, myController, false);
+      myLoader.loadSkeleton(myTicket.copy(), rootsHolder, Collections.<String>emptyList(), filters, myController, true);
     } else {
       myUIRefresh.finished();
       myTableWrapper.finished();
