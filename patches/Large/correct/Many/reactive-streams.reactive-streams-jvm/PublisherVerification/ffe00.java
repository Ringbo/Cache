diff --git a/tck/src/main/java/org/reactivestreams/tck/PublisherVerification.java b/tck/src/main/java/org/reactivestreams/tck/PublisherVerification.java
index f078fed..eeb8448 100644
--- a/tck/src/main/java/org/reactivestreams/tck/PublisherVerification.java
+++ b/tck/src/main/java/org/reactivestreams/tck/PublisherVerification.java
@@ -633,7 +633,7 @@
       @Override public void run(Publisher<T> pub) throws Throwable {
         final ManualSubscriber<T> sub = env.newManualSubscriber(pub);
         sub.request(0);
-        sub.expectErrorWithMessage(IllegalStateException.class, "3.9"); // we do require implementations to mention the rule number at the very least
+        sub.expectErrorWithMessage(IllegalArgumentException.class, "3.9"); // we do require implementations to mention the rule number at the very least
       }
     });
   }
@@ -647,7 +647,7 @@
         final ManualSubscriber<T> sub = env.newManualSubscriber(pub);
         final Random r = new Random();
         sub.request(-r.nextInt(Integer.MAX_VALUE));
-        sub.expectErrorWithMessage(IllegalStateException.class, "3.9"); // we do require implementations to mention the rule number at the very least
+        sub.expectErrorWithMessage(IllegalArgumentException.class, "3.9"); // we do require implementations to mention the rule number at the very least
       }
     });
   }
