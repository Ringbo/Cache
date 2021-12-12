diff --git a/store/src/main/java/com/alibaba/otter/canal/store/model/Event.java b/store/src/main/java/com/alibaba/otter/canal/store/model/Event.java
index edb4dd2..db1618e 100644
--- a/store/src/main/java/com/alibaba/otter/canal/store/model/Event.java
+++ b/store/src/main/java/com/alibaba/otter/canal/store/model/Event.java
@@ -71,8 +71,8 @@
             this.rawLength = rawEntry.size();
         } else {
             this.entry = entry;
-            // 按照3倍的event length预估
-            this.rawLength = entry.getHeader().getEventLength() * 3;
+            // 按照6倍的event length预估
+            this.rawLength = entry.getHeader().getEventLength() * 6;
         }
     }
 
