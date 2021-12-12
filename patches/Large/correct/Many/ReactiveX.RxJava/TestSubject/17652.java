diff --git a/rxjava-core/src/main/java/rx/subjects/TestSubject.java b/rxjava-core/src/main/java/rx/subjects/TestSubject.java
index af3a02f..7904886 100644
--- a/rxjava-core/src/main/java/rx/subjects/TestSubject.java
+++ b/rxjava-core/src/main/java/rx/subjects/TestSubject.java
@@ -83,7 +83,7 @@
                          */
                         lastNotification.get().accept(o);
                     }
-                });
+                }, null);
 
         return new TestSubject<T>(onSubscribe, subscriptionManager, lastNotification, scheduler);
     }
