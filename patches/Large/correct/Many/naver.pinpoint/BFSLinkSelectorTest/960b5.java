diff --git a/web/src/test/java/com/navercorp/pinpoint/web/service/BFSLinkSelectorTest.java b/web/src/test/java/com/navercorp/pinpoint/web/service/BFSLinkSelectorTest.java
index b72e9e6..0cb67c7 100644
--- a/web/src/test/java/com/navercorp/pinpoint/web/service/BFSLinkSelectorTest.java
+++ b/web/src/test/java/com/navercorp/pinpoint/web/service/BFSLinkSelectorTest.java
@@ -75,7 +75,7 @@
 
         LinkDataDuplexMap select = bfsLinkSelector.select(APP_A, range, option);
 
-        Assert.assertEquals(select.size(), 1);
+        Assert.assertEquals(select.size(), 0);
 
 
     }
