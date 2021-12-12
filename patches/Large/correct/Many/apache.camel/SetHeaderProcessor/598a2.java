diff --git a/camel-core/src/main/java/org/apache/camel/processor/SetHeaderProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/SetHeaderProcessor.java
index b5d9854..7604af8 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/SetHeaderProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/SetHeaderProcessor.java
@@ -59,7 +59,7 @@
 
             old.setHeader(headerName, newHeader);
 
-        } catch (Exception e) {
+        } catch (Throwable e) {
             exchange.setException(e);
         }
 
