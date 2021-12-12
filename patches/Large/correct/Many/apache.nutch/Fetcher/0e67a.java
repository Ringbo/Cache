diff --git a/src/java/org/apache/nutch/fetcher/Fetcher.java b/src/java/org/apache/nutch/fetcher/Fetcher.java
index dbdf36b..1649938 100644
--- a/src/java/org/apache/nutch/fetcher/Fetcher.java
+++ b/src/java/org/apache/nutch/fetcher/Fetcher.java
@@ -972,7 +972,7 @@
     status = activeThreads + " threads, " +
       pages+" pages, "+errors+" errors, "
       + Math.round(((float)pages.get()*10)/elapsed)/10.0+" pages/s, "
-      + Math.round(((((float)bytes.get())*8)/1024)/elapsed)+" kb/s, ";
+      + Math.round(((((float)bytes.get())*8)/1000)/elapsed)+" kbits/s, ";
     reporter.setStatus(status);
   }
 
