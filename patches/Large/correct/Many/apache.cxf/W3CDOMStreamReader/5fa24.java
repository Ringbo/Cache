diff --git a/api/src/main/java/org/apache/cxf/staxutils/W3CDOMStreamReader.java b/api/src/main/java/org/apache/cxf/staxutils/W3CDOMStreamReader.java
index 606bdf3..eb4fa5b 100644
--- a/api/src/main/java/org/apache/cxf/staxutils/W3CDOMStreamReader.java
+++ b/api/src/main/java/org/apache/cxf/staxutils/W3CDOMStreamReader.java
@@ -414,7 +414,7 @@
             if (o instanceof Location) { 
                 return (Location)o;
             }
-        } catch (Exception ex) {
+        } catch (Throwable ex) {
             //ignore, probably not DOM level 3
         }
         return super.getLocation();
