diff --git a/client/src/test/java/org/asynchttpclient/ListenableFutureTest.java b/client/src/test/java/org/asynchttpclient/ListenableFutureTest.java
index 4095286..9721bbc 100644
--- a/client/src/test/java/org/asynchttpclient/ListenableFutureTest.java
+++ b/client/src/test/java/org/asynchttpclient/ListenableFutureTest.java
@@ -60,7 +60,7 @@
             future.get();
             future.addListener(() -> counter.decrementAndGet(), Runnable::run);
         }
-        assertEquals(0, counter.get());
+        assertEquals(counter.get(), 0);
     }
 
     @Test(groups = "standalone")
@@ -76,6 +76,6 @@
             future.get();
             future.addListener(() -> counter.decrementAndGet(), Runnable::run);
         }
-        assertEquals(0, counter.get());
+        assertEquals(counter.get(), 0);
     }
 }
