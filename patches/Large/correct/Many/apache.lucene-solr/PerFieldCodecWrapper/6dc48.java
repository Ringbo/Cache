diff --git a/lucene/src/java/org/apache/lucene/index/PerFieldCodecWrapper.java b/lucene/src/java/org/apache/lucene/index/PerFieldCodecWrapper.java
index fd033fe..69043e7 100644
--- a/lucene/src/java/org/apache/lucene/index/PerFieldCodecWrapper.java
+++ b/lucene/src/java/org/apache/lucene/index/PerFieldCodecWrapper.java
@@ -302,7 +302,7 @@
           if (next != null) {
             next.close();
           }
-        } catch (Exception ioe) {
+        } catch (IOException ioe) {
           // keep first IOException we hit but keep
           // closing the rest
           if (err == null) {
